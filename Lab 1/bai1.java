import java.util.Scanner;

public class bai1 {

    static float result(float a, float b){
        return (float)(-b / a);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        float a = obj.nextInt();
        float b = obj.nextInt();
        obj.close();
        System.out.println("Answer is: "+ result(a, b));
    }
}
