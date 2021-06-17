/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAOInterface;
import java.util.List;
import mvc.Model.Pendaftaran;
/**
 *
 * @author DEVI
 */
public interface Ipendaftaran {
  public void insert(Pendaftaran b);
  public void update (Pendaftaran b);
  public void delete(int id_user);
  public List<Pendaftaran> getAll();
  //public List<Pendaftaran> getCariNama(String nama);
  
}
