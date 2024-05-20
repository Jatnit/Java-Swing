/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTap.Bai2.MODEL;

/**
 *
 * @author latu2
 */
public class Grade {
    private int ID,TiengAnh,TinHoc,GDTC;
    private String MaSV;

    public Grade() {
    }

    public Grade(int ID, int TiengAnh, int TinHoc, int GDTC, String MaSV) {
        this.ID = ID;
        this.TiengAnh = TiengAnh;
        this.TinHoc = TinHoc;
        this.GDTC = GDTC;
        this.MaSV = MaSV;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getTiengAnh() {
        return TiengAnh;
    }

    public void setTiengAnh(int TiengAnh) {
        this.TiengAnh = TiengAnh;
    }

    public int getTinHoc() {
        return TinHoc;
    }

    public void setTinHoc(int TinHoc) {
        this.TinHoc = TinHoc;
    }

    public int getGDTC() {
        return GDTC;
    }

    public void setGDTC(int GDTC) {
        this.GDTC = GDTC;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }
    
}
