package Messy;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.items.add(new Item() {{ name = "Mouse"; price = 25.0; }});
        cart.items.add(new Item() {{ name = "Keyboard"; price = 45.0; }});

        User user1 = new User("Sandeep", "registered");
        cart.checkout("paypal", user1);

        cart.items.clear();
        cart.items.add(new Item() {{ name = "Mouse"; price = 25.0; }});
        cart.items.add(new Item() {{ name = "Keyboard"; price = 45.0; }});

        User user2 = new User("Jaya", "guest");
        cart.checkout("credit", user2);

    }
}
