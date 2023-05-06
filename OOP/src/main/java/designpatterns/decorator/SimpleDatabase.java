package designpatterns.decorator;

import designpatterns.decorator.interfaces.Database;

// Step 2 - Base product implementations
public class SimpleDatabase implements Database {

    @Override
    public String read() {
        return "Base";
    }

    @Override
    public void write(String value) {
        System.out.println(value);
    }
}
