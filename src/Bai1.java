import java.util.Scanner;

public class Bai1 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int doc, ngang;
        System.out.print("Nhập chiều ngang: ");
        ngang = sc.nextInt();
        System.out.print("Nhập chiều dài: ");
        doc = sc.nextInt();

        for(int i = 1 ; i <= doc ; i++)
        {
            for(int j = 1 ; j <= ngang ; j++)
            {
                if(i==1 || i==doc || j==1 || j==ngang)
                {
                    System.out.print(" ");
                }
                else if(i<=(doc/2)+1 && j<=(ngang/2)+1)
                    System.out.print(" * ");
                else
                    System.out.print(" = ");
            }
            System.out.println();
        }
    }
}
