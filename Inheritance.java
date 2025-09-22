// Parent class
class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

// Child class
class Cars extends Vehicle {
    void honk() {
        System.out.println("Car honks");
    }
}

// Main class
public class Inheritance {
    public static void main(String[] args) {
        Cars myCar = new Cars();
        myCar.start();  // Inherited method
        myCar.honk();   // Child method
    }
}
