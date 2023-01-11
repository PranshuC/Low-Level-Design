package designpatterns.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ConnectionPoolTest {

  @Test
  public void testSingletonLazyLoading() {
    ConnectionPoolLL connectionPool = ConnectionPoolLL.getInstance();
    assertNotNull("If getInstance is called, instance should not be null", connectionPool);

    ConnectionPoolLL connectionPool2 = ConnectionPoolLL.getInstance();
    assertEquals("If getInstance is called twice, it should return same ConnectionPool",
        connectionPool, connectionPool2);
  }

  @Test
  public void testSingletonEagerInstantiation() {
    ConnectionPoolEI connectionPool = ConnectionPoolEI.getInstance();
    assertNotNull("If getInstance is called, instance should not be null", connectionPool);

    ConnectionPoolEI connectionPool2 = ConnectionPoolEI.getInstance();
    assertEquals("If getInstance is called twice, it should return same ConnectionPool",
        connectionPool, connectionPool2);
  }
}
