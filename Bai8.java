package com.company;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tri tong doanh so ban hang:");
        int doanhso = sc.nextInt();
        float hoahong = 0;
        if(doanhso <= 100){
            hoahong = (doanhso*5)/100;
            System.out.println("Voi doanh so la:"+doanhso);
            System.out.println("Thi hoa hong nhan duoc la:"+hoahong);
        }else if(doanhso <= 300){
            hoahong = (doanhso*10)/100;
            System.out.println("Voi doanh so la:"+doanhso);
            System.out.println("Thi hoa hong nhan duoc la:");
        }else{
            hoahong = (doanhso*20)/100;
            System.out.println("Voi doanh so la:"+doanhso);
            System.out.println("Thi hoa hong nhan duoc la:"+hoahong);
        }
    }
}
