/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai31;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author latu2
 */
public class SDCongTy {
    public static void nhapDS (ArrayList<BatDongSan> ds){
        Scanner sc = new Scanner(System.in);
        String choice = "";
        do {
            System.out.print("Nhap loai bat dong san: ");
            String LoaiBDS = sc.nextLine();
            if (LoaiBDS.equalsIgnoreCase("DT")) {
                DatTrong dt = new DatTrong();
                dt.nhap();
                ds.add(dt);
            }
            else if (LoaiBDS.equalsIgnoreCase("NO")) {
                NhaO no = new NhaO();
                no.nhap();
                ds.add(no);
            }
            else if (LoaiBDS.equalsIgnoreCase("KS")) {
                KhachSan ks = new KhachSan();
                ks.nhap();
                ds.add(ks);
            }
            else if (LoaiBDS.equalsIgnoreCase("BT")) {
                BietThu bt = new BietThu();
                bt.nhap();
                ds.add(bt);
            }
            else
                System.out.println("Nhap loai mon trong cac loai duoi day (DT||NO||KS||BT)");
            System.out.println("Co muon tiep tuc (Y|N)");
            choice =sc.nextLine(); 
        } while (choice.equalsIgnoreCase("Y"));
    }
    public static void xuatDS(ArrayList<BatDongSan> ds){
        System.out.println("bat Dong San DAT TRONG:");
        for (BatDongSan bds :ds) {
            if (bds instanceof DatTrong) {
                bds.xuat();
            }
        }
        System.out.println("bat Dong San NHA O:");
        for (BatDongSan bds :ds) {
            if (bds instanceof NhaO) {
                bds.xuat();
            }
        }
        System.out.println("bat Dong San KHACH SAN:");
        for (BatDongSan bds :ds) {
            if (bds instanceof KhachSan) {
                bds.xuat();
            }
        }
        System.out.println("bat Dong San BIET THU:");
        for (BatDongSan bds :ds) {
            if (bds instanceof BietThu) {
                bds.xuat();
            }
        }
    }
    public static void main(String[] args){
        ArrayList<BatDongSan> ds = new ArrayList<>();
        nhapDS(ds);
        xuatDS(ds);
    }
}
