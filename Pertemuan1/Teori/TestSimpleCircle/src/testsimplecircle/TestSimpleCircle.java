/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsimplecircle;

/**
 *
 * @author DEVI
 */
public class TestSimpleCircle {
    public static void main(String[] args) {
        // Create a circle with radius 1
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("Luas lingkaran dari jari-jari "
        + circle1.radius + " adalah " + circle1.getArea());
        
        //Create a circle with radius 50
        SimpleCircle circle2 = new SimpleCircle(50);
        System.out.println("Luas lingkaran dari jari-jari "
        + circle2.radius + " adalah " + circle2.getArea());
        
        //Create a circle with radius 125
        SimpleCircle circle3 = new SimpleCircle(100);
        System.out.println("Luas lingkaran dari jari-jari "
        + circle3.radius + " adalah " + circle3.getArea());
        
        //Modify circle radius
        circle2.radius = 150; // or circle2.setRadius(150)
        System.out.println("Luas lingkaran dari jari-jari "
        + circle2.radius + " adalah " + circle2.getArea());
    }   
}
