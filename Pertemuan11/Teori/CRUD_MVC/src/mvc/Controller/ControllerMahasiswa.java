/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;

import mvc.DAO.DAOMahasiswa;
import mvc.DAOInterface.IMahasiswa;
import mvc.Model.Mahasiswa;
import mvc.Model.TabelModelMahasiswa;
import mvc.View.FormMahasiswa;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author DEVI
 */
public class ControllerMahasiswa {
    FormMahasiswa frame;
    IMahasiswa implMahasiswa;
    List<Mahasiswa> lb;
    
    public ControllerMahasiswa(FormMahasiswa frame) {
        this.frame = frame;
        implMahasiswa = new DAOMahasiswa();
        lb = implMahasiswa.getAll();
}
    //mengosongkan field
    public void reset() {
        frame.getTxtID().setText("");
        frame.getTxtNim().setText("");
        frame.getTxtNama().setText("");
        frame.getTxtJk().setSelectedItem("");
        frame.getTxtAlamat().setText("");
        
    }
    //menampilkan data ke dalam tabel
    public void isiTable() {
        lb = implMahasiswa.getAll();
        TabelModelMahasiswa tmb = new TabelModelMahasiswa(lb);
        frame.getTabelData().setModel(tmb);
    }
    //merupakan fungsi untuk menampilkan data yang dipilih dari tabel
    public void isiField(int row) {
        frame.getTxtID().setText(lb.get(row).getId().toString());
        frame.getTxtNim().setText(lb.get(row).getNim());
        frame.getTxtNama().setText(lb.get(row).getNama());
        frame.getTxtJk().setSelectedItem(lb.get(row).getJk());
        frame.getTxtAlamat().setText(lb.get(row).getAlamat());
    }
    //merupakan fs untuk insert data berdasarkan inputan user dari textfield di frame
    public void insert() {
        if (!frame.getTxtNim().getText().trim().isEmpty()& !frame.getTxtNama().getText().trim().isEmpty()) {
            Mahasiswa b = new Mahasiswa();
            b.setNim(frame.getTxtNim().getText());
            b.setNama(frame.getTxtNama().getText());
            b.setJk(frame.getTxtJk().getSelectedItem().toString());
            b.setAlamat(frame.getTxtAlamat().getText());
            implMahasiswa.insert(b);
            JOptionPane.showMessageDialog(null, "Simpan Data sukses");
        } else {
            JOptionPane.showMessageDialog(frame, "Data Tidak Boleh Kosong");
        }
    }
    public void update() {
        if (!frame.getTxtID().getText().trim().isEmpty()) {
            Mahasiswa b = new Mahasiswa();
            b.setNim(frame.getTxtNim().getText());
            b.setNama(frame.getTxtNama().getText());
            b.setJk(frame.getTxtJk().getSelectedItem().toString());
            b.setAlamat(frame.getTxtAlamat().getText());
            b.setId(Integer.parseInt(frame.getTxtID().getText()));
            implMahasiswa.insert(b);
            JOptionPane.showMessageDialog(null, "Simpan Data sukses");
        } else {
            JOptionPane.showMessageDialog(frame, "Pilih Data yang Akan Diubah");
        }
    }
    //berfungsi menghapus data yang dipilih
    public void delete() {
        if (!frame.getTxtID().getText().trim().isEmpty()) {
            int id = Integer.parseInt(frame.getTxtID().getText());
            implMahasiswa.delete(id);
            JOptionPane.showMessageDialog(null, "Hapus Data Sukses");
        } else {
            JOptionPane.showMessageDialog(frame, "Pilih Data yang akan dihapus");
        }
    }
    
    public void isiTableCariNama() {
        lb = implMahasiswa.getCariNama(frame.getTxtCariNama().getText());
        TabelModelMahasiswa tmb = new TabelModelMahasiswa(lb);
        frame.getTabelData().setModel(tmb);
    }
    
    public void carinama() {
        if (!frame.getTxtCariNama().getText().trim().isEmpty()) {
            implMahasiswa.getCariNama(frame.getTxtCariNama().getText());
            isiTableCariNama();
        } else {
            JOptionPane.showMessageDialog(frame, "SILAHKAN PILIH DATA");
        }
    }
}

