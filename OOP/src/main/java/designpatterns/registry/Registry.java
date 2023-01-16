package designpatterns.registry;

import designpatterns.prototype.BackgroundObject;
import designpatterns.prototype.BackgroundObjectType;

import java.util.HashMap;
import java.util.Map;

public class Registry<ENTITY_TYPE, ENTITY> {

  private Map<ENTITY_TYPE, ENTITY> registry = new HashMap<>();

  public void store(ENTITY_TYPE type, ENTITY backgroundObject) {
    registry.put(type, backgroundObject);
  }

  public ENTITY get(ENTITY_TYPE type) {
    return registry.get(type);
  }
}

// Java Generics used to make the class dynamic