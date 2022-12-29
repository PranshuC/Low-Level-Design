package SOLID;

import org.junit.Test;

import java.util.List;

public class BirdTest {

  @Test
  public void testRelease() {
    List<FlyableBird> birds = List.of(new Sparrow(null, null, null, null),
        new Sparrow(null, null, null, null));
    releaseAll(birds);
  }

  public void releaseAll(List<FlyableBird> birds) {
    birds.forEach(FlyableBird::fly);
  }

  public void release(List<Bird> birds) {
  }

}
