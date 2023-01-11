package designpatterns.singleton;

// Lazy Loading - Cold Start
public class ConnectionPoolLL {

  // Step 3 - Instance variable
  private static ConnectionPoolLL instance;

  // Step 1 - Hide the constructor
  private ConnectionPoolLL() {}

  // Step 2 - Global access point
  // static confirms method that is part of a class rather than an instance of that class
  // synchronized method - performance issues : 1 thread able to get instance at a time
  public static ConnectionPoolLL getInstance() {
    // Step 4 - If present, return. Else; create, set & return
    // Double-checked locking
    if(instance == null) {
      synchronized (ConnectionPoolLL.class) {
        // First time, if 2 threads come in synchronized block
        // need another null check to avoid instance re-creation
        if (instance == null) {
          instance = new ConnectionPoolLL();
        }
      }
    }
    return instance;
  }

  // Even after double checks, cloning can break Singleton
  // .clone() -> create copy of same object, So :
  @Override
  protected Object clone() throws CloneNotSupportedException {
    throw new CloneNotSupportedException();
  }
}
