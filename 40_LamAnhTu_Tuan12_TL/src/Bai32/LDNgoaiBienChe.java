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
public abstract class LDNgoaiBienChe extends NguoiLaoDong{
    public double mucLuong;

    public LDNgoaiBienChe() {
        this.mucLuong = 0;
    }

    public LDNgoaiBienChe(String maSo, String hoTen, int namSinh, double mucLuong) {
        super(maSo, hoTen, namSinh);
        this.mucLuong = mucLuong;
    }
    @Override
    public abstract double tinhLuong();
    
    @Override
    public void nhap(){
        super.nhap();
        System.out.print("Nhap Muc luong: ");
        mucLuong = sc.nextDouble();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Muc luong: "+ mucLuong);
    }
}
