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
public abstract class LDBienChe extends NguoiLaoDong {
    public double HSL;
    public double LCS = 1490000;

    public LDBienChe() {
        this.HSL = 1;
    }

    public LDBienChe(String maSo, String hoTen, int namSinh, double HSL) {
        super(maSo, hoTen, namSinh);
        this.HSL = HSL;
    }
    
    @Override
    public abstract double tinhLuong();
    
    @Override
    public void nhap(){
        super.nhap();
        System.out.println("Nhap He so luong: ");
        HSL = sc.nextDouble();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("He so luong: "+HSL);
    }
}
