package Refactored.payments;

public class CreditCardPayment implements PaymentMethod {
    /**
     * Processes a payment via credit card.
     * <p>
     * This method simply prints a message to the console
     * indicating that the payment was made via credit card.
     *
     * @param amount the amount of the payment
     */
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}
