import java.util.ArrayList;

public class WrapperClassExamples {
    public static void main(String[] args) {
        // Autoboxing: primitive to wrapper
        int a = 10;
        Integer obj = a;  // int -> Integer

        // Unboxing: wrapper to primitive
        Integer obj2 = 20;
        int b = obj2;  // Integer -> int

        // Using wrappers with collections
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);   // autoboxing: int -> Integer
        numbers.add(15);

        // Accessing
        int num = numbers.get(0); // unboxing: Integer -> int

        System.out.println(obj2.byteValue());

        System.out.println("Autoboxed value: " + obj);
        System.out.println("Unboxed value: " + b);
        System.out.println("From ArrayList: " + num);
    }
}
