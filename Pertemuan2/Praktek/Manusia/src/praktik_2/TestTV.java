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
public class TestTV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);
        
        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        
       System.out.println("tv1's channel is " + tv1.channel
        + " and volume level is " + tv1.volumeLevel);
        
        System.out.println("tv2's channel is " + tv2.channel
        + " and volume level is " + tv2.volumeLevel);
        
        manusia man1 = new manusia("Devi");
        System.out.println(man1.namaSaya());
        TV tiviku = new TV();
        man1.beliTV(tiviku);
        man1.jualSemuaTV();
            
    }
}
