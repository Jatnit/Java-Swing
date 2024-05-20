/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai30;

import java.util.Scanner;

/**
 *
 * @author latu2
 */
public abstract class MonHoc {
    public String maMH,tenMH;
    public int soTC;
    public static Scanner sc = new Scanner(System.in);
    public void nhap(){
        System.out.print("Nhap ma mon hoc: ");
        maMH = sc.nextLine();
        sc.nextLine();
        System.out.print("Nhap ten mon hoc: ");
        tenMH = sc.nextLine();
        sc.nextLine();
        System.out.print("Nhap so tin chi cua mon hoc: ");
        soTC = sc.nextInt();
    }
    public void xuat(){
        System.out.println("Ma mon hoc: "+maMH);
        System.out.println("Ten mon hoc: "+tenMH);
        System.out.println("So tin chi cua mon: "+soTC);
    }
    public abstract double tinhDiem();
}   
