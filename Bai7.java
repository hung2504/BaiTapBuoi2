package com.company;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap he so a:");
        int a = sc.nextInt();
        System.out.println("Nhap he so b:");
        int b = sc.nextInt();
        System.out.println("Nhap he so c:");
        int c = sc.nextInt();
        double delta = Math.pow(b, 2)-4*a*c;
        if(delta < 0){
            System.out.println("Phuong trinh vo nghiem");
        }else if(delta == 0){
            System.out.println("Phuong trinh co mot nghiem kep");
        }else {
            System.out.println("Phuong trinh co hai nghiem");
        }
    }
}
