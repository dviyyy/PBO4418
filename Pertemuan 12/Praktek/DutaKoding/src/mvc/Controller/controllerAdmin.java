/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;

import mvc.DAO.DAOPendaftaran;
import mvc.DAOInterface.Ipendaftaran;
import mvc.Model.Pendaftaran;
import mvc.View.GUIAdmin;
import java.util.List;
import javax.swing.JOptionPane;
import mvc.Model.TabelModelPendaftaran;

/**
 *
 * @author DEVI
 */
public class controllerAdmin {
    GUIAdmin userFrame;
    Ipendaftaran implPendaftaran;
    List<Pendaftaran> lb;
    
    public controllerAdmin(GUIAdmin userFrame){
        this.userFrame = userFrame;
        implPendaftaran = new DAOPendaftaran() {
            @Override
            public void update(Pendaftaran b) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        lb = implPendaftaran.getAll();
    }
    
    
    
    public void isiTable(){
        throw new UnsupportedOperationException("Not supported yet.");    
    }
    
    public void update(){
        throw new UnsupportedOperationException("Not supported yet.");    
    }
    
    public void reset(){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public void delete(){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
