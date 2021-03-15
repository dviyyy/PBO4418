/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukudemo;

/**
 *
 * @author DEVI
 */
public class BukuDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Buku bukuku= new Buku("Pemrograman Berbasis Objek dengan Java","Indrajani","Elexmedia Komputindo",2007);
        bukuku.CetakBuku();
        System.out.println("Judul: " + bukuku.judul);
        System.out.println("Pengarang: " + bukuku.pengarang);
        System.out.println("Penerbit: " + bukuku.penerbit);
        System.out.println("Tahun: " + bukuku.tahun);
        
        Buku bukumu = new Buku("Dasar Pemrograman Java","Abdul Kadir","Andi Offset",2004);
        bukumu.CetakBuku();
        System.out.println("Judul: " + bukumu.judul);
        System.out.println("Pengarang: " + bukumu.pengarang);
        System.out.println("Penerbit: " + bukumu.penerbit);
        System.out.println("Tahun: " + bukumu.tahun);
        
    }   
}
