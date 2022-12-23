package SOLID;

public class Sparrow extends Bird {

  public Sparrow(Double weight, String colour, Double size, String beakType) {
    super(weight, colour, size, beakType);
  }

  @Override
  public void fly() {
    System.out.println("Sparrow is flying");
  }
}
