
import javax.swing.JOptionPane;


public class Calculate {
    public static void main(String[] args) {
        String strNum1 = JOptionPane.showInputDialog("Enter the first number:");
        String strNum2 = JOptionPane.showInputDialog("Enter the second number:");

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        StringBuilder result = new StringBuilder();

        result.append("First Number: ").append(num1).append("\n");
        result.append("Second Number: ").append(num2).append("\n\n");

        result.append("Sum: ").append(sum).append("\n");
        result.append("Difference: ").append(difference).append("\n");
        result.append("Product: ").append(product).append("\n");

        if (num2 != 0) {
            double quotient = num1 / num2;
            result.append("Quotient: ").append(quotient).append("\n");
        } else {
            result.append("Division by zero is not allowed.\n");
        }

        JOptionPane.showMessageDialog(null, result.toString(), "Calculation Results", JOptionPane.INFORMATION_MESSAGE);
    }
}
