package DemoSwitch;

import java.util.Random;
import java.util.Scanner;

public class Vd6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a:");
        int a = sc.nextInt();
        System.out.println("Nhap so b:");
        int b = sc.nextInt();
        Random rand = new Random();
        for (int i = 0; i < (b - a); i++) {
            System.out.println(rand.nextInt(b + 1 - a) + " ");
        }
    }
}
