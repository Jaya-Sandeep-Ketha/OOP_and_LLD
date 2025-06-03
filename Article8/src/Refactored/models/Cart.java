package Refactored.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cart {
    private final List<Item> items = new ArrayList<>();

    /**
     * Adds an item to the cart.
     *
     * @param item the item to be added to the cart
     */
    public void addItem(Item item) {
        // Add the specified item to the list of items in the cart
        items.add(item);
    }

    /**
     * Calculates the total cost of all items in the cart.
     *
     * @return the total cost of all items in the cart
     */
    public double calculateTotal() {
        // Calculate the total cost of all items in the cart
        // by summing up all the prices of the items in the cart
        return items.stream().mapToDouble(Item::getPrice).sum();
    }

    /**
     * Returns an unmodifiable list of all items in the cart.
     *
     * @return an unmodifiable list of all items in the cart
     */
    public List<Item> getItems() {
        // Return an unmodifiable list of all items in the cart
        return Collections.unmodifiableList(items);
    }
}
