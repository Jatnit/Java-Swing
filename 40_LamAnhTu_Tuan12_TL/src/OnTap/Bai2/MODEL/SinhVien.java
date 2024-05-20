/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTap.Bai2.MODEL;

/**
 *
 * @author latu2
 */
public class SinhVien {
    private String MaSV,HoTen,Email,SoDT,DiaChi,Hinh;
    private boolean GioiTinh;

    public SinhVien() {
    }

    public SinhVien(String MaSV, String HoTen, String Email, String SoDT, String DiaChi, String Hinh, boolean GioiTinh) {
        this.MaSV = MaSV;
        this.HoTen = HoTen;
        this.Email = Email;
        this.SoDT = SoDT;
        this.DiaChi = DiaChi;
        this.Hinh = Hinh;
        this.GioiTinh = GioiTinh;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }
    
    
}
