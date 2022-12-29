package SOLID;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Bird {
  // Step 1 - Add attributes
  private Double weight;
  private String colour;
  private Double size;
  private String beakType;

  // Step 2 - Add behaviours
  public abstract void makeSound();

}

// PROBLEM SOLVED :
// Multiple interfaces can be implemented, hence multiple behaviours acquired separately
// Swimable & Flyable interfaces have swim() & fly() behaviours respectively
// But everyone extends Bird class for common attributes
// Now, Liskov Substitution can work with Flyable interface objects