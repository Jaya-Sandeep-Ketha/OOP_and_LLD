package Refactored.models;

public class Item {
    private final String name;
    private final double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Returns the price of the item.
     * @return the price of the item
     */
    public double getPrice() { return price; }
    /**
     * Returns the name of the item.
     * @return the name of the item
     */
    public String getName() { return name; }
}
