public class ControlFlowDemo {
    public static void main(String[] args) {
        int num = 7;

        // Relational + Logical
        if (num > 0 && num < 10) {
            System.out.println("Single digit positive");
        }

        // Ternary operator
        String parity = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number is " + parity);

        // Switch + break
        switch (num) {
            case 1: System.out.println("One"); break;
            case 2: System.out.println("Two"); break;
            case 7: System.out.println("Lucky seven!"); break;
            default: System.out.println("Other number");
        }

        // Loop with continue
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue; // skip 3
            System.out.println("i = " + i);
        }
    }
}
