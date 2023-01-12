package designpatterns.builder;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DatabaseTest {

  @Test
  public void testConstructor() {
    Database database = new Database("localhost", 4533, "password", "username", 1L, DatabaseType.MY_SQL);
    assertNotNull("If constructor called, object should not be null", database);
  }

  @Test(expected = RuntimeException.class)
  public void testInvalidPort() {
    Database database = new Database("localhost", 20001, "username", "password", 2L, DatabaseType.MY_SQL);
  }

  @Test
  public void testSetters() {
    Database database = new Database();
    database.setHost("localhost");
    database.setPort(4553);
    assertEquals("Host should be localhost", "localhost", database.getHost());
  }

  @Test
  public void testHashMapConstructor() {
    Map<String, Object> values = new HashMap<>();
    values.put("host", "localhost");
    values.put("port", 4453);
    values.put("type", DatabaseType.POSTGRES);
    Database database = new Database(values);
    assertEquals("Host should match localhost", "localhost", database.getHost());
    assertEquals("Database Type should match POSTGRES", DatabaseType.POSTGRES, database.getType());
  }
}
