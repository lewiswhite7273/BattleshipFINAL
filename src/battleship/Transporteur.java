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
    
    public Transporteur (){
        fire = 2;
    }
        public int GetFire(){
        return fire;
    }
    
}
