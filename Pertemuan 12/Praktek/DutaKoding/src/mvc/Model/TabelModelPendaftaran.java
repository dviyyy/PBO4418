/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author DEVI
 */
public class TabelModelPendaftaran extends AbstractTableModel{
    List<Pendaftaran> lb;
    
    public TabelModelPendaftaran(List<Pendaftaran>lb){
        this.lb = lb;
    }
    @Override
    public int getColumnCount(){
        return 6;
    }
    
    public int getRowCount(){
        return lb.size();
    }
    
    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "ktp";
            case 1:
                return "nama";
            case 2:
                return "jk";
            case 3:
                return "alamat";
            case 4:
                return "usia";
            case 5:
                return "alasan";
            default:
                return null;
        }
    }
    @Override
    public Object getValueAt(int row, int column){
        switch (column){
            case 0:
                return lb.get(row).getktp();
            case 1:
                return lb.get(row).getnama();
            case 2:
                return lb.get(row).getjk();
            case 3:
                return lb.get(row).getalamat();
            case 4 :
                return lb.get(row).getusia();
            case 5 :
                return lb.get(row).getalasan();
            default:
                return null;
                
        }
    }
}
