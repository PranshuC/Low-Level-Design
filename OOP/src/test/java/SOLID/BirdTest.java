package SOLID;

import SOLID.interfaces.Flyable;
import SOLID.strategies.FlappingBehaviour;
import SOLID.strategies.GlidingBehaviour;
import org.junit.Test;

import java.util.List;

public class BirdTest {

  @Test
  public void testRelease() {
    List<Flyable> birds = List.of(new Parrot(null, null, null, null),
        new Sparrow(null, null, null, null, new GlidingBehaviour()),
        new Sparrow(null, null, null, null, new FlappingBehaviour()));
    releaseAll(birds);
  }

  public void releaseAll(List<Flyable> birds) {
    birds.forEach(Flyable::fly);
  }

  public void release(List<Bird> birds) {
  }

}
