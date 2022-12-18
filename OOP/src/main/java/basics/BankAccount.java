package basics;

public class BankAccount {

    // STATE
    public Integer id;
    public String name;
    public Integer balance;

    public BankAccount(Integer id, String name, Integer balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // BEHAVIOUR
    public void debit(Integer amount) {
        this.balance -= amount;
    }

    public void credit(Integer amount) {
        this.balance += amount;
    }

    public void transfer(Integer amount, BankAccount destination) {
        this.debit(amount);
        destination.credit(amount);
    }
}

// 2 BankAccount objects
// Alice - BankAccount(1, "Alice", 500)
// Bob - BankAccount(2, "Bob", 1000)
// Alice.debit(500)
