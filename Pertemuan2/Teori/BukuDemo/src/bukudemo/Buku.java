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
    public class Buku{
        //atribut
        String judul,pengarang,penerbit;
        int tahun;
        //konstrukt
        public Buku(String judul, String penerbit, String pengarang, int tahun){
            this.judul = judul;
            this.penerbit = penerbit;
            this.pengarang = pengarang;
            this.tahun = tahun;
        }
        //method
        public void CetakBuku (){
            System.out.println(judul + " , " + pengarang + " , " + penerbit + " , " + tahun);
        }
}

