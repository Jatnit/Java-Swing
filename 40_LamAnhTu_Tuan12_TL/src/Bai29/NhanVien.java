/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai29;

import java.util.Scanner;

/**
 *
 * @author latu2
 */
public abstract class NhanVien {
    public String hoTen;
    public int namVaoLam;
    public int LCB = 1490000;
    public abstract Double TinhLuong();
    public static Scanner sc = new Scanner(System.in);
    public NhanVien() {
    }

    public NhanVien(String hoTen, int namVaoLam) {
        this.hoTen = hoTen;
        this.namVaoLam = namVaoLam;
    }
    public void nhap(){
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        sc.nextLine();
        System.out.print("Nhap nam vao lam: ");
        namVaoLam = sc.nextInt();
        sc.nextLine();
    }
    public void xuat(){
        System.out.println("Ho ten: "+hoTen);
        System.out.println("Nam vao lam: "+namVaoLam);
    }
}
