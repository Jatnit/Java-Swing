/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai32;

/**
 *
 * @author Administrator
 */
public class GVCoHuu extends LDBienChe {
    private double hsThamNien;

    public double getHsThamNien() {
        return hsThamNien;
    }

    public void setHsThamNien(double hsThamNien) {
        this.hsThamNien = hsThamNien;
    }

    public GVCoHuu() {
        this.hsThamNien = 0;
    }

    public GVCoHuu(String maSo, String hoTen, int namSinh, double HSL, double hsThamNien) {
        super(maSo, hoTen, namSinh, HSL);
        this.hsThamNien = hsThamNien;
    }
    
    
    @Override
    public double tinhLuong() {
        return HSL * LCS * (1+ getHsThamNien());
    }
    
    @Override
    public void nhap(){
        super.nhap();
        System.out.print("Nhap he so tham nien: ");
        hsThamNien = sc.nextDouble();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("He so tham nien: "+getHsThamNien());
        System.out.println("Luong: "+tinhLuong());
    }
    
}
