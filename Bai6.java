package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem kiem tra:");
        float a = sc.nextFloat();
        System.out.println("Nhap diem thi giua ki:");
        float b = sc.nextFloat();
        System.out.println("Nhap diem cuoi ki:");
        float c = sc.nextFloat();
        double DiemTb = (a + b + c) / 3;
        if (DiemTb >= 8.0) {
            System.out.println("Hoc sinh gioi");
        } else if (DiemTb < 8.0 && DiemTb >= 6.5) {
            System.out.println("Hoc sinh tien tien");
        } else if (DiemTb < 6.5 && DiemTb > 5.0)
            System.out.println("Hoc sinh trung binh");
        else {
            System.out.println("Hoc sinh yeu");
        }
    }
    }


