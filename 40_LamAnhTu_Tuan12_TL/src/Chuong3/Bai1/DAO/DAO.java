package Chuong3.Bai1.DAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Chuong3.Bai1.MODEL.KhachHang;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author latu2
 */
public class DAO {

    private Connection conn;

    public DAO() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=QLKhachHang;"
                    + "username=sa;password=L@tu4923");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean addKH(KhachHang s) {

        String sql = "INSERT INTO KhachHang(MaKH, TenKH, NamSinh, MaNhom) "
                + "VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getMaKH());
            ps.setString(2, s.getTenKH());
            ps.setInt(3, s.getNamSinh());
            ps.setString(4, s.getMaNhom());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean removeKH(KhachHang s) {
        String sql = "DELETE FROM KhachHang WHERE MaKH = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getMaKH());
            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<KhachHang> getListKH() {
        ArrayList<KhachHang> list = new ArrayList<>();
        String sql = "SELECT * FROM KhachHang";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang s = new KhachHang();
                s.setMaKH(rs.getString("MaKH"));
                s.setTenKH(rs.getString("TenKH"));
                s.setNamSinh(rs.getInt("NamSinh"));
                s.setMaNhom(rs.getString("MaNhom"));

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
