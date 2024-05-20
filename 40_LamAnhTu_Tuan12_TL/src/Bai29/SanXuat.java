/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai29;

/**
 *
 * @author latu2
 */
public class SanXuat extends NhanVien {
    private double soSP;

    public double getSoSP() {
        return soSP;
    }

    public void setSoSP(double soSP) {
        this.soSP = soSP;
    }
    
    
    @Override
    public Double TinhLuong() {
        return LCB + getSoSP() * 2000;
    }
    
    @Override
    public void nhap(){
        super.nhap();
        System.out.print("Nhap so luong san pham: ");
        soSP = sc.nextDouble();
        sc.nextLine();
    }
    
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("So luong san pham: "+ getSoSP());
        System.out.println("Luong: "+ TinhLuong());
    }
}
