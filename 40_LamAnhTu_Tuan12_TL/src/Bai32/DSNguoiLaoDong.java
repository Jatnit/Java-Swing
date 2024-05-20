/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai32;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class DSNguoiLaoDong {
    public static void nhapDS(ArrayList<NguoiLaoDong> ds){
        Scanner sc = new Scanner(System.in);
        String choice = " ";
        do {
            System.out.print("Nhap loai nguoi lao dong:");
            String loaiLD = sc.nextLine();
            sc.nextLine();
            if(loaiLD.equalsIgnoreCase("GVCH"))
            {
                GVCoHuu gvch = new GVCoHuu();
                gvch.nhap();
                ds.add(gvch);
            }
            else if(loaiLD.equalsIgnoreCase("NVCH"))
            {
                NVCoHuu nvch = new NVCoHuu();
                nvch.nhap();
                ds.add(nvch);
            }
            else if(loaiLD.equalsIgnoreCase("NVHD"))
            {
                NVHopDong nvhd = new NVHopDong();
                nvhd.nhap();
                ds.add(nvhd);
            }
            else if(loaiLD.equalsIgnoreCase("GVTG"))
            {
                GVThinhGiang gvtg = new GVThinhGiang();
                gvtg.nhap();
                ds.add(gvtg);
            }
            else
                System.out.println("nhap loai lao dong trong cac loai sau (GVCH||GVTG||NVHD||NVCH)");
            System.out.print("Co muon tiep tuc (Y|N)");   
            choice = sc.nextLine();
        } while (choice.equalsIgnoreCase("Y"));
    }
    public static void xuatDS(ArrayList<NguoiLaoDong> ds){
        System.out.println("Danh sach giang vien co huu: ");
        for(NguoiLaoDong ngl :ds)
            if(ngl instanceof GVCoHuu){
                ngl.xuat();
            }
        System.out.println("Danh sach nhan vien co huu: ");
        for(NguoiLaoDong ngl :ds)
            if(ngl instanceof NVCoHuu){
                ngl.xuat();
            }
        System.out.println("Danh sach giang vien thinh giang: ");
        for(NguoiLaoDong ngl :ds)
            if(ngl instanceof GVThinhGiang){
                ngl.xuat();
            }
        System.out.println("Danh sach nhan vien hop dong : ");
        for(NguoiLaoDong ngl :ds)
            if(ngl instanceof NVHopDong){
                ngl.xuat();
            }
    }
    public static void main(String[] args){
        ArrayList<NguoiLaoDong> ds = new ArrayList<NguoiLaoDong>();
        nhapDS(ds);
        xuatDS(ds);
    }
}
