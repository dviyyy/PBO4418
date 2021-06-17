/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAO;
import mvc.Koneksi.Koneksi;
import mvc.Model.Pendaftaran;
import mvc.DAOInterface.Ipendaftaran;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author DEVI
 */
public abstract class DAOPendaftaran implements Ipendaftaran {
    Connection connection;
    final String insert = "INSERT INTO tbl_pendaftaran (ktp, nama, jk, alamat, usia, alasan)VALUES(?, ?, ?, ?, ?, ?);";
    final String update = "UPDATE tbl_pendaftaran set ktp=?, nama=?, jk=?, alamat=?, usia=?, alasan=? where id_user=?;";
    final String delete = "DELETE FROM tbl_pendaftaran where id_user=?";
    final String select = "SELECT * FROM tbl_pendaftaran;";
    final String carinama = "SELECT * FROM tbl_pendaftaran where nama like?";
    
    public DAOPendaftaran(){
        connection = Koneksi.connection();
    }
    
    @Override
    public void insert(Pendaftaran b) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);
            statement.setInt(1, b.getktp());
            statement.setString(2, b.getnama());
            statement.setString(3, b.getjk());
            statement.setString(4, b.getalamat());
            statement.setInt(5, b.getusia());
            statement.setString(6, b.getalasan());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()){
                b.setId(rs.getInt(1));
            }
        } catch (SQLException ex) {
            System.out.println("Berhasil Input");
        } finally {
            try {
                statement.close();
            }catch (SQLException ex) {
                System.out.println("Gagal Input");
            }
        }
    }
    
    public void delete(int id) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            
            statement.setInt(1, id);
            statement.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Berhasil Delete");
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
            System.out.println("Gagal Update");
        }
        }
    }
    
    @Override
    public List<Pendaftaran> getAll() {
    List<Pendaftaran> lb = null;
    try {
        lb = new ArrayList<Pendaftaran>();
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(select);
        while (rs.next()) {
            Pendaftaran b = new Pendaftaran();
            b.setId(rs.getInt("id_user"));
            b.setktp(rs.getInt("ktp"));
            b.setnama(rs.getString("nama"));
            b.setjk(rs.getString("jk"));
            b.setalamat(rs.getString("alamat"));
            b.setusia(rs.getInt("usia"));
            b.setalasan(rs.getString("alasan"));
            lb.add(b);
            }
    } catch (SQLException ex) {
        Logger.getLogger (DAOPendaftaran.class.getName()).log(Level.SEVERE, null, ex);
        }
    return lb;
}
}   
    

