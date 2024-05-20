/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai26;

import java.util.Scanner;

/**
 *
 * @author Latu4
 */
public class TamGiac {

    Scanner sc = new Scanner(System.in);
    int c, h;

    public TamGiac() {
        this.c = 0;
        this.h = 0;
    }

    public TamGiac(int c, int h) {
        this.c = c;
        this.h = h;
    }

    public int getC() {
        return c;
    }

    public int getH() {
        return h;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setH(int h) {
        this.h = h;
    }

    public double TinhDienTich() {
        System.out.println("Tam giac deu");
        System.out.println("Tam Giac vuong, can, thuong");
        System.out.println("Tam giac vuong can");
        System.out.print("Nhap lua chon cua Ban!!! : ");
        int choes = sc.nextInt();
        double DienTich;
        switch (choes) {
            case 1:
                System.out.println("Tam giac deu");
                DienTich = Math.pow(c, 2) * Math.sqrt(3) / 4;
                break;
            case 2:
                System.out.println("Tam Giac vuong, can, thuong");
                DienTich = ((float) 1 / 2) * c * h;
                break;
            case 3:
                System.out.println("Tam giac vuong can");
                DienTich = ((float) 1 / 2) * Math.pow(c, 2);
                break;
            default:
                System.out.println("Tam Giac thuong");
                DienTich = ((float) 1 / 2) * c * h;
        }
        System.out.print("Ket qua tinh dien tich la: "+ DienTich);
        return DienTich;
    }

    public double TinhChuVi() {
        System.out.println("Tam giac deu");
        System.out.println("Tam Giac vuong,thuong");
        System.out.println("Tam giac vuong can");
        System.out.print("Nhap lua chon cua Ban!!! : ");
        int choes = sc.nextInt();
        double ChuVi;
        double CanhHuyen = Math.sqrt(Math.pow(c, 2)+Math.pow(h, 2));
        switch (choes) {
            case 1:
                System.out.println("Tam giac deu");
                ChuVi = c*3;
                break;
            case 2:
                System.out.println("Tam Giac vuong,thuong");
                ChuVi = c + h + CanhHuyen;
                break;
            case 3:
                System.out.println("Tam giac vuong can");
                ChuVi = c*2 + CanhHuyen;
                break;
            default:
                System.out.println("Tam Giac thuong");
                ChuVi = c + h + CanhHuyen;
        }
        System.out.print("Ket qua tinh chu vi la: "+ ChuVi);
        return ChuVi;
    }
    
    public void Nhap() {
        System.out.print("Nhap Chieu dai canh: ");
        c = sc.nextInt();
        System.out.print("Nhap Chieu cao: ");
        h = sc.nextInt();
    }
    
    
}
