package Refactored;

import Refactored.models.Cart;
import Refactored.payments.PaymentMethod;
import Refactored.users.User;

public class CheckoutProcessor {
    /**
     * Process the checkout for a given cart, payment method and user.
     *
     * @param cart the cart to be checked out
     * @param payment the payment method to be used
     * @param user the user who is checking out
     */
    public void process(Cart cart, PaymentMethod payment, User user) {
        // Calculate the total discount that the user is eligible for
        double total = user.applyDiscount(cart.calculateTotal());

        // Pay the discounted amount
        payment.pay(total);

        // Print out the order placed message with the user's name
        System.out.println("Order placed by " + user.getName());
    }
}
