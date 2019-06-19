/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package battleship;

/**
 *
 * @author anhen3335
 */
public class Transporteur extends Ship {
    private int health;
    private int segments;
    private int damage; 
    private int fire; 
    private String Ship;
    
    public Transporteur (){
        fire = 2;
        health = 80;
        segments = 4;
        damage = 10;
        Ship = "Transporteur";
    }
    public int getFire(){
        return fire;
    }
    public int getDamage(){
        return damage;
    }
    public String getShip (){
        return Ship;
       }
            public int getHealth (){
        return health;
       }
        public int getSegments (){
        return segments;
       }
}
