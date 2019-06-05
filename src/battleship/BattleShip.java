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
        int Grid[][] =new int[10][10];
        int row;
        int col;
        for (row =0; row < Grid.length; row++){
            for (col = 0; col<Grid[row].length; col++){
                int num = (int) (Math.random() * 6);
                if (num == 4){
                    Grid[col][row] = 1;
                }
                else {
                    Grid[col][row] = 0;
                }
                System.out.print (col + ": col " + row + ": row " );
                System.out.println ("1 euqals thing there: " + Grid[col][row]);
            }
            
        }
        aiTurn(Grid);
        playerTurn();
    }
    public static void aiTurn(int Grid[][]){
      int row = (int) (Math.random() * 10);
      int col = (int) (Math.random() *10);
     }
    
    public static void playerTurn(){
        Dreadnaught ship1 = new Dreadnaught ();
        Transporteur ship2 = new Transporteur ();
        BlockadeRunner ship3 = new BlockadeRunner ();
        StarDestroyer ship4 = new StarDestroyer ();
        cirkalo ship5 = new cirkalo ();
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
                for (int i = 0; i < ship2.GetFire();){
                System.out.println (ship2.GetShip() + " fire?");
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
                                  System.out.println (use5);
                }
                    i++;
                }
        } 
                }
            game = 1;
            System.out.println ("Turn done");
            
    }  
    }
}