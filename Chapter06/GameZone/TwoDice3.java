import javax.swing.*;
public class TwoDice3
{
   public static void main(String[] args)
   {
      final int HIGH = 12;
      final int LOW = 2; 
      int guess = 0; 
      int total = 0;
      int attempts = 0;
      boolean isDone = false;
      final int MOST_ATTEMPTS = 3;
      String msg;
      while(guess < LOW || guess > HIGH)
      {
         guess = Integer.parseInt(JOptionPane.showInputDialog(null,
            "Choose a number between " + LOW + " and " + HIGH));
      }
      while(!isDone)
      {
         Die firstDie = new Die();
         Die secondDie = new Die();
         int value1 = firstDie.getValue();
         int value2 = secondDie.getValue();
         total = value1 + value2;
         attempts =  attempts + 1;
         msg = "Roll " + attempts + ": " + value1 + " and " + value2
           + "\nTotal: " + total;
         if(guess == total)
         {
            JOptionPane.showMessageDialog(null, msg + "\nYou win!");
            isDone = true;
         }
         else
         {
            if(attempts == MOST_ATTEMPTS)
            {
               JOptionPane.showMessageDialog(null,
                    msg + "\nLast try - you lose");
               isDone = true;
            }
            else
                JOptionPane.showMessageDialog(null,
                    msg + "\nClick OK to roll again");          
         }
      }     
   }
}