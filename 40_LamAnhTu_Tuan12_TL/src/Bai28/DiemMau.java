/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai28;

import java.util.Scanner;

/**
 *
 * @author Latu4
 */
public class DiemMau extends Diem{
    private String mau;
    
    public DiemMau() {
        super();  
        this.mau = "Trang"; 
    }
    
    public DiemMau(int x, int y, String mau) {
        super(x, y);
        this.mau = mau;
    }

    public void ganMau(String mauMoi) {
        this.mau = mauMoi;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mau: ");
        this.mau = scanner.nextLine();
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Mau: " + this.mau);
    }
}
