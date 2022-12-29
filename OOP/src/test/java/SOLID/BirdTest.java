package SOLID;

import SOLID.interfaces.Flyable;
import org.junit.Test;

import java.util.List;

public class BirdTest {

  @Test
  public void testRelease() {
    List<Flyable> birds = List.of(new Sparrow(null, null, null, null),
        new Sparrow(null, null, null, null));
    releaseAll(birds);
  }

  public void releaseAll(List<Flyable> birds) {
    birds.forEach(Flyable::fly);
  }

  public void release(List<Bird> birds) {
  }

}
