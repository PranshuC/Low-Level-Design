package designpatterns.decorator;

import designpatterns.decorator.interfaces.Database;
import lombok.AllArgsConstructor;

// Step 3 - Create base decorator implementing product interfaces
@AllArgsConstructor
public class BaseDecorator implements Database {

    private Database database;

    @Override
    public String read() {
        return database.read();
    }

    @Override
    public void write(String value) {
        database.write(value);
    }
}
