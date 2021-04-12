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
public class MotorCycle extends MotorVehicle {
   int numGear = 0;
   
   public MotorCycle(){
   }
   public void setGearFoot(int numGear){
       this.numGear = numGear;
   }
   public int getGearFoot(){
       return this.numGear;
       
   }
   
   
}
