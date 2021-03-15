/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematikademo;

/**
 *
 * @author DEVI
 */
class Matematika {
    //mthd
    int hasil;
    
    void penjumlahan(int a,int b) {
        System.out.println("Penjumlahan --> " + a + " + " + b + " = " + (a+b));
    }
    
    void pengurangan(int a,int b) {
        System.out.println("Pengurangan --> " + a + " - " + b + " = " + (a-b));
    }
    
    void perkalian(int a,int b) {
        System.out.println("Perkalian --> " + a + " x " + b + " = " + (a*b));
    }
    
    void pembagian(int a,int b) {
        System.out.println("Pembagian --> " + a + " : " + b + " = " + (a/b));
    }
    
}
