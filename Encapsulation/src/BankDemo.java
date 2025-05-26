public class BankDemo {
//    public static void main(String[] args) {
//        BankAccountPublic acc = new BankAccountPublic();
//        acc.balance = 1000;       // Set initial balance
//        acc.balance -= 500;       // Withdraw 500
//        acc.balance += 9999;      // Deposit without validation
//        acc.balance = -10000;     // Dangerous overwrite
//        System.out.println("Balance: " + acc.balance);
//    }
//    public static void main(String[] args) {
//        BankAccountWithGetter acc = new BankAccountWithGetter();
//        acc.setBalance(1000);       // Set initial balance
//        acc.setBalance(acc.getBalance() - 500);       // Withdraw 500
//        acc.setBalance(acc.getBalance() + 9999);      // Deposit without validation
//        acc.setBalance(-10000);     // Dangerous overwrite
//        System.out.println("Balance: " + acc.getBalance());
//    }

    /**
     * Test the BankAccount class.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        // Deposit initial amount
        acc.deposit(1000);
        if (acc.withdraw(500)) {
            // Withdrawal succeeded
            System.out.println("Withdrawal succeeded. Balance: " + acc.getBalance());
        } else {
            // Withdrawal failed
            System.out.println("Withdrawal failed.");
        }
        // Attempt invalid deposit
        acc.deposit(-100);
        // Attempt withdrawal with insufficient funds
        acc.withdraw(2000);
    }
}
