/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package battleship;
import java.util.Scanner;
import javax.swing.JOptionPane;

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
        int i = 15;
        
        
        // makes the grid for the A.I.
        
        
        for (row =0; row < Grid.length; row++){
            for (col = 0; col<Grid[row].length; col++){
                int num = (int) (Math.random() * 6);
                if (num == 4){
                    Grid[col][row] = 30;
                }
                else {
                    Grid[col][row] = 0;
                }
//                System.out.print (col + ": col " + row + ": row " );
//                System.out.println ("1 euqals thing there: " + Grid[col][row]);
            }
        }
        
        
        // plcae the player ship
        
        
                   // Creates the ships
        Dreadnaught ship1 = new Dreadnaught ();
        Transporteur ship2 = new Transporteur ();
        cirkalo ship3 = new cirkalo ();
        StarDestroyer ship4 = new StarDestroyer ();
        BlockadeRunner ship5 = new BlockadeRunner();
        Ship ship6 = new Ship ();
       int PlayerGrid[][] = new int[10][10];
       for (row =0; row < PlayerGrid.length; row++){
            for (col = 0; col<PlayerGrid[row].length; col++){
                    PlayerGrid[col][row] = 0;
                }
       }
        Scanner place = new Scanner(System.in);
        // Getting position row 

        // getting health per segment
        int Column = 1000;
        int health= 987;
        int segm = 6978;
        int miniHealth =97654;
        int a =97645;
        int Rowp = place.nextInt ();
        // places ship
                for (int numShip = 5; numShip > 0;){
                  if (numShip == 5){
                      
                  }
                  if (numShip == 5){
        System.out.println ("The ship will build downwards so understand that");
        System.out.println ("You are placing head of Dreadnaught, what Row, : \n");
        Rowp = place.nextInt (); 
        System.out.println ("You are placing head of Dreadnaught, what Column: \n");
        Column = place.nextInt ();
        health = ship1.GetHealth();
        segm = ship1.GetSegments();
        miniHealth = health/ segm;
        a = ship1.GetSegments() -1;
                  }
        if(numShip == 4){
       System.out.println ("The ship will build downwards so understand that");
        System.out.println ("You are placing head of Transporteur, what Row, : \n");
        Rowp = place.nextInt (); 
        System.out.println ("You are placing head of Transporteur, what Column: \n");
        Column = place.nextInt ();
        health = ship2.GetHealth();
        segm = ship2.GetSegments();
       miniHealth = health/ segm;
        a = ship2.GetSegments() -1;    
                  }
        if (numShip == 3){
        System.out.println ("The ship will build downwards so understand that");
        System.out.println ("You are placing head of Cirkalo, what Row, : \n");
        Rowp = place.nextInt (); 
        System.out.println ("You are placing head of Cirkalo, what Column: \n");
        Column = place.nextInt ();
        health = ship3.GetHealth();
        segm = ship3.GetSegments();
       miniHealth = health/ segm;
        a = ship3.GetSegments() -1;  
                  }   
                  if (numShip == 2){
        System.out.println ("The ship will build downwards so understand that");
        System.out.println ("You are placing head of StarDestroyer, what Row, : \n");
        Rowp = place.nextInt (); 
        System.out.println ("You are placing head of StarDestroyer, what Column: \n");
        Column = place.nextInt ();
        health = ship4.GetHealth();
        segm = ship4.GetSegments();
        miniHealth = health/ segm;
        a = ship4.GetSegments() -1;    
                  }
                  if (numShip == 1){
        System.out.println ("The ship will build downwards so understand that");
        System.out.println ("You are placing head of BlocadeRunner, what Row, : \n");
        Rowp = place.nextInt (); 
        System.out.println ("You are placing head of BlockadeRunner, what Column: \n");
        Column = place.nextInt ();
        health = ship5.GetHealth();
        segm = ship5.GetSegments();
        miniHealth = health/ segm;
        a = ship5.GetSegments() -1;    
                  }
                  placeShip (PlayerGrid, Rowp, Column, segm, miniHealth);
                  numShip --;
                }
                
    String output = "0 1 2 3 4 5 6 7 8 9 \n";
    Column = 0;
    Rowp = 0;
   for (Column =0; Column < 10; Column++){
       if ((Column >= 0) && (Column <= 10)){
           Rowp = 0;
           output += Column + " ";
       }
       for (Rowp = 0; Rowp < 10; Rowp++){
           output += PlayerGrid[Rowp][Column] + " ";
       }
       output += "\n";
   } 
           System.out.println("hi");
           System.out.println(output);
           JOptionPane.showMessageDialog(null, "User Grid \n" + output);  
                
System.out.println ("AHHHHHHHHHHHHHHHAAAAAAAAAAAAAAAAHHHHHHHHHHHHHH");
       row = 0;
       col = 0;
       Rowp = 0;
       Column = 0;
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
                    System.out.println ("Good work, you mader it to where you are supposed to ");
                }
             turn =2;
             System.out.println (use1);
             System.out.println (use2);
             System.out.println (use3);
             System.out.println (use4);
             System.out.println (use5);
            }
            else if (turn == 2 && i != 0){
                Rowp = (int) (Math.random() * 9);
                Column = (int) (Math.random() * 9);;
      System.out.println (i);
          System.out.println ("Go");
          if (PlayerGrid[Rowp][Column] != 0){
              System.out.println ("Found One");
              int damage = ship6.getDamage();
             PlayerGrid[Rowp][Column] = (PlayerGrid[Rowp][Column] - damage);
             i = i-1;
          }
          else if (PlayerGrid[Rowp][Column] == 0){
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
        output += row + " ";
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
  public static void placeShip (int PlayerGrid[][], int Rowp, int Column, int segm, int miniHealth){
      //Boolean noError = true;
         if (PlayerGrid[Rowp][Column] != 0){
                 System.out.print ("there is a ship there, *facepalm*");
                 segm = -1;
             } 
         try {
          if (PlayerGrid[Rowp][Column - 1] != 0){
                 System.out.println ("there is a ship there, *facepalm*");
                 segm = -1;
             }    
         }catch (ArrayIndexOutOfBoundsException x){
             System.out.println ("It is out of bounds above so there can be no ship there");
         }
         try{
         if (PlayerGrid[Rowp][Column + 1] != 0){
                 System.out.println ("there is a ship there, *facepalm*");
                 segm = -1;
             }     
         }catch (ArrayIndexOutOfBoundsException x){
             System.out.println ("It is out of bounds below so there can be no ship there");
         }
             while (segm > 0){
                                   try {
                      PlayerGrid [Rowp][Column + segm] = miniHealth;
                      System.out.println (Rowp + " " + (Column + segm));
                       System.out.println(PlayerGrid [Rowp][Column+ segm]);
                       System.out.println(segm);
                       segm--;   
                       }
                       catch (ArrayIndexOutOfBoundsException x){
                               System.out.println("a dog");
                               }
             }
  }

 
   
        
  
  
  
  
  
 
  
  
}