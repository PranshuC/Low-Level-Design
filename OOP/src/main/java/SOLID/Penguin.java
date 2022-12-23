package SOLID;

public class Penguin extends Bird {

  public Penguin(Double weight, String colour, Double size, String beakType) {
    super(weight, colour, size, beakType);
  }

  @Override
  public void fly() {
    System.out.println("Penguin is not flying");
  }
}
