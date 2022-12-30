package SOLID.strategies;

public class GlidingBehaviour implements FlyingBehaviour {

  @Override
  public void fly() {
    System.out.println("Bird is gliding");
  }
}
