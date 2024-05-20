/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai29;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author latu2
 */
public class SDCongTy {
    public static void nhapDS(ArrayList<NhanVien> ds)
    {
        Scanner sc = new Scanner(System.in);
        String choice =" ";
        do {
            System.out.print("Nhap loai Nhan vien: ");
            String LoaiNV = sc.nextLine();
            if (LoaiNV.equalsIgnoreCase("QL")) {
                QuanLy ql = new QuanLy();
                ql.nhap();
                ds.add(ql);
            }
            else if (LoaiNV.equalsIgnoreCase("SX")) {
                SanXuat sx = new SanXuat();
                sx.nhap();
                ds.add(sx);
            }
            else if (LoaiNV.equalsIgnoreCase("VP")) {
                VanPhong vp = new VanPhong();
                vp.nhap();
                ds.add(vp);
            }
            else
                System.out.println("nhap loai nhan vien trong cac loai sau (QL||VP||SX)");
            System.out.print("Co muon tiep tuc (Y|N)");   
            choice = sc.nextLine();
        } while (choice.equalsIgnoreCase("Y"));
    }
    public static void xuatDS(ArrayList<NhanVien> ds)
    {
        System.out.println("Nhan vien bo phan Quan Ly: ");
        for (NhanVien bpnv :ds) {
            if (bpnv instanceof QuanLy) {
                bpnv.xuat();
            }
        }
        System.out.println("Nhan vien bo phan Van Phong: ");
        for (NhanVien bpnv :ds) {
            if (bpnv instanceof VanPhong) {
                bpnv.xuat();
            }
        }
        System.out.println("Nhan vien bo phan San Xuat: ");
        for (NhanVien bpnv :ds) {
            if (bpnv instanceof SanXuat) {
                bpnv.xuat();
            }
        }
    }
    public static void main(String[] args){
        ArrayList<NhanVien> ds = new ArrayList<>();
        nhapDS(ds);
        xuatDS(ds);
    }
}
