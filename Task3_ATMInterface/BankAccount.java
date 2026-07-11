public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return false;
        }

        if (amount > balance) {
            System.out.println("Insufficient Balance.");
            return false;
        }

        balance -= amount;
        return true;
    }

    public boolean deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return false;
        }

        balance += amount;
        return true;
    }
}
