import java.util.Scanner;
public class Inpt {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("What's your name?");
        String Name = obj.nextLine();
        System.out.println("How old are you?");
        int Age = obj.nextInt();
        System.out.println("How tall are you (m)?");
        double Height = obj.nextDouble();

        System.out.println("Mrs/Ms." + Name + ", " + Age + " years old. " + "Your height is " + Height + ".");
    }
}