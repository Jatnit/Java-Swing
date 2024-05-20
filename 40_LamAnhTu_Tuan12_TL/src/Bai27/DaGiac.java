/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Latu4
 */
public class DaGiac {
    private ArrayList<Dinh> danhSachDinhArrayList;
    private Dinh[] danhSachDinhMang;

    public DaGiac() {
        danhSachDinhArrayList = new ArrayList<>();
        danhSachDinhMang = new Dinh[0];
    }

    public DaGiac(Dinh[] danhSachDinh) {
        danhSachDinhArrayList = new ArrayList<>(Arrays.asList(danhSachDinh));
        danhSachDinhMang = Arrays.copyOf(danhSachDinh, danhSachDinh.length);
    }

    public DaGiac(DaGiac daGiac) {
        this.danhSachDinhArrayList = new ArrayList<>(daGiac.danhSachDinhArrayList);
        this.danhSachDinhMang = Arrays.copyOf(daGiac.danhSachDinhMang, daGiac.danhSachDinhMang.length);
    }

    public ArrayList<Dinh> getDanhSachDinhArrayList() {
        return danhSachDinhArrayList;
    }

    public void setDanhSachDinhArrayList(ArrayList<Dinh> danhSachDinhArrayList) {
        this.danhSachDinhArrayList = danhSachDinhArrayList;
    }

    public Dinh[] getDanhSachDinhMang() {
        return danhSachDinhMang;
    }

    public void setDanhSachDinhMang(Dinh[] danhSachDinhMang) {
        this.danhSachDinhMang = Arrays.copyOf(danhSachDinhMang, danhSachDinhMang.length);
    }
    
    public void nhap() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so dinh cua da giac:");
        int soDinh = scanner.nextInt();

        for (int i = 0; i < soDinh; i++) {
            System.out.println("Nhap toa do cho dinh thu " + (i + 1) + ":");
            System.out.print("Nhap x: ");
            double x = scanner.nextDouble();
            System.out.print("Nhap y: ");
            double y = scanner.nextDouble();

            Dinh dinh = new Dinh(x, y);
            danhSachDinhArrayList.add(dinh);
            danhSachDinhMang = Arrays.copyOf(danhSachDinhMang, danhSachDinhMang.length + 1);
            danhSachDinhMang[danhSachDinhMang.length - 1] = dinh;
        }
    }

    public void xuat() {
        System.out.println("Danh sach toa do cac dinh trong da giac:");

        for (int i = 0; i < danhSachDinhMang.length; i++) {
            System.out.println("Dinh thu " + (i + 1) + ": (" + danhSachDinhMang[i].getX() + ", " + danhSachDinhMang[i].getY() + ")");
        }
    }

    public double tinhChuVi() {
        double chuVi = 0.0;

        for (int i = 0; i < danhSachDinhMang.length; i++) {
            int nextIndex = (i + 1) % danhSachDinhMang.length;
            chuVi += Math.sqrt(Math.pow(danhSachDinhMang[nextIndex].getX() - danhSachDinhMang[i].getX(), 2)
                    + Math.pow(danhSachDinhMang[nextIndex].getY() - danhSachDinhMang[i].getY(), 2));
        }

        return chuVi;
    }

    public Dinh timDinhXaNhat() {
        Dinh diemXaNhat = danhSachDinhMang[0];
        double khoangCachXaNhat = Math.sqrt(Math.pow(danhSachDinhMang[0].getX(), 2) + Math.pow(danhSachDinhMang[0].getY(), 2));

        for (int i = 1; i < danhSachDinhMang.length; i++) {
            double khoangCach = Math.sqrt(Math.pow(danhSachDinhMang[i].getX(), 2) + Math.pow(danhSachDinhMang[i].getY(), 2));
            if (khoangCach > khoangCachXaNhat) {
                khoangCachXaNhat = khoangCach;
                diemXaNhat = danhSachDinhMang[i];
            }
        }

        return diemXaNhat;
    }
}
