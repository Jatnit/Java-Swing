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
public class GVThinhGiang extends LDNgoaiBienChe{
    private int soTietGD;
    private String trinhDo;

    public int getSoTietGD() {
        return soTietGD;
    }

    public void setSoTietGD(int soTietGD) {
        this.soTietGD = soTietGD;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public GVThinhGiang() {
        this.soTietGD = 0;
        this.trinhDo = "DH";
    }

    

    public GVThinhGiang(int soTietGD, String trinhDo, String maSo, String hoTen, int namSinh, double mucLuong) {
        super(maSo, hoTen, namSinh, mucLuong);
        this.soTietGD = soTietGD;
        this.trinhDo = trinhDo;
    }
//    public double tinhTrinhDo(){
//        if(null == getTrinhDo()) 
//            return 0;
//        else return switch (getTrinhDo()) {
//            case "DH" -> 1;
//            case "THS" -> 1.2;
//            case "TS" -> 1.5;
//            case "PGS" -> 1.2;
//            case "GS" -> 2;
//            default -> 0;
//        };
//    }
    @Override
    public double tinhLuong() {
        return mucLuong * getSoTietGD() /** tinhTrinhDo()*/;
    }
    @Override
    public void nhap(){
        super.nhap();
        System.out.print("Nhap so tiet giang day: ");
        soTietGD = sc.nextInt();
        System.out.print("Nhap trinh do chuyen mon: ");
        trinhDo = sc.nextLine();
    }
    
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("So tiet giang day: "+ getSoTietGD());
        System.out.println("Trinh do chuyen mon: "+ getTrinhDo());
        System.out.println("Luong: "+tinhLuong());
    }
}
