package SOLID;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

@Getter
@AllArgsConstructor
public abstract class Bird {
  // Step 1 - Add attributes
  private Double weight;
  private String colour;
  private Double size;
  private String beakType;

  // Step 2 - Add behaviours
  public abstract void fly();
}

// PROBLEMS SOLVED :
// 1. For new bird added, Bird class need not be opened : Open-Close Principle
// 2. Only for new behaviour, modify this class : Single Responsibility Principle