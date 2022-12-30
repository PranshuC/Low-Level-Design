package SOLID.strategies;

public class FlappingBehaviour implements FlyingBehaviour {

  @Override
  public void fly() {
    System.out.println("Bird is flapping");
  }
}
