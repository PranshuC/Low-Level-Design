package designpatterns.decorator.implemented;

import designpatterns.decorator.interfaces.Database;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CompressionDecorator implements Database {

    private Database database;
    @Override
    public String read() {
        String value = database.read();
        return decompress(value);
    }

    private String decompress(String value) {
        return value + " - Decompressed";
    }

    @Override
    public void write(String value) {
        database.write(compress(value));
    }

    private String compress(String value) {
        return "Compressed " + value;
    }
}
