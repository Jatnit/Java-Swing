/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTap.Bai2.DAO;

import OnTap.Bai2.MODEL.NguoiDung;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author latu2
 */
public class DBController {
    
    public NguoiDung dangNhap(String tendn, String password) {
        NguoiDung nd = null;

        try {
            String sql = "Select * from USERS where username = ? and password=?";
            Connection con = ConnectCSDL.OpenConnection();
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, tendn);
            pre.setString(2, password);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                nd = new NguoiDung();
                nd.setUsername(rs.getString("username"));
                nd.setPassword(rs.getString("password"));
                nd.setRole(rs.getString("role"));
            }
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return nd;
    }
}
