/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujikendaraan;

/**
 *
 * DEVI INDRIYANA PUTRI - A11.2019.12044
 * A11.4418
 */
public class car extends MotorVehicle{
    boolean seatbelt = false;
    
    public car (){
    }
    public void setSeatBelt (int seatbelt){
        if(seatbelt == 1){
            this.seatbelt = true;
        }else if(seatbelt == 0){
            this.seatbelt = false;
        }
    }
    boolean getSeatBelt(){
        return this.seatbelt;
    }
    }
    
