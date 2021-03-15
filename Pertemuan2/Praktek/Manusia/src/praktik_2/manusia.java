/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktik_2;

/**
 *
 * @author DEVI
 */
public class manusia {
    String nama;
    boolean punyaTV;
    
    manusia(){
    }
    public manusia(String nama){
            this.nama = nama;
        }
    public String namaSaya(){
            return nama;
        }
    void beliTV(TV tiviku){
        punyaTV = true;
        System.out.println(punyaTV);
        }
    void jualSemuaTV(){
        punyaTV = false;
        System.out.println(punyaTV);
        } 
    boolean cekTV(){
            return punyaTV;
        }
}
