/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudmysql;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DEVI
 */
public class Koneksi {
    private Connection cnn;
    
    private String driverName = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/pert13";
    private String username = "root";
    private String password = "";
    
    public Connection getKoneksi(){
        if (cnn == null) {
            try {
                Class.forName(driverName);
                System.out.println("Class driver ditemukan");
                
                cnn = (Connection) DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return cnn;
    }
    public static void main(String[] args) {
        Koneksi koneksi = new Koneksi();
        
        koneksi.getKoneksi();
    }
}
