package Transportasi;
/**
 *
 * DEVI INDRIYANA PUTRI - A11.2019.12044
 * A11.4418
 */
import Transportasi.Mobil;
import Transportasi.Bicycle;
public class TransportasiDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mobil car = new Mobil();
        car.goStraight();
        car.turnLeft();
        car.turnLeft();
        
        System.out.println();
        
        System.out.println("---------------");
        
        Bicycle spd = new Bicycle ();
        spd.ringBell();
        spd.turnLeft();
        spd.turnLeft();
        
        System.out.println();
        
    }
    
}
