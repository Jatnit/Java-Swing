/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai27;

/**
 *
 * @author Latu4
 */
public class SDDaGiac {
    public static void main(String[] args) {
        DaGiac daGiac = new DaGiac();
        daGiac.nhap();

        System.out.println("Thong tin da giac:");
        daGiac.xuat();

        double chuVi = daGiac.tinhChuVi();
        System.out.println("Chu vi cua da giac la: " + chuVi);

        Dinh diemXaNhat = daGiac.timDinhXaNhat();
        System.out.println("Dinh xa goc toa do nhat la: (" + diemXaNhat.getX() + ", " + diemXaNhat.getY() + ")");
    }
}
