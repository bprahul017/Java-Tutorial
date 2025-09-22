package Polymorphism;

class MathUtils {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloaded {
    public static void main(String[] args) {
        MathUtils obj = new MathUtils();
        System.out.println(obj.add(5, 10));       // calls int version
        System.out.println(obj.add(5.5, 2.3));    // calls double version
    }
}
