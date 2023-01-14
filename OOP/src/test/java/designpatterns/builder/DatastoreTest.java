package designpatterns.builder;

import designpatterns.builder.Datastore.DatastoreBuilder;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DatastoreTest {

  @Test
  public void testBuilder() {
    // Unable to call constructor
    //Datastore datastore = new Datastore();

    /*DatastoreBuilder builder = Datastore.builder();
    builder.setHost("localhost");
    builder.setPort(4453);
    builder.setType(DatabaseType.MONGO);
    Datastore datastore = builder.build();*/

    // Better looking
    Datastore datastore = Datastore
        .builder()
        .withHost("localhost")
        //.ofType(DatabaseType.MONGO)
        .mysql()
        .build();
    assertEquals("Host should match localhost", "localhost", datastore.getHost());
    assertEquals("Database Type should match MySQL", DatabaseType.MY_SQL, datastore.getType());
  }

  @Test(expected = RuntimeException.class)
  public void testBuilderWithNoType() {
    Datastore.builder().build();
    // Test failed below - DatabaseType present
    //Datastore.builder().mysql().build();
  }

}
