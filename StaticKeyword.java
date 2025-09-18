
class Bread {
    String size;
    int toppings;

    // Default constructor
    Bread() {
        size = "Medium";
        toppings = 0;
    }

    // Constructor with one parameter
    Bread(String s) {
        size = s;
        toppings = 0;
    }

    // Constructor with two parameters
    Bread(String s, int t) {
        size = s;
        toppings = t;
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        Bread pizza1 = new Bread();            // calls default constructor
        Bread pizza2 = new Bread("Large");     // calls 1-parameter constructor
        Bread pizza3 = new Bread("Small", 2);  // calls 2-parameter constructor

        System.out.println(pizza1.size);
        System.out.println(pizza2.size);
        System.out.println(pizza3.size + " with " + pizza3.toppings + " toppings");
    }
}

