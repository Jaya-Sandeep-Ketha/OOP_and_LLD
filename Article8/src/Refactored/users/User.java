package Refactored.users;

public abstract class User {
    public String name;

    public User(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the user.
     * @return the name of the user
     */
    public String getName() {
        return name;
    }

    /**
     * Calculates the discount for the user based on the given amount.
     *
     * @param amount the amount to be discounted
     * @return the discounted amount
     */
    public abstract double applyDiscount(double amount);
}
