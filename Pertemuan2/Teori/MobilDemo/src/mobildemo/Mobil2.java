/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobildemo;

/**
 *
 * @author DEVI
 */
public class Mobil2 {
    String warna;
    int tahunProduksi;
    int ubahGigi;
    boolean on = false;
    
    public Mobil2 (){
    }
        public void hidupkanMobil(){
            on = true;
	}
        public void matikanMobil(){
            on = false;
        }
        public void setGigi(int pertambahanGigi){
            ubahGigi = ubahGigi+ pertambahanGigi;
        }
        int getGigi(){
            return ubahGigi;
        }
        
            
    
}
