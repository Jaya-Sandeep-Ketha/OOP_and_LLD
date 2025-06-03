package Refactored.users;

public class RegisteredUser extends User {
    public RegisteredUser(String name) {
        super(name);
    }

    /**
     * Registered users get a 10% discount on all items.
     * @param amount the amount to be discounted
     * @return the discounted amount
     */
    @Override
    public double applyDiscount(double amount) {
        // 10% discount
        return amount * 0.9;
    }
}
