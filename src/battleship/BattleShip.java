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
public class BattleShip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dreadnaught ship1 = new Dreadnaught ();
        System.out.println ("Dreadnaught");
        System.out.println ("Amount of times it can fire " + ship1.GetFire());
        System.out.println ("Crit in 3 " + ship1.GetCrit());
        Transporteur ship2 = new Transporteur ();
        System.out.println ("Transporteur");
        System.out.println ("Amount of times it can fire " + ship2.GetFire());
        System.out.println ("Crit in 3 " + ship2.GetCrit());
        BlockadeRunner ship3 = new BlockadeRunner ();
        System.out.println ("BlockadeRunner");
        System.out.println ("Amount of times it can fire " + ship3.GetFire());
        System.out.println ("Crit in 1 " + ship3.GetCrit());
        StarDestroyer ship4 = new StarDestroyer ();
        System.out.println ("StarDestroyer");
        System.out.println ("Amount of times it can fire " + ship4.GetFire());
        System.out.println ("Crit in 3 " + ship4.GetCrit());
        cirkalo ship5 = new cirkalo ();
        System.out.println ("Cirkalo");
        System.out.println ("Amount of times it can fire " + ship5.GetFire());
        System.out.println ("Crit in 3 " + ship5.GetCrit());
   
    }
    
}