package SOLID;

import SOLID.interfaces.Swimable;

public class Penguin extends Bird implements Swimable {

  public Penguin(Double weight, String colour, Double size, String beakType) {
    super(weight, colour, size, beakType);
  }

  @Override
  public void makeSound() {
    System.out.println("Penguin calls");
  }

  @Override
  public void swim() {
    System.out.println("Penguins can swim");
  }
}