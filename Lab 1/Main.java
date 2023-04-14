import java.util.Scanner;
public class Main {

    static int recursion(int x){
        if (x > 0) {
            return x + recursion(x - 1);
        }
        else return 0;
    }

    static int binary_search(int lo, int hi, int x, int a[]){
        int res = -1;
        while (lo <= hi){
            int mid = (lo + hi) >> 1;
            if (a[mid] <= x){
                res = a[mid];
                lo = mid + 1;
            }
            else hi = mid - 1;
        }
        return res;
    }

    int tmp;
    int a[] = {1, 3, 5};

    void max_speed(float speed)
    {
        System.out.println("The max speed of the car is: " + speed);
    }

    public Main (int y){
        tmp = y;
    }
    public static void main(String[] args) {
        String name = "John";
        System.out.println("Hello my name is " + name);
        int res = recursion(5);
        System.out.println(res);
        Main car = new Main(5);
        car.tmp = 5;
        Main obj = new Main(5);
        System.out.println(obj.binary_search(0, 3, 2, obj.a));
        car.max_speed(200);
        System.out.println(obj.tmp);
    }
}

class Second{

    int x = 3;
    public static void main(String[] args){
        Second newob = new Second();
        System.out.println(newob.x);
    }
}

