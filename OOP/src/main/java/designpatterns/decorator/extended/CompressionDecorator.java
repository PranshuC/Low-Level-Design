package designpatterns.decorator.extended;

import designpatterns.decorator.BaseDecorator;
import designpatterns.decorator.interfaces.Database;
import lombok.AllArgsConstructor;

public class CompressionDecorator extends BaseDecorator {


    public CompressionDecorator(Database database) {
        super(database);
    }

    public String decompress() {
        return super.read() + " - Decompressed";
    }

    public void compress(String value) {
        super.write("Compressed " + value);
    }
}
