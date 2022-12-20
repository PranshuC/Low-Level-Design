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

  // Method overloading
  // Method signature:
  // 1. Method name
  // 2. # of args
  // 3. Data type of args
  public void printInfo() {
  }

  public void printInfo(String title) {
    System.out.println(" \n User: " + title + " " + this.getName());
  }
}
