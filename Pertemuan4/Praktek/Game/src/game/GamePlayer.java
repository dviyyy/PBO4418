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
public class GamePlayer {
    double width;
    double height;
    int positionX;
    int positionY;
    
    //KONSTRUKTOR
    public GamePlayer(){
    }
    public GamePlayer(double width, double height){
    }
    public GamePlayer(double width, double height, int positionX, int positionY){
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
    public void Run(){
        System.out.println("Player is Running");
    }
    public void Run( int increment){
        positionX = positionX + increment;
        System.out.println("Player still Running ... current position of the player: " + positionX);
    }
        
    
    }


