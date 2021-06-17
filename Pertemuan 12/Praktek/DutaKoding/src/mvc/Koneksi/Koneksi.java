/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Koneksi;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author DEVI
 */
public class Koneksi {
    static Connection cnn;
    
    public static Connection connection(){
        if(cnn==null){
            MysqlDataSource data=new MysqlDataSource();
            data.setDatabaseName("db_dutacoding");
            data.setUser("root");
            data.setPassword("");
            try{
                cnn=data.getConnection();
            }catch(SQLException ex){
                System.out.println("tidak konek");
            }
        }
        return cnn;
    }
}
