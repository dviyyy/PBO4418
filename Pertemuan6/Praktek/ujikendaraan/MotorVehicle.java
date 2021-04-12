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
public class MotorVehicle extends Vehicle {
    int sizeofEngine = 1;
    String licencePlate = "D 3 V1";
    
    
    public MotorVehicle(){
    }
    public MotorVehicle(int sizeofEngine, String licensePlate) {
        this.sizeofEngine = sizeofEngine;
        this.licencePlate = licencePlate;
    }
    public int getSizeofEngine (){
        return this.sizeofEngine;
    }
    public String getLicencePlate(){
        return this.licencePlate;
    }
    
}
    
