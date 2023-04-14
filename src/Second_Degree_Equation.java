import java.util.Scanner;
import java.lang.*;
public class Second_Degree_Equation {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter first number: ");
        Double a = obj1.nextDouble();  // Read user input
        System.out.println("Enter second number: ");
        Double b = obj1.nextDouble();
        System.out.println("Enter Third number: ");
        Double c = obj1.nextDouble();
        Double Delta = b * b - 4 * a * c;
        if (Delta < 0){
            System.out.println("No Solution !");
        }
        else if (Delta == 0){
            Double res = -b / (2 * a);
            System.out.println("The solution is: X =  " + res);
        }
        else {
            Double res1 = (-b + Math.sqrt(Delta)) / (2 * a);
            Double res2 = (-b - Math.sqrt(Delta)) / (2 * a);
            System.out.println("The solution is: X1 =  " + res1 + " X2 =  " + res2);
        }
    }
}