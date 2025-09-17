import java.util.Random;
import javax.swing.JOptionPane;

public class RandomVal {
    public static void main(String[] args) {
        Random random = new Random();

        int predictedNum = Integer.parseInt(JOptionPane.showInputDialog("Enter a number bless than 10"));

        int randomNum = random.nextInt(10);

        if (predictedNum==randomNum){
            JOptionPane.showMessageDialog(null,"Your predicted number is selected random, You won!");
        }
        else {
            JOptionPane.showMessageDialog(null,"Predicted number fails, You Failed!");
        }

    }
}
