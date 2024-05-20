/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai28;

/**
 *
 * @author Latu4
 */
public class SDDiemMau {
    public static void main(String[] args) {

        DiemMau diemA = new DiemMau(5, 10, "Trang");
        System.out.println("Thong tin diem A:");
        diemA.hienThi();

        DiemMau diemB = new DiemMau();
        System.out.println("Nhap thong tin diem B:");
        diemB.nhap();
        System.out.println("Thong tin diem B truoc khi doi:");
        diemB.hienThi();

        diemB.x += 10;
        diemB.y += 8;

        System.out.println("Thong tin diem B sau khi doi:");
        diemB.hienThi();
  
        diemB.ganMau("Vang");
        System.out.println("Thong tin diem B sau khi gan mau moi:");
        diemB.hienThi();
    }
}
