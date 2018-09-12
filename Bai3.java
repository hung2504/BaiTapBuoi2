package com.company;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap tuoi:");
        int tuoi = sc.nextInt();
        if(tuoi == 16){
            System.out.println("Tuoi cua hoc sinh la:"+tuoi);
            System.out.println("Hoc sinh du tuoi vao lop 10");
        }
        else{
            System.out.println("Tuoi cua hoc sinh la:"+tuoi);
            System.out.println("Hoc sinh khong du tuoi vao lop 10");
        }
    }
}
