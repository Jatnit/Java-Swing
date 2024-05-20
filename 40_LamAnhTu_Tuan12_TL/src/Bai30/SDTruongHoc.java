/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai30;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author latu2
 */
public class SDTruongHoc {
    public static void nhapDS(ArrayList<MonHoc> ds)
    {
        Scanner sc = new Scanner(System.in);
        String choice = "";
        do {
            System.out.print("Nhap loai mon: ");
            String LoaiMon = sc.nextLine();
            if (LoaiMon.equalsIgnoreCase("LT")) {
                LyThuyet lt =new LyThuyet();
                lt.nhap();
                ds.add(lt);
            }
            else if (LoaiMon.equalsIgnoreCase("TH")) {
                ThucHanh th =new ThucHanh();
                th.nhap();
                ds.add(th);
            }
            else if (LoaiMon.equalsIgnoreCase("DA")) {
                DoAn da =new DoAn();
                da.nhap();
                ds.add(da);
            }
            else
                System.out.println("Nhap loai mon trong cac loai duoi day (LT||TH||DA)");
            System.out.println("Co muon tiep tuc (Y|N)");
            choice =sc.nextLine();
        } while (choice.equalsIgnoreCase("Y"));
    }
    public static void xuatDS(ArrayList<MonHoc> ds){
        System.out.println("Mon hoc ly thuyet: ");
        for (MonHoc nhomMH :ds) {
            if (nhomMH instanceof LyThuyet) {
                nhomMH.xuat();
            }
        }
        System.out.println("Mon hoc thuc hanh: ");
        for (MonHoc nhomMH :ds) {
            if (nhomMH instanceof ThucHanh) {
                nhomMH.xuat();
            }
        }
        System.out.println("Mon hoc do an: ");
        for (MonHoc nhomMH :ds) {
            if (nhomMH instanceof DoAn) {
                nhomMH.xuat();
            }
        }
    }
    public static void main(String[] args){
        ArrayList<MonHoc> ds = new ArrayList<>();
        nhapDS(ds);
        xuatDS(ds);
    }
}
