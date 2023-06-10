import java.util.Arrays;
import java.util.Scanner;
public class array {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Nhap so so hang: ");
        int n = obj.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; ++ i)
            a[i] = obj.nextInt();
        Arrays.sort(a);
        for (int i = 0; i < n; ++ i)
            System.out.print(a[i] + " ");
        System.out.print('\n');
        int sum = 0;
        for (int i = 0; i < n; ++ i)
            sum += a[i];
        double avrg = (double)sum / (double)n;
        System.out.println("The sum is: " + sum);
        System.out.println("The Average is: " + avrg);
    }
}