final class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// class Dog extends Animal {} ❌ Error: cannot inherit from final class

public class Animals {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();
    }
}