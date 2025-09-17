import java.util.Arrays;
import javax.swing.JOptionPane;

public class ArrayOperations {
    public static void main(String[] args) {
        String[] cars={"Maruti","Hyundai","Honda"};
        String[] colours= new String[3];

        for (int i=0;i<cars.length;i++) {
            colours[i]=JOptionPane.showInputDialog("Enter colour of "+cars[i]+" car");
        }

        for (int i = 0; i < cars.length; i++) {
            JOptionPane.showMessageDialog(null,"You have a "+colours[i] +" colour " +cars[i]);
        }

    }
}
