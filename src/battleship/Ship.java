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
public class Ship {
    private int fire;
    private int crit;
    private int damage;
    
    public Ship(){
    fire = 1;
    crit = (int) (Math.random() * 6);
    damage = 30000;
}
    public int GetFire(){
        return fire;
    }
    public int GetCrit(){
        crit = (int) (Math.random() * 6);
        return crit;
    }

    int getDamage() {
       return damage;
    }
}
