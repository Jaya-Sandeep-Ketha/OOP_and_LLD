package Refactored;

import Refactored.models.Cart;
import Refactored.models.Item;
import Refactored.payments.PayPalPayment;
import Refactored.payments.PaymentMethod;
import Refactored.users.RegisteredUser;
import Refactored.users.User;

public class Main {
    /**
     * Runs the checkout process.
     * @param args command line arguments (ignored)
     */
    public static void main(String[] args) {
        // Create a cart with two items: a keyboard and a mouse
        Cart cart = new Cart();
        cart.addItem(new Item("Keyboard", 45));
        cart.addItem(new Item("Mouse", 25));

        // Create a registered user and a PayPal payment method
        User user = new RegisteredUser("Sandeep");
        PaymentMethod payment = new PayPalPayment();

        // Create a checkout processor and process the order
        CheckoutProcessor processor = new CheckoutProcessor();
        processor.process(cart, payment, user);
    }
}
