package SOLID;

import SOLID.interfaces.Flyable;

public class Parrot extends Bird implements Flyable {

  public Parrot(Double weight, String colour, Double size, String beakType) {
    super(weight, colour, size, beakType);
  }

  @Override
  public void fly() {
    System.out.println("Parrot is flying");
  }

  @Override
  public void makeSound() {
    System.out.println("Parrot speaks");
  }
}
