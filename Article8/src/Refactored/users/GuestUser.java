package Refactored.users;

public class GuestUser extends User {
    public GuestUser(String name) {
        super(name);
    }
    /**
     * Guest users don't get any discounts.
     *
     * @param amount the amount to be discounted
     * @return the amount with no discount
     */
    @Override
    public double applyDiscount(double amount) {
        // Guest users don't get any discounts
        return amount;
    }
}
