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
        int i = 0;
        for (row =0; row < Grid.length; row++){
            for (col = 0; col<Grid[row].length; col++){
                int num = (int) (Math.random() * 6);
                if (num == 4){
                    Grid[col][row] = 1;
                    i++;
                }
                else {
                    Grid[col][row] = 0;
                }
//                System.out.print (col + ": col " + row + ": row " );
//                System.out.println ("1 euqals thing there: " + Grid[col][row]);
            }
        }
                   // Creates the ships
        Dreadnaught ship1 = new Dreadnaught ();
        Transporteur ship2 = new Transporteur ();
        BlockadeRunner ship3 = new BlockadeRunner ();
        StarDestroyer ship4 = new StarDestroyer ();
        cirkalo ship5 = new cirkalo ();
       int PlayerGrid[][] =new int[10][10];
        Scanner place = new Scanner(System.in);
        // Getting position row 
        System.out.println ("You are placing Dreadnaught, what Row: \n");
        int Rowp = place.nextInt ();
        // getting position column
        System.out.println ("You are placing Dreadnaught, what Column: \n");
        // getting health per segment
        int Column = place.nextInt ();
        int health = ship1.GetHealth();
        int segm = ship1.GetSegments();
        int minihealth = health/ segm;
        // places ship
        PlayerGrid[Rowp][Column] = minihealth;
        // Gets direction
        System.out.println ("Do you want your ship to go left, right, up or down? \n");
        String Direction = place.nextLine();
        try {
        }
            catch (){

            }
                
        if (Direction.equalsIgnoreCase("Left")){
 
        }
        else if (Direction.equalsIgnoreCase("Right")){
            
        }
        else if (Direction.equalsIgnoreCase("Up")){
            
        }
        else if (Direction.equalsIgnoreCase("Down")){
            
        }
       row = 0;
       col = 0;
         displayGrid(Grid, row, col);
        int game = 1;
        int turn =1;
        int use1, use2, use3, use4, use5 ;
        use1 = 0;
        use2 = 0;
        use3 = 0;
        use4 = 0;
        use5 = 0;
        String Ship;
        while (game == 1){
            if (turn == 1){
            Scanner input = new Scanner(System.in);
            Ship = input.nextLine();
                // Gets the ship that will fire
               if (Ship.equals(ship1.GetShip()) && use1 == 0){
                System.out.println (ship1.GetShip() + " fire?");
                // How many times the ship can fire
                for (int x = 0; x < ship1.GetFire();){
                String fire;
                fire = input.nextLine();
                // checks if the user fires
                    if ("fire".equals(fire)){
                        // Checks if the ship crits or not
                  if (ship1.GetCrit() == 3){
                        System.out.println ("Super Boom");
                    }  
                  else {
                      System.out.println("normal Boom");
                  }
                use1 = 1;
                }
                    // makes it fire once
                    x++;
                } 
            }
               if (Ship.equals(ship2.GetShip()) && use2 == 0){
                for (int x = 0; x < ship2.GetFire();){
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
                    x++;
                }
        }   
                 if (Ship.equals(ship3.GetShip()) && use3 == 0){
                System.out.println (ship3.GetShip() + " fire?");
                for (int x = 0; x < ship3.GetFire();){
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
                    x++;
                }
        } 
              if (Ship.equals(ship4.GetShip()) && use4 == 0){
                System.out.println (ship4.GetShip() + " fire?");
                for (int x = 0; x < ship4.GetFire();){
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
                    x++;
                }
        } 
            if (Ship.equals(ship5.GetShip()) && use5 == 0){
                System.out.println (ship5.GetShip() + " fire?");
                for (int x = 0; x < ship5.GetFire();){
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
                    x++;
                }
        }
            if (use1 + use2 + use3 + use4 + use5 == 5){
                    use1 = 0;
                    use2 = 0;
                    use3 = 0;
                    use4 = 0;
                    use5 = 0;
                    System.out.println ("Good wor, you mader it to where you are supposed to ");
                }
             turn =2;
             System.out.println (use1);
             System.out.println (use2);
             System.out.println (use3);
             System.out.println (use4);
             System.out.println (use5);
            }
            else if (turn == 2 && i != 0){
       row = (int) (Math.random() * 10);
       col = (int) (Math.random() *10);
      System.out.println (i);
          System.out.println ("Go");
          if (Grid[col][row] == 1){
              System.out.println ("Found One");
             Grid[col][row] = 2;
             i = i-1;
          }
          else if (Grid[col][row] == 0){
        System.out.println ("Miss");
    } 
                System.out.println (i);
                turn =1;
            } 
        }
        System.out.println ("We are done all of the test");
    }
  public static void displayGrid(int Grid[][],int col,int row) {
String output = "  0 1 2 3 4 5 6 7 8 9 10 \n";
    for (row = 0; row < 10; row++) {
      if ((row >= 0) && (row <= 10)) {
        col = 0;
        output += row + " ~ ";
      }
      for (col = 0; col < 10; col++) {
        output += "~ ";
//        System.out.println(output);
//        System.out.println ("hi");
      }
     // System.out.println(output);
      output += "\n";
    }
    System.out.println ("hi");
    System.out.println(output);
  }
  public int Fire(int row){
return 1;
}
  
  
  
  
  
  
  
  
  
  
}
