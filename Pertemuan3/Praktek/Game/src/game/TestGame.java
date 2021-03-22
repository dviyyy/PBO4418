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
public class TestGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
    GamePlayer a1 = new GamePlayer();
    GameEnemy a2 = new GameEnemy();
    a1.run();
    a1.Run(30);
    a1.Run(60);
    a2.run();
    }
    
}
