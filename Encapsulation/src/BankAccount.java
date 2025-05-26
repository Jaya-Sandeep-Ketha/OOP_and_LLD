public class BankAccount {
    private double balance;
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit.");
            return;
        }
        balance += amount;
    }
    public boolean withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return false;
        }
        balance -= amount;
        return true;
    }
    public double getBalance() {
        return balance; // For display/log only
    }
}
