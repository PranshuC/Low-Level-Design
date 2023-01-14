package designpatterns.registry;

import designpatterns.prototype.BackgroundObject;
import designpatterns.prototype.BackgroundObjectType;

import java.util.HashMap;
import java.util.Map;

public class BackgroundRegistry {

  private Map<BackgroundObjectType, BackgroundObject> registry = new HashMap<>();

  public void store(BackgroundObjectType type, BackgroundObject backgroundObject) {
    registry.put(type, backgroundObject);
  }

  public BackgroundObject get(BackgroundObjectType type) {
    return registry.get(type);
  }

}

// Prototype can be created at one time and clone can be requested at different time
// So, registry serves the purpose to get the object at required time.