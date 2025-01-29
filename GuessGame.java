// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Random;
import java.util.Scanner;


class NumberGuessingGame
{
   public static void main(String[] args)
   {
       Scanner scanner = new Scanner (System.in);
       // This is the ranom number generator
       Random random = new Random();
       // Make a variable that generates a random mumber between 1 and 100
        int number  = random.nextInt(100) + 1;
       // Make a variable tht tracks the number of attempts
       System.out.println("Welcome to the Number Guessing Game. The computer will generate a number between 1 and 100, and you will have to guess it. You have 5 attempts. Type a number to begin");
       int attempts = 0;
      
       int maxattempts = 5;
      
       while (attempts<maxattempts)
       {
           System.out.println(" Enter your guess:");
           int guess = scanner.nextInt();
               if ( guess < number)
               {
                System.out.println("Your guess was low.");
                }
                else if (guess == number)
                {
                System.out.println("YOU GOT IT!!!! :D");
                scanner.close();
                }
                else if (guess == (number-1))
                {
                    System.out.println("You are one off");
                }
                 else if (guess == (number+1))
                {
                    System.out.println("You are one off");
                }
               else
                {
                System.out.println("Your number is high");
                }
           attempts++;


           if (attempts == (maxattempts-1) )
           {
               System.out.println("You have one attempt left!");
           }
           if (attempts== maxattempts && guess != number)
        {
            System.out.println("GAME OVER! The number was " + number);
            scanner.close();
        }
     
  
       }
