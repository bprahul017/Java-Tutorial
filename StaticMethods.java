class MathUtil {
    static int square(int x) {
        return x * x;
    }
}

public class StaticMethods {
    public static void main(String[] args) {
        System.out.println(MathUtil.square(5)); // No object needed
    }
}
