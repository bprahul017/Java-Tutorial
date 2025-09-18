import javax.swing.JOptionPane;

public class CompareString {
    public static void main(String[] args) {
        String password = JOptionPane.showInputDialog("Enter Password");
        String confirmPassword = JOptionPane.showInputDialog("Confirm Password");

        boolean isVerified = compareString(password, confirmPassword);

        if (isVerified) {
            JOptionPane.showMessageDialog(null, "Password confirmed!");
        } else {
            JOptionPane.showMessageDialog(null, "Password does not match!");
        }
    }

    static boolean compareString(String str1, String str2) {
        return str1.compareTo(str2) == 0;
    }
}
