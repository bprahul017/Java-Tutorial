class Counter {
    static int count = 0; // static variable

    Counter() {
        count++;
        System.out.println("Object created. Count = " + count);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();
    }
}
