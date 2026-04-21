import javax.swing.JOptionPane;

public class DialogInput {
    public static void main(String[] args) {
        // Asking for favorite food and color
        String food = JOptionPane.showInputDialog("Enter your favorite food:");
        String color = JOptionPane.showInputDialog("Enter your favorite color:");

        // Displaying result
        JOptionPane.showMessageDialog(null, "Your favorite food is " + food + " and favorite color is " + color);
    }
}