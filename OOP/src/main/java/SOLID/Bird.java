package SOLID;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Bird {
  // Step 1 - Add attributes
  private Double weight;
  private String colour;
  private Double size;
  private String beakType;
  private BirdType type;

  // Step 2 - Add behaviours
  public void fly() {
    switch (type) {
      case SPARROW:
        System.out.println("Sparrow is flying");
        break;
      case PARROT:
        System.out.println("Parrot is flying");
        break;
      case PENGUIN:
        System.out.println("Pigeon is not flying");
        break;
    }
    throw new RuntimeException("Invalid bird type : " + type);
  }
}

// PROBLEMS :
// 1. Change in behaviour of existing bird needs method modification
// 2. Any new addition of bird needs method modification
// 3. Merge conflict between 2 developers : updating different switch-case