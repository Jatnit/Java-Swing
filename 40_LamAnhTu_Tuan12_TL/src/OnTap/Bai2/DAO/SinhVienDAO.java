/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTap.Bai2.DAO;

import OnTap.Bai2.MODEL.SinhVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author latu2
 */
public class SinhVienDAO {
    public ArrayList<SinhVien> getListSinhVien() {
        ArrayList<SinhVien> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM STUDENTS";
            Connection con = ConnectCSDL.OpenConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                SinhVien sv = new SinhVien();
                sv.setMaSV(rs.getString("MaSV"));
                sv.setHoTen(rs.getString("HoTen"));
                sv.setEmail(rs.getString("Email"));
                sv.setSoDT(rs.getString("SoDT"));
                
                boolean gioiTinh = rs.getBoolean("GioiTinh");
                sv.setGioiTinh(gioiTinh);
                
                sv.setDiaChi(rs.getString("DiaChi"));
                sv.setHinh(rs.getString("Hinh"));
                list.add(sv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    
    public int addNhanVien(SinhVien sv) {
        try {
            String sql = "INSERT INTO STUDENTS(MaSV,HoTen,Email,SoDT,GioiTinh,DiaChi,Hinh)"
                    + "VALUES(?,?,?,?,?,?,?)";
            Connection con = ConnectCSDL.OpenConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, sv.getMaSV());
            ps.setString(2, sv.getHoTen());
            ps.setString(3, sv.getEmail());
            ps.setString(4, sv.getSoDT());
            ps.setBoolean(5, sv.isGioiTinh());
            ps.setString(6, sv.getDiaChi());
            ps.setString(7, sv.getHinh());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
}
