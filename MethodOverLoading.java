public class MethodOverLoading {
    public static void main(String[] args) {
        // Overloaded methods being called
        System.out.println(add(5, 10));           // Calls int version
        System.out.println(add(5.5, 10.5));       // Calls double version
        System.out.println(add("Hello", "World")); // Calls String version
        System.out.println(add(1,"Rahul"));
    }

    // Method 1: Add integers
    static int add(int a, int b) {
        return a + b;
    }

    // Method 2: Add doubles
    static double add(double a, double b) {
        return a + b;
    }

    // Method 3: Concatenate strings
    static String add(String a, String b) {
        return a + " " + b;
    }

    // Method 4: concat String and numbber
    static String add(int a, String b) {
        return a + " " + b;
    }
}
