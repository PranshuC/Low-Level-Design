package SOLID;

public class Parrot extends FlyableBird {

  public Parrot(Double weight, String colour, Double size, String beakType) {
    super(weight, colour, size, beakType);
  }

  @Override
  public void fly() {
    System.out.println("Parrot is flying");
  }
}
