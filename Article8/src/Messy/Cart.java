package Messy;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    public List<Item> items = new ArrayList<>();
    public double total;

    /**
     * Check out the items in the cart with the given payment method and user.
     * This method applies the user's discount and then pays the total using the
     * specified payment method.
     * @param paymentMethod the payment method to be used
     * @param user the user who is checking out
     */
    public void checkout(String paymentMethod, User user) {
        double total = 0;

        for (Item item : items) {
            total += item.price;
        }

        // Apply user discount
        if (user.type.equals("registered")) {
            total = total * 0.9; // 10% discount
        } else if (user.type.equals("guest")) {
            // no discount
        } else {
            System.out.println("Unknown user type");
        }

        // Process payment
        if (paymentMethod.equals("credit")) {
            System.out.println("Paid $" + total + " via Credit Card.");
        } else if (paymentMethod.equals("paypal")) {
            System.out.println("Paid $" + total + " via PayPal.");
        } else {
            System.out.println("Unsupported payment method");
        }

        System.out.println("Order placed!");
    }
}
