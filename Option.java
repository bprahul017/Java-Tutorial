import javax.swing.JOptionPane;

public class Option {
    public static void main(String[] args) {

        String name=JOptionPane.showInputDialog("Enter Your Name");
        JOptionPane.showMessageDialog(null, "Hello" + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your age"));
        JOptionPane.showMessageDialog(null, "Your are " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your height"));
        JOptionPane.showMessageDialog(null, "Your are " + height + " cm tall");
    }
}
