/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game;

/**
 *
 * DEVI INDRIYANA PUTRI - A11.2019.12044
 * A11.4418
 */


public class TestGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
     GamePlayer herro=new GamePlayer();
        herro.setDimension(12, 12);
        herro.setPosition(10, 220);
        System.out.println("position Player= "+herro.getX()+","+herro.getY());
        herro.Run(12);
        System.out.println("position Player= "+herro.getX()+","+herro.getY());
        GamePlayer herro2=new GamePlayer();
        herro2.setDimension(12, 32);
        herro2.setPosition(10, 10);

        System.out.println("\n");
        
        GameEnemy monster=new GameEnemy();
        monster.setDimension(12, 32);
        monster.setPosition(10, 10);
        System.out.println("position Enemy= "+monster.getX()+","+monster.getY());
        monster.Run();
        
        System.out.println("=====================================================\n");
        GameEnvironment scane = new GameEnvironment();
        scane.addPlayer(herro);
        scane.addPlayer(herro);
        scane.addPlayer(herro2);
        scane.getAllPlayer();
        scane.removePlayer(herro);
        scane.getAllPlayer();
        scane.addEnemy(monster);
        /*scane.getAllEnemy();*/
        scane.Interaction();

    }
    
}
