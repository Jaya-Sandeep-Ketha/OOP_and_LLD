public class Customer {
    private BankAccount account = new BankAccount();
    public boolean hasSufficientBalance(double amount) {
        return account.getBalance() >= amount;
    }
    public boolean makePurchase(double amount) {
        return account.withdraw(amount);
    }
}
