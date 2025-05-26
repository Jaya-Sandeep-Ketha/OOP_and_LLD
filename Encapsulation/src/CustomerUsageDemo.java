public class CustomerUsageDemo {
//    public static void main(String[] args) {
//        Customer customer = new Customer();
//        double amount = 200;
//        if(customer.getAccount().getBalance()>=amount) {
//            customer.getAccount().withdraw(amount);
//        }
//    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        double amount = 200;
        if(customer.hasSufficientBalance(amount)) {
            customer.makePurchase(amount);
        }
    }
}
