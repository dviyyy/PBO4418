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

    
   class SimpleCircle {
       /** The radius of this circle*/
       double radius = 1;
       
       /** Construct a circle object */
       SimpleCircle() {
       }
       
       /** Construct a circle object */
       SimpleCircle(double newRadius){
           radius = newRadius;
       }
       
       /**Return the area of this circle*/
       double getArea() {
           return radius * radius * Math.PI;
       }
       
       /**Return the Perimeter of this circle*/
       double getPerimeter() {
           return 2 * radius * Math.PI;
       } 
       
       /** Set new radius for this circle*/
       double setRadius(double newRadius) {
           return radius = newRadius;
       }
   }
    