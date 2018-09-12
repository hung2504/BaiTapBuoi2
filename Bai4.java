package com.company;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen:");
        int a = sc.nextInt();
        if (a > 100){
            System.out.println("So a la so lon hon 100");
        }
        else {
            System.out.println("So a la so nho hon 100");
        }
    }
}
