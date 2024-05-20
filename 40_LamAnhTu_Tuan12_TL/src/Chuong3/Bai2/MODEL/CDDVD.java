/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuong3.Bai2.MODEL;




/**
 *
 * @author latu2
 */
public class CDDVD {
    private String Ma,TieuDe,Loai;
    private int NamXB;

    public CDDVD(String Ma, String TieuDe, String Loai, int NamXB) {
        this.Ma = Ma;
        this.TieuDe = TieuDe;
        this.Loai = Loai;
        this.NamXB = NamXB;
    }
    public CDDVD(){};

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getTieuDe() {
        return TieuDe;
    }

    public void setTieuDe(String TieuDe) {
        this.TieuDe = TieuDe;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }

    public int getNamXB() {
        return NamXB;
    }

    public void setNamXB(int NamXB) {
        this.NamXB = NamXB;
    }
    
}
