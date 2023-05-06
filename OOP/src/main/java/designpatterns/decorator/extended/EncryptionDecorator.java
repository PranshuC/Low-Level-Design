package designpatterns.decorator.extended;

import designpatterns.decorator.BaseDecorator;
import designpatterns.decorator.interfaces.Database;
import lombok.AllArgsConstructor;

// Step 4 - Implement concrete decorators
public class EncryptionDecorator extends BaseDecorator {

    public EncryptionDecorator(Database database) {
        super(database);
    }

    public String decrypt() {
        return super.read() + " - Decrypted";
    }

    public void encrypt(String value) {
        super.write("Encrypted " + value);
    }
}
