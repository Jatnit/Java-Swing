/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuong3.Bai2.DAO;

import Chuong3.Bai2.MODEL.CDDVD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author latu2
 */
public class DAO {

    public int addDia(CDDVD s) {

        try {
            String sql = "Insert into CDDVDCollection(Ma,TieuDe,LoaiDia,NamXuatban)"
                    + "Values(?,?,?,?)";
            Connection con = ConnectCSDL.OpenConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, s.getMa());
            ps.setString(2, s.getTieuDe());
            ps.setString(3, s.getLoai());
            ps.setInt(4, s.getNamXB());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int removeDia(String Ma) {

        try {
            String sql = "DELETE FROM CDDVDCollection WHERE Ma = ?";
            Connection con = ConnectCSDL.OpenConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, Ma);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int suaDia(CDDVD s) {

        try {
            String sql = "UPDATE CDDVDCollection set TieuDe=? ,LoaiDia=? ,NamXuatban=? "
                    + "WHERE Ma=?";
            Connection con = ConnectCSDL.OpenConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, s.getTieuDe());
            ps.setString(2, s.getLoai());
            ps.setInt(3, s.getNamXB());
            ps.setString(4, s.getMa());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public ArrayList<CDDVD> findDia(String DuLieu) {
        ArrayList<CDDVD> list = new ArrayList<>();
        try {
            float so = 0;
            if (DuLieu.isEmpty()) {
                so = 0;
            } else if (DuLieu.chars().allMatch(Character::isDigit)) {
                so = Float.parseFloat(DuLieu);
            }
            String sql = "SELECT * FROM CDDVDCollection WHERE Ma like '%" + DuLieu + "%' OR TieuDe like N'%" + DuLieu + "%' OR LoaiDia like '%" + DuLieu + "%' OR NamXuatBan=" + so;
            Connection con = ConnectCSDL.OpenConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next() ){
                String ma = rs.getString("Ma");
                String tieude = rs.getString("TieuDe");
                String loaidia = rs.getString("LoaiDia");
                int namxuatban =rs.getInt("NamXuatBan");
                CDDVD cd = new CDDVD(ma,tieude,loaidia,namxuatban);
                list.add(cd);
            }
        
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }



    public ArrayList<CDDVD> getListCDDVD() {
        ArrayList<CDDVD> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM CDDVDCollection";
            Connection con = ConnectCSDL.OpenConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                CDDVD s = new CDDVD();
                s.setMa(rs.getString("Ma"));
                s.setTieuDe(rs.getString("TieuDe"));
                s.setLoai(rs.getString("LoaiDia"));
                s.setNamXB(rs.getInt("NamXuatBan"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public static void main(String[] args) {
        new DAO();
    }
}
