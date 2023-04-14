import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Nhap so canh: \n");
        int n = obj1.nextInt();
        int m = (n - 1) * 2 + 1;
        int dem = 1;
        for (int i = 1; i <= n; ++ i){
            for (int j = 1; j <= (m - dem) / 2; ++ j)
                System.out.print(" ");
            for (int j = 1; j <= dem; ++ j)
                System.out.print("*");
            for (int j = 1; j <= (m - dem) / 2; ++ j)
                System.out.print(" ");
            dem += 2;
            System.out.print("\n");
        }
    }
}
