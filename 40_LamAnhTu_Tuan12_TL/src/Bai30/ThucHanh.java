/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai30;

/**
 *
 * @author latu2
 */
public class ThucHanh extends MonHoc {

    private double baiKT1, baiKT2, baiKT3, baiKT4;

    public double getBaiKT1() {
        return baiKT1;
    }

    public void setBaiKT1(double baiKT1) {
        this.baiKT1 = baiKT1;
    }

    public double getBaiKT2() {
        return baiKT2;
    }

    public void setBaiKT2(double baiKT2) {
        this.baiKT2 = baiKT2;
    }

    public double getBaiKT3() {
        return baiKT3;
    }

    public void setBaiKT3(double baiKT3) {
        this.baiKT3 = baiKT3;
    }

    public double getBaiKT4() {
        return baiKT4;
    }

    public void setBaiKT4(double baiKT4) {
        this.baiKT4 = baiKT4;
    }

    @Override
    public double tinhDiem() {
        return (getBaiKT1() + getBaiKT2() + getBaiKT3() + getBaiKT4()) / 4;
    }
    @Override
    public void nhap(){
        super.nhap();
        System.out.print("Nhap bai kiem tra lan 1: ");
        baiKT1 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhap bai kiem tra lan 2: ");
        baiKT2 = sc.nextDouble();
        sc.nextLine();       
        System.out.print("Nhap bai kiem tra lan 3: ");
        baiKT3 = sc.nextDouble();
        sc.nextLine();    
        System.out.print("Nhap bai kiem tra lan 4: ");
        baiKT4 = sc.nextDouble();
        sc.nextLine();        
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Diem bai kiem tra lan 1: "+getBaiKT1());
        System.out.println("Diem bai kiem tra lan 2: "+getBaiKT2());
        System.out.println("Diem bai kiem tra lan 3: "+getBaiKT3());
        System.out.println("Diem bai kiem tra lan 4: "+getBaiKT4());
        System.out.println("DIEM TONG: "+tinhDiem());
    }
}
