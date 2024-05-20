/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai31;

/**
 *
 * @author latu2
 */
public class KhachSan extends BatDongSan implements PhuPhi {
    private int soSao;

    public int getSoSao() {
        return soSao;
    }

    public void setSoSao(int soSao) {
        this.soSao = soSao;
    }
    @Override
    public double phiKinhDoanh(){
        return cRong *5000;
    }
    @Override
    public double giaTri() {
        return (cDai *cRong)*100000 +getSoSao() * 50000 +phiKinhDoanh();
    }
    @Override
    public void nhap(){
        super.nhap();
        System.out.println("nhap so sao cua khach san: ");
        soSao = sc.nextInt();
        sc.nextLine();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Day la Khach san "+getSoSao());
        System.out.println("GIA TRI: "+giaTri());
    }
    
}
