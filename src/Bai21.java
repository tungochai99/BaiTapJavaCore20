import java.util.Scanner;

public class Bai21 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x1, x2, v1, v2;
        do {
            System.out.println("Nhập thông tin Kanggoroo 1!");
            System.out.print("X1:" );
            x1 = sc.nextInt();
            System.out.print("V1:" );
            v1 = sc.nextInt();
        } while (x1 < 0 || v1 > 10000);
        do {
            System.out.println("Nhập thông tin Kanggoroo 2!");
            System.out.print("X2:" );
            x2 = sc.nextInt();
            System.out.print("V2:" );
            v2 = sc.nextInt();
        } while (x2 < 0 || v2 > 10000);
        while(x1 != x2 )
        {
            x1 += v1;
            x2 += v2;
            if(x1 > x2) break;
        }

        if(x1 == x2) System.out.println("Yes!");
        else System.out.println("No!");
    }
}
