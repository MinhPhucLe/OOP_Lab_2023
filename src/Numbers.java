import javax.swing.JOptionPane;
public class Numbers {
    public static void main(String[] args){
        double num1, num2;
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", JOptionPane.INFORMATION_MESSAGE);
        num1 = Double.parseDouble(strNum1);
        num2 = Double.parseDouble(strNum2);
        JOptionPane.showMessageDialog(null, num1 + num2, "Sum of two numbers is: ", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, num1 - num2, "Difference of two numbers is: ", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, num1 * num2, "Product of two numbers is: ", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, num1 / num2, "Quotient of two numbers is: ", JOptionPane.INFORMATION_MESSAGE);
    }
}
