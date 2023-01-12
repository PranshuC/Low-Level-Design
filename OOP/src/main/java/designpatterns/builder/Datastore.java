package designpatterns.builder;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Datastore {

  private String host;
  private Integer port;
  private String username;
  private String password;
  private Long id;
  private DatabaseType type;

  // Step 1 - Hide outer constructor
  private Datastore() {}

  // Add a static method to create Builder instance
  // Static Initializer
  public static DatastoreBuilder builder() {
    return new DatastoreBuilder();
  }

  // Step 2 - Create Builder class
  @Setter
  public static class DatastoreBuilder {

    // Step 3 - Copy all fields from outer class
    private String host;
    private Integer port;
    private String username;
    private String password;
    private Long id;
    private DatabaseType type;

    // Step 4 - Add fluent interfaces for setter
    public DatastoreBuilder withHost(String host) {
      this.host = host;
      return this;
    }
    public DatastoreBuilder withPort(Integer port) {
      this.port = port;
      return this;
    }
    // Customizable - Multiple fields in one method
    public DatastoreBuilder init(String host, Integer port) {
      this.port = port;
      return this;
    }
    public DatastoreBuilder ofType(DatabaseType type) {
      this.type = type;
      return this;
    }
    // Remove dependency from parameters : single-type methods
    public DatastoreBuilder mysql() {
      this.type = DatabaseType.MY_SQL;
      return this;
    }

    // Step 5 - Add a build hook
    public Datastore build() {
      // Add validation before creating datastore object
      boolean isValid = validate();
      if(!isValid)
          throw new RuntimeException("Object not valid!");

      Datastore datastore = new Datastore();
      datastore.host = host;
      datastore.port = port;
      datastore.username = username;
      datastore.password = password;
      datastore.id = id;
      datastore.type = type;
      return datastore;
    }

    private boolean validate() {
      if(type == null)
        return false;
      return true;
    }
  }
}

// We have setters on DatastoreBuilder, so Datastore object is still immutable
// Methods are on-demand : all need not be added for all objects

// Lombok @Builder helps with the design pattern directly!