import java.util.Scanner;

public class matrices {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Input the row: ");
        int n = obj.nextInt();
        System.out.println("Input the column: ");
        int m = obj.nextInt();
        int a[][] = new int[1010][1010];
        int b[][] = new int[1010][1010];
        int res[][] = new int[1010][1010];
        System.out.println("Input the first Matrix: ");
        for (int i = 0; i < n;++ i){
            for (int j = 0; j < m; ++ j)
                a[i][j] = obj.nextInt();
        }
        System.out.println("Input the Second Matrix: ");
        for (int i = 0; i < n;++ i){
            for (int j = 0; j < m; ++ j)
                b[i][j] = obj.nextInt();
        }
        for (int i = 0; i < n;++ i){
            for (int j = 0; j < m; ++ j)
                res[i][j] = a[i][j] + b[i][j];
        }
        System.out.println("Answer is : ");
        for (int i = 0; i < n;++ i){
            for (int j = 0; j < m; ++ j)
                System.out.print(res[i][j] +  " ");
            System.out.print('\n');
        }
    }
}