import java.util.Scanner;
public class Linear_equation {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter first number: ");
        Double a = myObj.nextDouble();  // Read user input
        System.out.println("Enter second number: ");
        Double b = myObj.nextDouble();
        if (b == 0){
            if (a == 0) System.out.println("Infinite Solution!");
            else System.out.println("No Solution!");
        }
        else {
            Double Res = -b / a;
            System.out.println("The result is: x = " + Res);
        }
    }
}