/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai32;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public abstract class NguoiLaoDong {
    public String maSo,hoTen;
    public int namSinh;
    public static Scanner sc = new Scanner(System.in);
    public NguoiLaoDong(){
        
    }

    public NguoiLaoDong(String maSo, String hoTen, int namSinh) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }
    
    public abstract double tinhLuong();
    public void nhap(){
        System.out.print("Nhap Ma so: ");
        maSo = sc.nextLine();
        System.out.print("Nhap Ho Ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap Nam Sinh: ");
        namSinh = sc.nextInt();
    }
    public void xuat(){
        System.out.println("Ma so: "+maSo);
        System.out.println("Ho ten: "+hoTen);
        System.out.println("Nam Sinh: "+namSinh);
    }
}
