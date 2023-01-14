package designpatterns.prototype;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class GraphicalObjectTest {

  @Test
  public void testCloneObject() {

    // Step 3 - Create the prototype
    BackgroundObject prototype = new BackgroundObject(0, 0, 0, 0, BackgroundObjectType.TREE);

    // Step 4 - Clone the prototype to create a forest
    BackgroundObject clone = prototype.clone();
    assertNotNull("If clone method called, object shouldn't be null", clone);
    clone.setX(1);
    clone.setY(1);
    assertNotEquals("If cloned, prototype & clone objects shouldn't be same X", prototype.getX(),
        clone.getX());
    assertNotEquals("If cloned, prototype & clone objects shouldn't be same Y", prototype.getY(),
        clone.getY());

    // Create a forest
    List<BackgroundObject> forest  = new ArrayList<>();
    for(int i=1; i<1000; i++) {
      BackgroundObject treeClone = prototype.clone();
      treeClone.setX(new Random().nextInt());
      treeClone.setY(i);
      forest.add(treeClone);
    }
  }
}

// The setter fields can be done as parameters as well, if requirement is simple