import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String chuoi = sc.nextLine();
        String reverse = new StringBuffer(chuoi).reverse().toString();
        System.out.println("Chuỗi đảo ngược: " + reverse);
    }
}
