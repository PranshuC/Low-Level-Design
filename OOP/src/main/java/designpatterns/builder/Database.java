package designpatterns.builder;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;
import java.util.Objects;

@NoArgsConstructor
@Getter
@Setter
public class Database {

  private String host;
  private Integer port;
  private String username;
  private String password;
  private Long id;
  private DatabaseType type;

  public Database(String host, Integer port, String username, String password, Long id, DatabaseType type) {
    this.host = host;
    // Only possible validation is throw Exception
    if(port > 20000) {
      throw new RuntimeException("Invalid port");
    }
    this.port = port;
    this.username = username;
    this.password = password;
    this.id = id;
    this.type = type;
  }

  /*public Database(String host, Integer port, DatabaseType type) {
    new Database(host, port, null, null, null, type);
  }

  public Database(DatabaseType type) {
    new Database(null, null, type);
  }*/

  // Try & make a generic constructor
  public Database(Map<String, Object> values) {
    this.host = (String) values.get("host");
    this.port = (Integer) values.get("port");
    this.type = (DatabaseType) values.get("type");
  }
}

// But validation of fields should happen before constructing the object
// Also, expectation that validation will be done by programmer everytime constructor called - wrong
// - The static value for condition check can change : not feasible to change everywhere everytime

// Telescoping Constructor anti-pattern : above constructors narrowed like telescope
// Dependency of next constructor on previous
// If there's design change to remove 1 field, it'll impact all equivalently

// Using Setters can be complex - many fields to be updated
// Also, mutabiliy can cause its own issues.

// Using map of values of different fields, runner class may not be aware of the possible keys
// Also, typecasting may fail with Object in value [Java - strongly typed language]