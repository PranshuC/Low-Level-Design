package designpatterns.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// Step 2 - Create concrete class
@AllArgsConstructor
@Setter
@Getter
public class BackgroundObject implements GraphicalObject {

  private int x;
  private int y;
  private int height;
  private int width;
  private BackgroundObjectType type;
  //private List<Integer> pixels = new ArrayList<>();

  // Step 2.5 - Implemented the clone method
  @Override
  public BackgroundObject clone() {
    return new BackgroundObject(x, y, height, width, type);
  }
}

// Clone is deep copy, .copy() is shallow copy