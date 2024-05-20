/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai29;

/**
 *
 * @author latu2
 */
public class QuanLy extends NhanVien{
    private double hSCV;
    private double Thuong;

    public double gethSCV() {
        return hSCV;
    }

    public void sethSCV(double hSCV) {
        this.hSCV = hSCV;
    }

    public double getThuong() {
        return Thuong;
    }

    public void setThuong(double Thuong) {
        this.Thuong = Thuong;
    }
    
    
    @Override
    public Double TinhLuong() {
        return LCB * gethSCV() + getThuong();
    }
    @Override
    public void nhap(){
        super.nhap();
        System.out.print("Nhap he so chuc vu: ");
        hSCV = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhap thuong: ");
        Thuong = sc.nextDouble();
    }
    
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("He so chuc vu: "+gethSCV());
        System.out.println("Nhap thuong: "+ getThuong());
    }
}
