import java.util.Scanner;
public class Days {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Nhap thang: \n");
        int month = obj1.nextInt();
        System.out.print("Nhap nam: \n");
        int year = obj1.nextInt();
        if (month != 2){
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) System.out.print("There are 31 days \n");
            else System.out.print("There are 30 days \n");
        }
        else{
            if (year % 100 == 0){
                if ((year / 100) % 4 == 0) System.out.print("There are 29 days \n");
                else System.out.print("There are 28 days \n");
            }
            else {
                if (year % 4 == 0) System.out.print("There are 29 days \n");
                else System.out.print("There are 28 days \n");
            }
        }
    }
}
