/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai31;

/**
 *
 * @author latu2
 */
public class NhaO extends BatDongSan{
    private int soLau;

    public int getSoLau() {
        return soLau;
    }

    public void setSoLau(int soLau) {
        this.soLau = soLau;
    }
    
    @Override
    public double giaTri() {
        return (cDai *cRong) *10000 +getSoLau() *100000;
    }
    @Override
    public void nhap(){
        super.nhap();
        System.out.print("Nhap so lau: ");
        soLau = sc.nextInt();
        sc.nextLine();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("So lau: "+getSoLau());
        System.out.println("GIA TRI: "+giaTri());
    }
}
