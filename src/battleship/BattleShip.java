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
//                    System.out.println("col " + col);
//                    System.out.println("row " + row);
                }
                else {
                    Grid[col][row] = 0;
                }
//                System.out.print (col + ": col " + row + ": row " );
//                System.out.println ("1 equals thing there: " + Grid[col][row]);
            }
        }
        
        
        // place the player ship
        
        
                   // Creates the ships from the classes
        Dreadnaught ship1 = new Dreadnaught ();
        Transporteur ship2 = new Transporteur ();
        Cirkalo ship3 = new Cirkalo ();
        StarDestroyer ship4 = new StarDestroyer ();
        BlockadeRunner ship5 = new BlockadeRunner();
        Ship ship6 = new Ship ();
       int PlayerGrid[][] = new int[10][10];
       for (row =0; row < PlayerGrid.length; row++){
            for (col = 0; col<PlayerGrid[row].length; col++){
                    PlayerGrid[col][row] = 0;
                }
       }
        System.out.println("Welcome to: Ultimate Battleship Simulator Extreme Warmachine 9001 XXX!!!\n"
                + "Please enter any number to continue.");
        Scanner place = new Scanner(System.in);
        // Getting position of column and row 

        // getting health per segment
        int column = 1;
        int health = 1;
        int segm = 1;
        int miniHealth = 1;
        int a;
        int rowp = place.nextInt ();
 
        // places ship in specified spot
         displayGrid(column , row);
                for (int numShip = 5; numShip > 0;){
                  if (numShip == 5){
                      
                  }
                  if (numShip == 5){
        System.out.println ("IMPORTANT: THE SHIP WILL BUILD DOWNWARDS, SO IT PLACES HEAD-TO-TAIL");
        System.out.println ("You are placing head of Dreadnaught, what Row, : \n");
        rowp = place.nextInt (); 
        System.out.println ("You are placing head of Dreadnaught, what Column: \n");
        column = place.nextInt ();
        health = ship1.getHealth();
        segm = ship1.getSegments();
        miniHealth = health/ segm;
        a = ship1.getSegments() -1;
                  }
        if(numShip == 4){
       System.out.println ("The ship will build downwards so understand that");
        System.out.println ("You are placing head of Transporteur, what Row, : \n");
        rowp = place.nextInt (); 
        System.out.println ("You are placing head of Transporteur, what Column: \n");
       column = place.nextInt ();
        health = ship2.getHealth();
        segm = ship2.getSegments();
       miniHealth = health/ segm;
        a = ship2.getSegments() -1;    
                  }
        if (numShip == 3){
        System.out.println ("The ship will build downwards so understand that");
        System.out.println ("You are placing head of Cirkalo, what Row, : \n");
        rowp = place.nextInt (); 
        System.out.println ("You are placing head of Cirkalo, what Column: \n");
        column = place.nextInt ();
        health = ship3.getHealth();
        segm = ship3.getSegments();
       miniHealth = health/ segm;
        a = ship3.getSegments() -1;  
                  }   
                  if (numShip == 2){
        System.out.println ("The ship will build downwards so understand that");
        System.out.println ("You are placing head of StarDestroyer, what Row, : \n");
        rowp = place.nextInt (); 
        System.out.println ("You are placing head of StarDestroyer, what Column: \n");
        column = place.nextInt ();
        health = ship4.getHealth();
        segm = ship4.getSegments();
        miniHealth = health/ segm;
        a = ship4.getSegments() -1;    
                  }
                  if (numShip == 1){
        System.out.println ("The ship will build downwards so understand that");
        System.out.println ("You are placing head of BlocadeRunner, what Row, : \n");
        rowp = place.nextInt (); 
        System.out.println ("You are placing head of BlockadeRunner, what Column: \n");
        column = place.nextInt ();
        health = ship5.getHealth();
        segm = ship5.getSegments();
        miniHealth = health/ segm;
        a = ship5.getSegments() -1;    
                  }
                  placeShip (PlayerGrid, rowp, column, segm, miniHealth);
                  numShip --;
                }
                
                //put the ships on the grid panel
    String output = "PLAYER GRID:\n"
            + "0 1 2 3 4 5 6 7 8 9 \n";
    column = 0;
    rowp = 0;
   for (column =0; column < 10; column++){
       if ((column >= 0) && (column <= 10)){
           rowp = 0;
           output += column + " ";
       }
       for (rowp = 0; rowp < 10; rowp++){
           output += PlayerGrid[rowp][column] + " ";
       }
       output += "\n";
   } 
           System.out.println(output);
           JOptionPane.showMessageDialog(null,output);  
                

       row = 0;
       col = 0;
       rowp = 0;
       column = 0;
    displayGrid(row, col);
        int game = 1;
        boolean turn = true;
        //get varibles to check which ship has been used
       
        String ship;
                //print out which ships can be fired
               System.out.println("TIME TO KILL THE ALIENS!\n"
                        + "Pick a number to fire the corrisponding ship!" +"\n"
                        + "1.Dreadnaught --- can fire? --- Yes! Fire Away!" +"\n"
                        + "2.Transporteur --- can fire? --- Yes! Fire Away!" + "\n"
                        + "3.Cirkalo --- can fire? --- Yes! Fire Away!" + "\n"
                        + "4.Star Destroyer --- can fire? --- Yes! Fire Away!" + "\n"
                        + "5.Blockade Runner --- can fire? --- Yes! Fire Away!" + "\n");

        while (game == 1){
             int use1, use2, use3, use4, use5 ;
        String check1 = "Yes! Fire Away!";
        String check2 = "Yes! Fire Away!";
        String check3 = "Yes! Fire Away!";
        String check4 = "Yes! Fire Away!";
        String check5 = "Yes! Fire Away!";
        use1 = 0;
        use2 = 0;
        use3 = 0;
        use4 = 0;
        use5 = 0;

            if (turn = true){
            Scanner input = new Scanner(System.in);
            ship = input.nextLine();
                // Gets the ship that will fire
               if (ship.equals("1") && use1 == 0){
                // How many times the ship can fire
                for (int x = 0; x < ship1.getFire();){
//                String fire;
//                fire = input.nextLine();
                    System.out.println("Where do you want to fire, Column:");
                    int fireCol = input.nextInt();
                    System.out.println ("Where do you want to fire, Row:");
                    int fireRow = input.nextInt();
                    
                // checks if the user fires
                if (Grid[fireRow][fireCol] == 0){
                   System.out.println("~~~~~~~~~~");
                    System.out.println("YOU MISSED!");  
                   System.out.println("~~~~~~~~~~");
                }
                else {
//                  if ("fire".equals(fire)){
                        // Checks if the ship crits or not
                  if (ship1.getCrit() == 3){
                        System.out.println ("Super Boom");
                       int damage =  ship1.getDamage() * 2;
                       Grid[fireRow][fireCol] = (Grid[fireRow][fireCol] - damage);
                    }  
                  else {
                      System.out.println("normal Boom");
                      Grid[fireRow][fireCol] = (Grid[fireRow][fireCol] - ship1.getDamage());
                }   
//             }
              
            }
                
                    // makes it fire once
                   //1
                   x++;
                    //record if it was fired
                      use1 = 1; 
                       check1 = "NO! Please don't try!";
                } 
            }
               
               if (ship.equals("2") && use2 == 0){
                for (int x = 0; x < ship2.getFire();){
//                String fire = "";
//                fire = input.nextLine();
                System.out.println("Where do you want to fire, Column:");
                    int fireCol = input.nextInt();
                    System.out.println ("Where do you want to fire, Row:");
                    int fireRow = input.nextInt();
                     if (Grid[fireRow][fireCol] == 0){
                         System.out.println("~~~~~~~~~~");
                    System.out.println("YOU MISSED!");  
                        System.out.println("~~~~~~~~~~");
                }
                     else{
//                     if ("fire".equals(fire)){
                  if (ship2.getCrit() == 3){
                        System.out.println ("Super Boom");
                        Grid[fireRow][fireCol] = (Grid[fireRow][fireCol] - (ship2.getDamage()*2));
                    }  
                  else {
                      System.out.println("normal Boom");
                      Grid[fireRow][fireCol] = (Grid[fireRow][fireCol] - ship2.getDamage());
                  }    
//                     }

                }
                    x++;
                  use2 = 1;
                 check2 = "NO! Please don't try!";
                }
        }   
                 if (ship.equals("3") && use3 == 0){
                for (int x = 0; x < ship3.getFire();){
//                String fire;
//                fire = input.nextLine();
                System.out.println("Where do you want to fire, Column:");
                    int fireCol = input.nextInt();
                    System.out.println ("Where do you want to fire, Row:");
                    int fireRow = input.nextInt();
                    if (Grid[fireRow][fireCol] == 0){
                        System.out.println("~~~~~~~~~~");
                    System.out.println("YOU MISSED!");  
                        System.out.println("~~~~~~~~~~");
                }
                    else {
                  if (ship3.getCrit() == 3){
                        System.out.println ("Super Boom");
                        Grid[fireRow][fireCol] = (Grid[fireRow][fireCol] - (ship3.getDamage()*2));
                    }  
                  else {
                      System.out.println("normal Boom");
                      Grid[fireRow][fireCol] = (Grid[fireRow][fireCol] - ship3.getDamage());
                  }   
//                    }
         
                }
                    x++;
                  use3 = 1;
                  check3 = "NO! Please don't try!";
                }
        } 
              if (ship.equals("4") && use4 == 0){
                for (int x = 0; x < ship4.getFire();){
//                String fire;
//                fire = input.nextLine();
                System.out.println("Where do you want to fire, Column:");
                    int fireCol = input.nextInt();
                    System.out.println ("Where do you want to fire, Row:");
                    int fireRow = input.nextInt();
                    if (Grid[fireRow][fireCol] == 0){
                         System.out.println("~~~~~~~~~~");
                    System.out.println("YOU MISSED!");  
                        System.out.println("~~~~~~~~~~");
                }
                    else {
//                       if ("fire".equals(fire)){
                  if (ship4.getCrit() == 3){
                        System.out.println ("Super Boom");
                        Grid[fireRow][fireCol] = (Grid[fireRow][fireCol] - (ship4.getDamage()*2));
                    }  
                  else {
                      System.out.println("normal Boom");
                      Grid[fireRow][fireCol] = (Grid[fireRow][fireCol] - ship4.getDamage());
                  } 
//                    }

                }
                    x++;
                 use4 = 1;
                 check4 = "NO! Please don't try!";
                }
        } 
            if (ship.equals("5") && use5 == 0){
                for (int x = 0; x < ship5.getFire();){
//                String fire;
//                fire = input.nextLine();
                System.out.println("Where do you want to fire, Column:");
                    int fireCol = input.nextInt();
                    System.out.println ("Where do you want to fire, Row:");
                    int fireRow = input.nextInt();
                    if (Grid[fireRow][fireCol] == 0){
                        System.out.println("~~~~~~~~~~");
                    System.out.println("YOU MISSED!");  
                        System.out.println("~~~~~~~~~~");
                }
                    else {
//                     if ("fire".equals(fire)){
                  if (ship5.getCrit() == 3){
                        System.out.println ("Super Boom");
                        Grid[fireRow][fireCol] = (Grid[fireRow][fireCol] - (ship5.getDamage()*2));
                    }  
                  else {
                      System.out.println("normal Boom");
                      Grid[fireRow][fireCol] = (Grid[fireRow][fireCol] - ship5.getDamage());
                  }   
//                    }
                    
                    

                }
                    x++;
                 use5 = 1;
                 check5 = "NO! Please don't try!";
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
             turn = false;   
//            System.out.println("Fired = 1 || Can Fire = 0");
//             System.out.println (use1 + " - Dreadnaught");
//             System.out.println (use2 + " - Transporteur");
//             System.out.println (use3 + " - Cirkalo");
//             System.out.println (use4 + " - Star Destroyer");
//             System.out.println (use5 + " - Blockade Runner");
//        
                   System.out.println("TIME TO KILL THE ALIENS!\n"
                        + "Pick a number to fire the corrisponding ship!:\n"
                        + "1.Dreadnaught --- can fire? --- " + check1 + "\n"
                        + "2.Transporteur --- can fire? --- " + check2 + "\n"
                        + "3.Cirkalo --- can fire? --- " + check3 + "\n"
                        + "4.Star Destroyer --- can fire? --- " + check4 + "\n"
                        + "5.Blockade Runner --- can fire? --- " + check5);
                System.out.println("");
                System.out.println("---------------------------------------------");
                System.out.println("");
                
            }
            else if (turn = true && i != 0){
                rowp = (int) (Math.random() * 9);
                column = (int) (Math.random() * 9);;
      System.out.println (i);
          System.out.println ("Go");
          if (PlayerGrid[rowp][column] != 0){
              System.out.println ("Found One");
              int damage = ship6.getDamage();
             PlayerGrid[rowp][column] = (PlayerGrid[rowp][column] - damage);
             i = i-1;
          }
          else if (PlayerGrid[rowp][column] == 0){
        System.out.println ("Miss");
    } 
                System.out.println (i);
                turn = true;
            } 
        }
        System.out.println ("We are done all of the test");
       }
    
  public static void displayGrid(int col,int row) {
String output = "  ENEMY ALIENS GRID:\n"
        + "0 1 2 3 4 5 6 7 8 9 10 \n";
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
    System.out.println(output);
    
  }
  public int Fire(int row){
return 1;
}
  public static void placeShip (int PlayerGrid[][], int rowp, int column, int segm, int miniHealth){
      //Boolean noError = true;
         if (PlayerGrid[rowp][column] != 0){
                 System.out.print ("there is a ship there, *facepalm*");
                 segm = -1;
             } 
         try {
          if (PlayerGrid[rowp][column - 1] != 0){
                 System.out.println ("there is a ship there, *facepalm*");
                 segm = -1;
             }    
         }catch (ArrayIndexOutOfBoundsException x){
             System.out.println ("It is out of bounds above so there can be no ship there");
         }
         try{
         if (PlayerGrid[rowp][column + 1] != 0){
                 System.out.println ("there is a ship there, *facepalm*");
                 segm = -1;
             }     
         }catch (ArrayIndexOutOfBoundsException x){
             System.out.println ("It is out of bounds below so there can be no ship there");
         }
             while (segm > 0){
                                   try {
                      PlayerGrid [rowp][column + segm] = miniHealth;
                      System.out.println (rowp + " " + (column + segm));
                       System.out.println(PlayerGrid [rowp][column+ segm]);
                       System.out.println(segm);
                       segm--;   
                       }
                       catch (ArrayIndexOutOfBoundsException x){
                               System.out.println("a dog");
                               }
             }
  }

 
   
        
  
  
  
  
  

}