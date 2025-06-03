package Refactored.payments;

public interface PaymentMethod {
    /**
     * Makes a payment of the given amount using the underlying payment method.
     * @param amount the amount to be paid
     */
    void pay(double amount);
}
