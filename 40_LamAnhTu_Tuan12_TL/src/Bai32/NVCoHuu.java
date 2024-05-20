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
public class NVCoHuu extends LDBienChe implements XetKhenThuong {
    private int soGioLamThem;

    public int getSoGioLamThem() {
        return soGioLamThem;
    }

    public void setSoGioLamThem(int soGioLamThem) {
        this.soGioLamThem = soGioLamThem;
    }

    public NVCoHuu() {
        this.soGioLamThem = 0;
    }

    public NVCoHuu(String maSo, String hoTen, int namSinh, double HSL,int soGioLamThem) {
        super(maSo, hoTen, namSinh, HSL);
        this.soGioLamThem = soGioLamThem;
    }
    
    @Override
    public double tinhLuong() {
        return HSL * LCS + getSoGioLamThem() * 50000 + tinhKhenThuong();
    }

    @Override
    public double tinhKhenThuong() {
        if(getSoGioLamThem() > 40)
            return 1000000;
        else
            return 0;
    }
    @Override
    public void nhap(){
        super.nhap();
        System.out.print("Nhap so gio lam them: ");
        soGioLamThem = sc.nextInt();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("So gio lam them: "+ getSoGioLamThem());
        System.out.println("Luong: "+tinhLuong());
    }
    
}
