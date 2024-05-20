/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai30;

/**
 *
 * @author latu2
 */
public class DoAn extends MonHoc {

    private double diemGVHD, diemGVPB;

    public double getDiemGVHD() {
        return diemGVHD;
    }

    public void setDiemGVHD(double diemGVHD) {
        this.diemGVHD = diemGVHD;
    }

    public double getDiemGVPB() {
        return diemGVPB;
    }

    public void setDiemGVPB(double diemGVPB) {
        this.diemGVPB = diemGVPB;
    }

    @Override
    public double tinhDiem() {
        return (getDiemGVHD() + getDiemGVPB()) / 2;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhap diem giao vien huong dan: ");
        diemGVHD = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhap diem cua giao vien phan bien: ");
        diemGVPB = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public void xuat() {
        System.out.println("Diem duoc cho boi giao vien huong dan: " + getDiemGVHD());
        System.out.println("Diem duoc cho boi giao vien phan bien: " + getDiemGVPB());
        System.out.println("DIEM TONG: " + tinhDiem());
    }
}
