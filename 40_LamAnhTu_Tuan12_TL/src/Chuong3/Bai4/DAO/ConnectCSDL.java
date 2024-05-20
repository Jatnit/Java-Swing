/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuong3.Bai4.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Administrator
 */
public class ConnectCSDL {
    
    
    public static Connection OpenConnection() throws Exception {
        
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Tải...");
            String url ="jdbc:sqlserver://localhost:1433;databasename=QLSanPham;integratedSecurity=false;encrypt=false;trustServerCertificate=true;";
            String user ="sa";
            String password ="L@tu4923";
            Connection con = DriverManager.getConnection(url,user,password);
            System.out.println("Kết nối...");
            return con;
    
    }
    
    public static void main(String[] args) {
        new ConnectCSDL();
    }    
}
