package SOLID;

import SOLID.interfaces.Flyable;
import SOLID.interfaces.Swimable;

public class Swan extends Bird implements Flyable, Swimable {

  public Swan(Double weight, String colour, Double size, String beakType) {
    super(weight, colour, size, beakType);
  }

  @Override
  public void makeSound() {
    System.out.println("Swan quacks");
  }

  @Override
  public void fly() {
    System.out.println("Swan can fly");
  }

  @Override
  public void swim() {
    System.out.println("Swan can swim");
  }
}
