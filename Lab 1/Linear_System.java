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
        Double Det = a11 * a22 - a12 * a21;
        Double Dx =  b1 * a22 - b2 * a12;
        Double Dy =  b2 * a11 - b1 * a21;
        ///System.out.println(Det + " "  + Dx + " " + Dy);
        if (Det == 0) {
            if (a11 == 0 && a12 == 0 && b1 != 0) System.out.println("No solution !");
            else if (a21 == 0 && a22 == 0 && b2 != 0) System.out.println("No solution !");
            else if(Dx == 0 && Dy == 0) System.out.println("Infinite solution");
            else System.out.println("No solution !");
        }
        else {
            Double x = Dx / Det;
            Double y = Dy / Det;
            System.out.println("Solution is: X = " + x + " Y = " + y);
        }
    }
}