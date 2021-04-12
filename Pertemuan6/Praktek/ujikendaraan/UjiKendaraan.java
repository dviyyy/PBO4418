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
public class UjiKendaraan {
    public static void kendaraanmelaju(Vehicle vehikel){
        vehikel.goStraight();
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle sepeda = new Bicycle();
        MotorVehicle mtr = new MotorVehicle();
        Vehicle vehikell = new Vehicle();
        car carr = new car();
        
        System.out.println("---------------");
        System.out.println(sepeda.speed);
        System.out.println(sepeda.color);
        sepeda.turnRight();
        sepeda.ringBell();
        
        System.out.println("---------------");
        
        System.out.println(mtr.speed);
        System.out.println(mtr.color);
        System.out.println(mtr.licencePlate);
        System.out.println(mtr.sizeofEngine);
        mtr.turnLeft();
        System.out.println(mtr.getLicencePlate());
        System.out.println(mtr.getSizeofEngine());
        
        System.out.println("---------------");
        
        vehikell.goStraight();
        vehikell.turnLeft();
        vehikell.turnLeft();
        
        System.out.println();
        
        System.out.println("---------------");
        
        carr.setSeatBelt(0);
        System.out.println("seatbelt: " + carr.getSeatBelt());
        carr.setSeatBelt(1);
        System.out.println("seatbelt: " + carr.getSeatBelt());
        
        System.out.println("---------------");
        
        System.out.println();
        kendaraanmelaju(new Vehicle());
        kendaraanmelaju(new Bicycle());
        kendaraanmelaju(new MotorVehicle());
        kendaraanmelaju(new car());
    }
                
}


   