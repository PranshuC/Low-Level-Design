package SOLID.abstractclasses;

import SOLID.Bird;

public abstract class NonFlyableBird extends Bird {

  public NonFlyableBird(Double weight, String colour, Double size, String beakType) {
    super(weight, colour, size, beakType);
  }
}
