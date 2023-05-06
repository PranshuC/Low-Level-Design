package designpatterns.decorator;

import designpatterns.decorator.implemented.CompressionDecorator;
import designpatterns.decorator.implemented.EncryptionDecorator;
import designpatterns.decorator.interfaces.Database;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseTest {

    private Database database = null;

    @Before
    public void setUp() {
        database = new SimpleDatabase();
    }

    @Test
    public void testBase() {
        Database simple = new BaseDecorator(database);
        assertEquals("If base datasource is used, it should return Base", "Base", simple.read());
    }

    @Test
    public void testCompression() {
        Database compressed = new CompressionDecorator(database);
        assertEquals("If compressed datasource is used, it should return Compression", "Base - Decompressed",
                compressed.read());
    }

    @Test
    public void testEncryption() {
        Database encrypted = new EncryptionDecorator(database);
        assertEquals("If encrypted datasource is used, it should return Encryption", "Base - Decrypted",
                encrypted.read());
    }

    @Test
    public void testCompressionAndEncryption() {
        Database db = new CompressionDecorator(new EncryptionDecorator(database));
        assertEquals("If encrypted & compressed datasource is used, it should return Encryption & Compression",
                "Base - Decrypted - Decompressed", db.read());
    }
}

// Problem 1 - Use BaseDecorator for creating decorators instead of product interface
// Problem 2 - Implement Communicator use case for Decorator Design Pattern