package inheritance;

import lombok.AllArgsConstructor;
import lombok.Getter;

// Parent class
@Getter
@AllArgsConstructor
public class User {

  private String name;
  private String email;

  public void changeEmail(String email) {
    this.email = email;
  }
}
