import java.util.Scanner;
import java.util.Random;

class RockPaperScissors {
 public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);
     int wins = 0;
     int losses = 0;
     int winMax = 2;
     int lossesMax = 2;
       System.out.println("Welcome to Rock Paper Scissors. Win against the opponent. Best out of 3. Good luck!");
     while((wins < winMax) && (losses < lossesMax)){
        System.out.println("Enter your move. Type rock, paper, or scissors"); 
         String myMove = scanner.nextLine();
              
       // Generates random moves for opponent (0,1,2)//
       Random random= new Random();
       int opponentguess = random.nextInt(3);
       String opponentmove= "";
         if ( opponentguess == 0){
           opponentmove= "rock";
         }
         else if (opponentguess == 1){
           opponentmove="paper";
         }
         else {
           opponentmove="scissors";
         }
         // Verfiy myMove is invaild//
        if (!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissors") && !myMove.equals("gun")){
           System.out.println("Your move is invaild");
       }
       // Codes for when both players are tied//
     if (myMove.equals(opponentmove)){
       System.out.println("Your opponent played: " + opponentmove);
           System.out.println("You have tied");
             System.out.println(wins+"-"+losses);


       }
       // Codes for when you win //
       else if ( (myMove.equals("paper") && opponentmove.equals("rock"))||(myMove.equals("rock")&& opponentmove.equals("scissors")) ||(myMove.equals("scissors")&& opponentmove.equals("paper"))){
         System.out.println("Your opponent played: " + opponentmove);
         System.out.println("You won the round");
          wins++;
              System.out.println(wins+"-"+losses);
         
       }
       // Lose condiation
       else if ((myMove.equals("rock")&& opponentmove.equals("paper"))||(myMove.equals("scissors")&& opponentmove.equals("rock"))||(myMove.equals("paper") && opponentmove.equals("scissors"))){
         System.out.println("Your opponent played: " + opponentmove);
         System.out.println("You lost the round");
         losses++;
           System.out.println(wins+"-"+losses);
          //Gun code allowing atomiacally win
       } 
       else if (myMove.equals("gun")){
         System.out.println("Your opponent played: " + opponentmove);
               wins+=2;
             }


          // Codes for how much wins you get to win the game//     
       if ((wins==winMax) || (wins>=winMax)){
           System.out.println("YOU HAVE WON AGAINST OPPONENT");
          
           // Choice between playing again or quiting//
             int replay=0;
             while (replay<1000){
             System.out.println("Do you want to play again? If so, type play. If not, type quit ");
             Scanner next = new Scanner(System.in);
             String tryAgain = next.nextLine();
            
             if (tryAgain.equals("play")){
                 wins=0;
                 losses=0;
                 break;
             }
             else if (tryAgain.equals("quit")){
                 System.out.println("Thank you for playing");
                 scanner.close();
                 break;
             }
             else if (!tryAgain.equals("play") && !tryAgain.equals("quit")){
                 System.out.println("Invalid response");
                 replay++;
                 if (replay==1000){
                     replay=0;
                 }
             }
           
             }    
            
           }
           // Codes how much losses you get to lose the game//
           else if (losses ==lossesMax){
             System.out.println("Game Over");
                  // Choice between playing again or quiting//
                   int replay=0;
             while (replay<1000){
             System.out.println("Do you want to play again? If so, type play. If not, type quit ");
             Scanner next = new Scanner(System.in);
             String tryAgain = next.nextLine();
             //restarts the variables for "try again"
             if (tryAgain.equals("play")){
                 wins=0;
                 losses=0;
                 break;
             }
             //quit option
             else if (tryAgain.equals("quit")){
                 System.out.println("Thank you for playing!");
                 scanner.close();
                 break;
             }
             else if (!tryAgain.equals("play") && !tryAgain.equals("quit")){
                 System.out.println("Invalid response");
                 replay++;
                 if (replay==1000){
                     replay=0;
                 }
             }
           
             }
            
              
         }  
     }
   }
  
 }
