/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Model;

/**
 *
 * @author DEVI
 */
public class Pendaftaran {

    /**
     * @return the ktp
     */
    public Integer getktp() {
        return ktp;
    }

    /**
     * @param ktp the ktp to set
     */
    public void setktp(Integer ktp) {
        this.ktp = ktp;
    }

    /**
     * @return the nama
     */
    public String getnama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setnama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the jk
     */
    public String getjk() {
        return jk;
    }

    /**
     * @param jk the jk to set
     */
    public void setjk(String jk) {
        this.jk = jk;
    }

    /**
     * @return the alamat
     */
    public String getalamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setalamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the iusia
     */
    public Integer getusia() {
        return usia;
    }

    /**
     * @param iusia the iusia to set
     */
    public void setusia(Integer iusia) {
        this.usia = usia;
    }

    /**
     * @return the alasan
     */
    public String getalasan() {
        return alasan;
    }

    /**
     * @param alasan the alasan to set
     */
    public void setalasan(String alasan) {
        this.alasan = alasan;
    }
   private Integer ktp;
   private String nama;
   private String jk;
   private String alamat;
   private Integer usia;
   private String alasan;

    Object getUsia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setId(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
