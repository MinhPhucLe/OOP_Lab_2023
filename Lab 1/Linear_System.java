import java.util.Scanner;
import java.lang.*;
public class Linear_System {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter first left number: ");
        Double a11 = obj1.nextDouble();  // Read user input
        System.out.println("Enter second left number: ");
        Double a12 = obj1.nextDouble();
        System.out.println("Enter first right number: ");
        Double b1 = obj1.nextDouble();
        System.out.println("Enter Third left number: ");
        Double a21 = obj1.nextDouble();
        System.out.println("Enter Fourth left number: ");
        Double a22 = obj1.nextDouble();
        System.out.println("Enter second right number: ");
        Double b2 = obj1.nextDouble();
        Double Det = Math.abs(a11 * a22 - a12 * a21);
        Double Dx = Math.abs(b1 * a22 - b2 * a12);
        Double Dy = Math.abs(b1 * a21 - b2 * a11);
        if (Det == 0){
            System.out.println("There are infinite solutions or No solution");
        }
        else {
            Double x = Dx / Det;
            Double y = Dy / Det;
            System.out.println("Solution is: X = " + x + " Y = " + y);
        }
    }
}