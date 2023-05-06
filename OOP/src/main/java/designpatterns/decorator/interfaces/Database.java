package designpatterns.decorator.interfaces;

// Step 1 - Create product interface
public interface Database {

    public String read();
    public void write(String value);
}
