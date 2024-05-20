/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Bai toan can thuc hien");
        int Chon = sc.nextInt();
        int a[] = new int[Chon];
        for(int i=0;i<a.length;i++)
        {
            switch(Chon){
            case 1:
                System.out.println("Nhap so luong mang");
                int b = sc.nextInt();
                int c[] = new int[b];
                for (int j = 0; j <c.length ; j++) {
                    c[j] = sc.nextInt();
                    System.out.println(c[j]);
                }
            case 2:
            case 3:
            default:
                System.out.println("So nhap khong hop le, THOAT CHUONG TRINH!!!");
                return;
            }
        }
    }
    public static void NhapGiaTriNKB(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong mang");
        int a = sc.nextInt();
        int n[] = new int[a];
        for (int i = 0; i <n.length ; i++) {
            System.out.println(" a[i] ");
        }
        
    }
}
