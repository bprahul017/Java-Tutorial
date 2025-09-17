public class Maths {
    // max-min
    public static void maxValue(double x, double y) {

        double maxVal = Math.max(x,y);
        double minVal = Math.min(x,y);

        System.out.println("Highest Value= "+maxVal);
        System.out.println("Lowest Value="+minVal);
    }

    // find abs
    public static void findAbs(double a){
        double b = Math.abs(a);

        System.out.println("Absolute Value= "+b);
    }

    // find square root
    public static void findSqrt(double a){
        double b = Math.sqrt(a);

        System.out.println("Square Root of " +a+" e= "+b);
    }

    // find round of
    public static void findRoundOff(double a){
        long b = Math.round(a);

        System.out.println("Round off ="+b);
    }

    // find ceil
    public static void findCeil(double a){
        double b = Math.ceil(a);

        System.out.println("Ceil Value= "+b);
    }

    // find floor
    public static void findFloor(double a){
        double b = Math.floor(a);

        System.out.println("Floor Value= "+b);
    }



    public static void main(String[] args) {
        maxValue(3.14,3.4);
        findAbs(-3.25);
        findSqrt(4);
        findRoundOff(3.667892);
        findCeil(3.045);
        findFloor(3.0123);
    }
}
