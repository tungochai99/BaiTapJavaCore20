import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tự nhiên: ");
        int n = sc.nextInt();
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                System.out.println("Các ước số của " + n + " là " + i);
            }
        }
    }
}
