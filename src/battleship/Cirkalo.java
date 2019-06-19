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
public class Cirkalo extends Ship{
    private int health;
    private int segments;
    private int damage; 
    private String Ship;
    
    public Cirkalo (){
        health = 150;
        segments = 3;
        damage = 25;
        Ship = "Cirkalo";
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
