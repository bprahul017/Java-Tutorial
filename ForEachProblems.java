import java.util.ArrayList;

public class ForEachProblems {
    public static void main(String[] args) {
        // Declare and initialize a 2D array
        int[][] abc = {
                {1, 2, 3},
                {3, 4, 5},
                {6, 7, 8}
        };

        // Using for-each loop to print elements
        for (int[] row : abc) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println(); // new line after each row
        }

        ArrayList<String> amount= new ArrayList();
        amount.add("100.0 Rs");
        amount.add("200.0 Rs");

        for (String i: amount){
            System.out.println(i);
        }

    }
}
