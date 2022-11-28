import java.util.Scanner;

public class Bai5 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double kc = 0;
        System.out.println("Nhập toạ độ A");
        System.out.print("Ax: ");
        int ax = sc.nextInt();
        System.out.print("Ay: ");
        int ay = sc.nextInt();
        System.out.println("Nhập toạ độ B");
        System.out.print("Bx: ");
        int bx = sc.nextInt();
        System.out.print("By: ");
        int by = sc.nextInt();

        kc = Math.sqrt((bx-ax)*(bx-ax)+(by-ay*(by-ay)));
        System.out.println("Độ dài đoạn thẳng AB là: " + kc);
    }
}
