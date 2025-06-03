package Refactored.payments;

public class PayPalPayment implements PaymentMethod {
    /**
     * Processes the payment through PayPal.
     * @param amount the amount of money to charge to the user's PayPal account
     */
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}
