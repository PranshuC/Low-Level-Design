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

}

// PROBLEM :
// Tying behaviour with hierarchy - Abstract classes (Flyable & NonFlyable)
// For another behaviour (swim), need permutations of classes for Swim & Fly
// SwimableFlyableBird - Swan
// NonSwimableFlyableBird - Eagle
// SwimableNonFlyableBird - Penguin
// NonSwimableNonFlyableBird - Ostrich
// But this isn't extendable for more behaviours