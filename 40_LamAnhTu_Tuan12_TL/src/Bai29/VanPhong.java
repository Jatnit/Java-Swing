/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai29;

/**
 *
 * @author latu2
 */
public class VanPhong extends NhanVien {
    private double soNgayLam,troCap;

    public double getSoNgayLam() {
        return soNgayLam;
    }

    public void setSoNgayLam(double soNgayLam) {
        this.soNgayLam = soNgayLam;
    }

    public double getTroCap() {
        return troCap;
    }

    public void setTroCap(double troCap) {
        this.troCap = troCap;
    }

    @Override
    public Double TinhLuong() {
        return LCB + getSoNgayLam() * 100000 + getTroCap();
    }
    @Override
    public void nhap(){
        super.nhap();
        System.out.print("Nhap so ngay lamm viec: ");
        soNgayLam = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhap so tien tro cap: ");
        troCap = sc.nextDouble();
        sc.nextLine();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("So ngay lam: "+ getSoNgayLam());
        System.out.println("So tien tro cap: "+ getTroCap());
        System.out.println("Luong: "+TinhLuong());
    }
}
