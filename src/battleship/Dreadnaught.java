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
public class Dreadnaught extends Ship{
    private int health;
    private int segments;
    private int damage; 
    private String Ship;

    
    public Dreadnaught (){
        health = 200;
        damage = 30;
        segments = 5;
        Ship = "Dreadnaught";
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
