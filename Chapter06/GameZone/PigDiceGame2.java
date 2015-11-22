import javax.swing.*;
public class PigDiceGame2
{
  public static void main(String[] args)
  {
     final int WINNING_SCORE = 100;
     int computerTotal = 0;
     int playerTotal = 0;
     int selection = JOptionPane.YES_OPTION;;
     boolean isDone = false;
     boolean computerChoosesToGoOn = true;
     String msg;
     String msg2 = "\nDo you want to roll the dice?";
     int pointsThisRoundPlayer = 0, pointsThisRoundComputer = 0;
     
     while(!isDone)
     {
       while(selection == JOptionPane.YES_OPTION)
       {
         Die firstDie = new Die();
         Die secondDie = new Die();
         int value1 = firstDie.getValue();
         int value2 = secondDie.getValue();
         if(value1 == 1 && value2 == 1)
         {
            playerTotal = 0;
            pointsThisRoundPlayer = 0;
            selection = JOptionPane.NO_OPTION;
            msg2 = "\nYou rolled two 1s and cannot go on";
         }
         else
           if(value1 != 1 && value2 !=1)
           {
              playerTotal = playerTotal + value1 + value2;
              pointsThisRoundPlayer = pointsThisRoundPlayer + value1 + value2;
              msg2 = "\nYou can go on";
           }
           else
           {
              selection = JOptionPane.NO_OPTION;
              msg2 = "\nYou rolled a 1 and cannot go on\nSubtracting this round's " +
                  pointsThisRoundPlayer + " points";
              playerTotal = playerTotal - pointsThisRoundPlayer;
              pointsThisRoundPlayer = 0;
           }
         if(playerTotal >= WINNING_SCORE)
         {
             msg2 = "\nYou win!";
             isDone = true;
             computerChoosesToGoOn = false;
             selection = JOptionPane.NO_OPTION;
             
         }
         else
         {
             computerChoosesToGoOn = true;
         }
         JOptionPane.showMessageDialog(null,
               "Your dice are " + value1 + " and " + value2 +
                "\nYour total is " + playerTotal +
                 msg2);
         if(selection == JOptionPane.YES_OPTION)
             selection = JOptionPane.showConfirmDialog(null,
                 "\n(Your total is " + playerTotal + ")" +
                 "\nDo you want to roll the dice?");
        }
        pointsThisRoundPlayer = 0;
        selection = JOptionPane.YES_OPTION;
        
        while(computerChoosesToGoOn)
        {
           msg = "\nThe computer chooses to roll";
           Die firstDie = new Die();
           Die secondDie = new Die();
           int value1 = firstDie.getValue();
           int value2 = secondDie.getValue();
           if(value1 == 1 && value2 == 1)
           {
              computerTotal = 0;
              computerChoosesToGoOn = false;
              msg = "\nComputer rolled two 1's and cannot go on";
           }
           else
           if(value1 != 1 && value2 !=1)
           {
              computerTotal = computerTotal + value1 + value2;
              pointsThisRoundComputer = pointsThisRoundComputer + value1 + value2;
           }
           else
           {
              computerChoosesToGoOn = false;
              computerTotal = computerTotal - pointsThisRoundComputer;
              msg = "\nComputer rolled a 1 and cannot go on" + "\nSubtracting " +
                 pointsThisRoundComputer + " points earned this round";
              pointsThisRoundComputer = 0;
           }
           if(computerTotal >= WINNING_SCORE)
           {
              msg = "\nComputer wins!";
              computerChoosesToGoOn = false;
              isDone = true; 
           }
           else
           {
             if(computerChoosesToGoOn)
             {
               double compChoice = Math.random();
               computerChoosesToGoOn = (compChoice >= 0.50);
               if(!computerChoosesToGoOn)
               {
                   msg = "\nThe computer chooses to not roll again";
                   pointsThisRoundComputer = 0;
               }
             }
           }
           
           JOptionPane.showMessageDialog(null,
             "The computer's dice are " + value1 + " and " + value2 +
             "\nThe computer total is " + computerTotal + msg);
        }
        pointsThisRoundComputer = 0; 
     }   
  }
}