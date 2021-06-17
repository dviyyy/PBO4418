/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;

import mvc.DAO.DAOPendaftaran;
import mvc.DAOInterface.Ipendaftaran;
import mvc.Model.Pendaftaran;
import mvc.View.GUIUser;
import java.util.List;
import javax.swing.JOptionPane;
import mvc.Model.TabelModelPendaftaran;

/**
 *
 * @author DEVI
 */
public class controllerUser {
    GUIUser userFrame;
    Ipendaftaran implPendaftaran;
    List<Pendaftaran> lb;
    
    public controllerUser(GUIUser userFrame){
        this.userFrame = userFrame;
        implPendaftaran = new DAOPendaftaran() {
            @Override
            public void update(Pendaftaran b) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        lb = implPendaftaran.getAll();
    }
    
    public void insert() {
        if (!userFrame.getTxt_ktp().getText().trim().isEmpty() & !userFrame.getTxt_nama().getText().trim().isEmpty()) {
            Pendaftaran b = new Pendaftaran();
            b.setktp(Integer.parseInt(userFrame.getTxt_ktp().getText()));
            b.setnama(userFrame.getTxt_nama().getText());
            b.setjk(userFrame.getTxt_jk().getSelectedItem().toString());
            b.setalamat(userFrame.getTxt_alamat().getText());
            b.setusia(Integer.parseInt(userFrame.getTxt_usia().getText()));
            b.setalasan(userFrame.getTxt_alasan().getText());
            implPendaftaran.insert(b);
            JOptionPane.showMessageDialog(null, "Simpan Data Sukses");
        } else {
            JOptionPane.showMessageDialog(userFrame, "Data Tidak Boleh Kosong");
        }
    } 
    
    public void reset() {
        userFrame.getTxt_ktp().setText("");
        userFrame.getTxt_nama().setText("");
        userFrame.getTxt_jk().setSelectedItem("");
        userFrame.getTxt_alamat().setText("");
        userFrame.getTxt_usia().setText("");
        userFrame.getTxt_alasan().setText("");
    }
    
    public void isiNilai(int row) {
        userFrame.getTxt_ktp().setText(lb.get(row).getktp().toString());
        userFrame.getTxt_nama().setText(lb.get(row).getnama());
        userFrame.getTxt_jk().setSelectedItem(lb.get(row).getjk());
        userFrame.getTxt_alamat().setText(lb.get(row).getalamat());
        userFrame.getTxt_usia().setText(lb.get(row).getusia().toString());
        userFrame.getTxt_alasan().setText(lb.get(row).getalasan());
    }
    
    public void isiTable(){
        throw new UnsupportedOperationException("Not supported yet.");    
    }
}

    

        
    

