// Lottery.java
// Allow the user to guess three randomly chosen numbers
// Display a message indicating the amount of
//     money the user has won as follows: 
//  Any one matching                     $10
//  Two matching	                $100
//  Three matching not in order	      $1,000
//  Three matching in exact order $1,000,000
//  No matches	                          $0
import javax.swing.*;
public class Lottery
{
   public static void main (String args[])
   {
      final int HIGHEST_WIN = 1000000;
      final int SECOND_BEST_WIN = 1000;
      final int THIRD_BEST_WIN = 100;
      final int LOW_WIN = 10;
      String entry;
      int number1;
      int number2;
      int number3;
      int userGuess;
      int ran1, ran2, ran3;
      int random;
      int matches = 0;
      int winnings = 0;
      ran1 = (int)Math.floor(Math.random()*10);
      ran2 = (int)Math.floor(Math.random()*10);
      ran3 = (int)Math.floor(Math.random()*10);
      random = ran1 * 100 + ran2 * 10 + ran3;
      entry = JOptionPane.showInputDialog(null,
         "Enter first digit");
      number1 = Integer.parseInt(entry);
      entry = JOptionPane.showInputDialog(null,
         "Enter second digit");
      number2 = Integer.parseInt(entry);  
      entry = JOptionPane.showInputDialog(null,
         "Enter last digit");
      number3 = Integer.parseInt(entry);
      if(number1 == ran1 && number2 == ran2 && number3 == ran3)
      {
         matches = 4;
      }
      else
      {
         if(number1 == ran1)
         {
            ++matches;
            ran1 = 99;
         }
         else
           if(number1 == ran2)
           {
              ++matches;
              ran2 = 99;
           }
           else
              if(number1 == ran3)
              {
                ++matches;
                ran3 = 99;
              }
         if(number2 == ran1)
         {
            ++matches;
            ran1 = 99;
         }
         else
           if(number2 == ran2)
           {
              ++matches;
              ran2 = 99;
           }
           else
              if(number2 == ran3)
              {
                ++matches;
                ran3 = 99;        
              }
        if(number3 == ran1)
        {
           ++matches;
           ran1 = 99;
        }
        else
          if(number3 == ran2)
          {
              ++matches;
              ran2 = 99;
          }
          else
              if(number3 == ran3)
              {
                ++matches;
                ran3 = 99;        
              }
       }
       if(matches == 4)
          winnings = HIGHEST_WIN;
       else
         if(matches == 3)
            winnings = SECOND_BEST_WIN;
         else
            if(matches == 2)
               winnings = THIRD_BEST_WIN;
            else
              if(matches == 1)
                 winnings = LOW_WIN;
              else
                 winnings = 0;
      JOptionPane.showMessageDialog(null, "You guessed " +
          number1 + number2 + number3 +
          "\nWinning number was " + random +
          "\nYou have won $" + winnings + "!");
   }
}


