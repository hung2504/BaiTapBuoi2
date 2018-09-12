package com.company;

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phut da su dung:");
        int sophut = sc.nextInt();
        int phicodinh = 25000;
        int phigiatang = 0;
        int tong = 0;
        if (sophut > 200) {
            phigiatang = (sophut - 200) * 200 + 150 * 400 + 50 * 600;
        } else if (sophut > 50) {
            phigiatang = (sophut - 50) * 400 + 50 * 600;
        } else {
            phigiatang = 50 * 600;}
            tong = phicodinh + phigiatang;
            System.out.println("Ban da goi" + sophut + "phut");
            System.out.println("So tien ban phai nop la:"+tong);
        }
    }

