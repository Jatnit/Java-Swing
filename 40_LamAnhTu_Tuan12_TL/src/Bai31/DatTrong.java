/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai31;

/**
 *
 * @author latu2
 */
public class DatTrong extends BatDongSan {
    @Override
    public double giaTri() {
        return (cDai *cRong) *10000;
    }
    @Override
    public void nhap(){
        super.nhap();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("GIA TRI: "+giaTri());
    }
}
