class PizzaCategory {
    String size;
    int toppings;

    // Default constructor
    PizzaCategory() {
        size = "Medium";
        toppings = 0;
    }

    // Constructor with one parameter
    PizzaCategory(String s) {
        size = s;
        toppings = 0;
    }

    // Constructor with two parameters
    PizzaCategory(String s, int t) {
        size = s;
        toppings = t;
    }
}

public class Pizza {
    public static void main(String[] args) {
        PizzaCategory pizza1 = new PizzaCategory();            // calls default constructor
        PizzaCategory pizza2 = new PizzaCategory("Large");     // calls 1-parameter constructor
        PizzaCategory pizza3 = new PizzaCategory("Small", 2);  // calls 2-parameter constructor

        System.out.println(pizza1.size);
        System.out.println(pizza2.size);
        System.out.println(pizza3.size + " with " + pizza3.toppings + " toppings");
    }
}
