import java.util.Scanner;

public class TriangleService {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter base");
         double base = scanner.nextDouble();

        System.out.println("Enter Perpendicular");
        double perpendicular= scanner.nextDouble();

        double hypotenuse = Math.sqrt(Math.pow(base,2)+Math.pow(perpendicular, 2));
        System.out.println("Hypotenuse of Triangle =" + hypotenuse);

        scanner.close();
    }
}
