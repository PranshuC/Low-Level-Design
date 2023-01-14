package designpatterns.registry;

import designpatterns.prototype.BackgroundObject;
import designpatterns.prototype.BackgroundObjectType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class BackgroundObjectTest {

  private BackgroundRegistry registry;

  // Set-up method : runs before eb=very test case : @Before
  @Before
  public void setUp() {
    // Create Registry
    registry = new BackgroundRegistry();
    // Create a prototype
    BackgroundObject treeProto = new BackgroundObject(0, 0, 0, 0, BackgroundObjectType.TREE);
    registry.store(BackgroundObjectType.TREE, treeProto);
  }

  // Tear-down : runs after every test case : @After
  @After
  public void tearDown() {
    registry = null;
  }

  @Test
  public void testPrototypeWithRegistry() {
    // Get tree prototype
    BackgroundObject prototype = registry.get(BackgroundObjectType.TREE);
    assertNotNull("If prototype was created, object should not be null", prototype);

    // Clone object
    BackgroundObject clone = prototype.clone();
    clone.setX(new Random().nextInt());
    clone.setY(new Random().nextInt());
    assertNotEquals("If cloned, prototype & clone objects shouldn't be same X", prototype.getX(),
        clone.getX());
    assertNotEquals("If cloned, prototype & clone objects shouldn't be same Y", prototype.getY(),
        clone.getY());
  }
}
