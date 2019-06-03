/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package battleship;

import java.util.Scanner;

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
        
        
        int game = 1;
        String Ship;
        while (game == 1){
            Scanner input = new Scanner(System.in);
            int use1, use2, use3, use4, use5;
            use1 = 0;
            use2 = 0;
            use3 = 0;
            use4 = 0;
            use5 = 0;
            while (use1 + use2 + use3 + use4 + use5 < 5){
                 Ship = input.nextLine();
              if (Ship.equals(ship1.GetShip()) && use1 == 0){
                System.out.println (ship1.GetShip() + " fire?");
                for (int i = 0; i < ship1.GetFire();){
                String fire;
                fire = input.nextLine();
                    if ("fire".equals(fire)){
                  if (ship1.GetCrit() == 3){
                        System.out.println ("Super Boom");
                    }  
                  else {
                      System.out.println("normal Boom");
                  }
                  use1 = 1;
                }
                    i++;
                }  
            }
               if (Ship.equals(ship2.GetShip()) && use2 == 0){
                System.out.println (ship2.GetShip() + " fire?");
                for (int i = 0; i < ship2.GetFire();){
                String fire;
                fire = input.nextLine();
                    if ("fire".equals(fire)){
                  if (ship2.GetCrit() == 3){
                        System.out.println ("Super Boom");
                    }  
                  else {
                      System.out.println("normal Boom");
                  }
                  use2 = 1;
                }
                    i++;
                }
        }   
                 if (Ship.equals(ship3.GetShip()) && use3 == 0){
                System.out.println (ship3.GetShip() + " fire?");
                for (int i = 0; i < ship3.GetFire();){
                String fire;
                fire = input.nextLine();
                    if ("fire".equals(fire)){
                  if (ship3.GetCrit() == 3){
                        System.out.println ("Super Boom");
                    }  
                  else {
                      System.out.println("normal Boom");
                  }
                  use3 = 1;
                }
                    i++;
                }
        } 
              if (Ship.equals(ship4.GetShip()) && use4 == 0){
                System.out.println (ship4.GetShip() + " fire?");
                for (int i = 0; i < ship4.GetFire();){
                String fire;
                fire = input.nextLine();
                    if ("fire".equals(fire)){
                  if (ship4.GetCrit() == 3){
                        System.out.println ("Super Boom");
                    }  
                  else {
                      System.out.println("normal Boom");
                  }
                  use4 = 1;
                }
                    i++;
                }
        } 
            if (Ship.equals(ship5.GetShip()) && use5 == 0){
                System.out.println (ship5.GetShip() + " fire?");
                for (int i = 0; i < ship5.GetFire();){
                String fire;
                fire = input.nextLine();
                    if ("fire".equals(fire)){
                  if (ship5.GetCrit() == 3){
                        System.out.println ("Super Boom");
                    }  
                  else {
                      System.out.println("normal Boom");
                  }
                  use5 = 1;
                }
                    i++;
                }
        } 
                }
            
    }
    }
}