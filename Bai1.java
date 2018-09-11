import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        int a = sc.nextInt();
        if (a > 0) {
            double x = Math.sqrt(a);
            System.out.println("Can bac hai so a la:" + x);

        }
    }
}
