/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author vv
 */
public class GameEnemy {
    //INSTANSIASI
    double width;
    double height;
    int positionX;
    int positionY;
    
    //KONSTRUKTOR
    public GameEnemy(){
    }
    public GameEnemy(double width, double height){
    }
    public GameEnemy(double width, double height, int positionX, int positionY){
    }
    public void setDimension(double width, double height){
        this.width = width;
        this.height = height;
    }
    public void setPosition(int positionX, int positionY){
        this.positionX = positionX;
        this.positionY = positionY;
    }
    public double getWidth(){
      return this.width;  
    }
    public double getHeight(){
      return this.height;
    }
    public int getX (){
        return this.positionX;
    }
    public int getY (){
        return this.positionY;
    }
    public void run(){
        System.out.println("Enemy is Running");
        
    }
    }
