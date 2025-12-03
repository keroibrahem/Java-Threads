package Task1;

public class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }
    
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public synchronized void deposit(double amount) {
        balance += amount;
        notify();
    }
    public synchronized void withdraw(double amount) throws InterruptedException {
        while (balance < amount) {
            wait();
        }
        balance -= amount;
    }
    
}
