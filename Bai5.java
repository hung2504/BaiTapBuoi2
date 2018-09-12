package com.company;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen thu nhat:");
        int a = sc.nextInt();
        System.out.println("Nhap so nguyen thu hai:");
        int b = sc.nextInt();
        System.out.println("Nhap so nguyen thu ba:");
        int c = sc.nextInt();
        int max = a;
        if (max < b) {
            max = b;
            if (max < c) {
                max = c;
                System.out.println("So lon nhat trong ba so la:" + c);
            } else {
                System.out.println("So lon nhat trong ba so la:" + max);
            }
        }
    }
}
