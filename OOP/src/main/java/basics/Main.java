package basics;

public class Main {
    public static void main(String[] args) {
        BankAccount source = new BankAccount(1, "Alice", 500);
        BankAccount destination = new BankAccount(2, "Bob", 1000);

        System.out.println("Alice -> " + source.balance + ", Bob -> " + destination.balance);
        source.transfer(500, destination);
        System.out.println("Alice -> " + source.balance + ", Bob -> " + destination.balance);
    }
}