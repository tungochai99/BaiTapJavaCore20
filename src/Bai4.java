import java.util.Scanner;

public class Bai4 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhập số tự nhiên: ");
        int n = sc.nextInt();
        int sum = 0, temp = 0;
        while(n>0) {
            temp = n%10;
            n = n /10;
            sum = sum + temp;
        }
        System.out.println("Tổng các số tự nhiên là: " + sum);
    }
}
