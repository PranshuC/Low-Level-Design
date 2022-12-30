package SOLID;

import SOLID.interfaces.Flyable;
import SOLID.strategies.FlyingBehaviour;

public class Sparrow extends Bird implements Flyable {
  // Depending on another concrete class
  //private GlidingBehaviour glidingBehaviour;
  // Instead we should depend on Interfaces
  private FlyingBehaviour flyingBehaviour;

  public Sparrow(Double weight, String colour, Double size, String beakType, FlyingBehaviour flyingBehaviour) {
    super(weight, colour, size, beakType);
    this.flyingBehaviour = flyingBehaviour;
  }

  @Override
  public void fly() {
    flyingBehaviour.fly();
  }

  @Override
  public void makeSound() {
    System.out.println("Sparrow chirps");
  }
}

// PROBLEM SOLVED
// Dependency Inversion - Instead of tightly coupling with 1 concrete class
// We are loosely coupled with interface (FlyingBehaviour)
// At runtime, we can pass GlidingBehaviour OR FlappingBehaviour as per expectations