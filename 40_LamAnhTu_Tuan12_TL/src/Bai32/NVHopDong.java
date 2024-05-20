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
public class NVHopDong extends LDNgoaiBienChe implements XetKhenThuong {
    private int ngayCong;

    public NVHopDong(int ngayCong, String maSo, String hoTen, int namSinh, double mucLuong) {
        super(maSo, hoTen, namSinh, mucLuong);
        this.ngayCong = ngayCong;
    }

    public NVHopDong() {
        
    }

   
    public int getNgayCong() {
        return ngayCong;
    }

    public void setNgayCong(int ngayCong) {
        this.ngayCong = ngayCong;
    }
    
    @Override
    public double tinhLuong() {
        return mucLuong * getNgayCong() + tinhKhenThuong();
    }

    @Override
    public double tinhKhenThuong() {
        if(getNgayCong() > 25)
            return 1500000;
        else
            return 0;
    }
    @Override
    public void nhap(){
        super.nhap();
        System.out.print("Nhap ngay cong: ");
        ngayCong = sc.nextInt();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Ngay cong: "+getNgayCong());
        System.out.println("Luong: "+tinhLuong());
    }
}
