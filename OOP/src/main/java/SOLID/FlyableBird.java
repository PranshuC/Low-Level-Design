package SOLID;

public abstract class FlyableBird extends Bird {

  public FlyableBird(Double weight, String colour, Double size, String beakType) {
    super(weight, colour, size, beakType);
  }

  public abstract void fly();
}
