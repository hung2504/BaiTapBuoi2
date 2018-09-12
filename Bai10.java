package com.company;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien luong nhan vien:");
        float luong = sc.nextFloat();
        float sothue = 0;
        int thuesuat = 0;
        float luongrong = 0;
        if(luong == 15){
            sothue = (luong*30)/100;
            thuesuat = 30;
        }else if(luong >= 7){
            sothue = (luong*20)/100;
            thuesuat = 20;
        }else{
            sothue = (luong*10)/100;
            thuesuat = 10;
        }
        luongrong = luong - sothue;
        System.out.println("So tien luong la:"+luong);
        System.out.println("Thue thu nhap voi muc thue suat la: "+thuesuat + "% = "+sothue);
        System.out.println("So tien luong ban nhan duoc la: "+luongrong);

    }
}
