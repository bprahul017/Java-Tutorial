
class DomesticAnimals {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends DomesticAnimals {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverrriding {
    public static void main(String[] args) {
        DomesticAnimals a = new Dog(); // Upcasting
        a.sound();  // Output: Dog barks (runtime decision)
    }
}
