package designpatterns.singleton;

// Eager Instantiation
public class ConnectionPoolEI {
  // Step 3 - Instance variable
  // Step 4 - Object created in advance and ready to use
  // No Double-checked locking - instance created when class loaded
  private static ConnectionPoolEI instance = new ConnectionPoolEI();

  // Step 1 - Hide the constructor
  private ConnectionPoolEI() {}

  // Step 2 - Global access point
  // static confirms method that is part of a class rather than an instance of that class
  public static ConnectionPoolEI getInstance() {
    return instance;
  }
}
