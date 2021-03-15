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
public class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;

    public TV(){
    }
        public void turnOn(){
            on = true;
	}
	public void setChannel(int newChannel){
            if (on && newChannel >= 1 && newChannel <= 60)
                channel = newChannel;
	}
	public void setVolume(int newVolumeLevel){
            if (on && newVolumeLevel >= 1 && newVolumeLevel <= 10)
                volumeLevel = newVolumeLevel; 
	}
        
        public void channelUp(){
            if(on && channel < 100)
                channel++;
        }
        public void channelDown(){
            if(on && channel > 1)
                channel--;
        }
        public void volumeUp(){
            if(on && volumeLevel < 10)
                volumeLevel++;
        }
        public void volumeDown(){
            if(on && volumeLevel > 1)
                volumeLevel--;
        }
}