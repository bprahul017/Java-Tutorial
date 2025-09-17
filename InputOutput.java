import  java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("What is Your Name?");
        String name= scanner.nextLine();

        System.out.println("What is your Age?");
        int age= scanner.nextInt();


        System.out.println("Here we have "+name+" of age "+age);
    }
}
