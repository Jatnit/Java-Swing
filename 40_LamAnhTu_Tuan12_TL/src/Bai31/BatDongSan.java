/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai31;

import java.util.Scanner;

/**
 *
 * @author latu2
 */
public abstract class BatDongSan {
    public String maSo;
    public Double cDai,cRong;
    public static Scanner sc = new Scanner(System.in);
    public abstract double giaTri();
    public void nhap(){
        System.out.println("Nhap ma so bat dong san: ");
        maSo = sc.nextLine();
        sc.nextLine();
        System.out.println("Nhap chieu dai: ");
        cDai = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhap chieu rong: ");
        cRong = sc.nextDouble();
        sc.nextLine();
    }
    public void xuat(){
        System.out.println("Ma bat dong san: "+maSo);
        System.out.println("Chieu dai: "+cDai);
        System.out.println("Chieu rong: "+cRong);
    }
}
