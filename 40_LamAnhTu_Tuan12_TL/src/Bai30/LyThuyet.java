/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai30;

/**
 *
 * @author latu2
 */
public class LyThuyet extends MonHoc {

    private double TL, GK, CK;

    public double getTL() {
        return TL;
    }

    public void setTL(double TL) {
        this.TL = TL;
    }

    public double getGK() {
        return GK;
    }

    public void setGK(double GK) {
        this.GK = GK;
    }

    public double getCK() {
        return CK;
    }

    public void setCK(double CK) {
        this.CK = CK;
    }

    @Override
    public double tinhDiem() {
        return getTL() * (20 / 100) + getGK() * (30 / 100) + getCK() * (1 / 2);
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhap diem tieu luan: ");
        TL = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhap diem giua ky: ");
        GK = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhap diem cuoi ky: ");
        CK = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Diem tieu luan: "+getTL());
        System.out.println("Diem giua ky: "+getGK());
        System.out.println("Diem cuoi ky: "+getCK());
        System.out.println("DIEM TONG: "+tinhDiem());
    }
}
