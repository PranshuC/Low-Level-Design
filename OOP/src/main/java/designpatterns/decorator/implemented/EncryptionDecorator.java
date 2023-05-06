package designpatterns.decorator.implemented;

import designpatterns.decorator.interfaces.Database;
import lombok.AllArgsConstructor;

// Step 4 - Implement concrete decorators
@AllArgsConstructor
public class EncryptionDecorator implements Database {

    private Database database;

    @Override
    public String read() {
        String value = database.read();
        return decrypt(value);
    }

    private String decrypt(String value) {
        return value + " - Decrypted";
    }

    @Override
    public void write(String value) {
        String encrypted = encrypt(value);
        database.write(encrypted);
    }

    private String encrypt(String value) {
        return "Encrypted " + value;
    }
}
