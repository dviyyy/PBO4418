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

public class MobilDemo2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // MEMBUAT OBJEK
        Mobil2 mobilku = new Mobil2();
        mobilku.hidupkanMobil();
        mobilku.setGigi(1);
       
        //MEMANGGIL ATRIBUT DAN MEMBERI NILAI
        mobilku.warna = "Hitam";
        mobilku.tahunProduksi = 2006;
        System.out.println("Warna: " + mobilku.warna);
        System.out.println("Tahun: " + mobilku.tahunProduksi);
        System.out.println("Gigi saat ini: " + mobilku.getGigi());
           
    }   
}
