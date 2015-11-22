import javax.swing.JOptionPane;
public class RockPaperScissors2
{
   public static void main(String[] args)
   {
      String userPick ="";
      int computer;
      String msg = "";
      String instructions = "Type one of the following :\nRock\nPaper\nScissors";
      String computerPick;
      final int LOW = 1;
      final int HIGH = 3;
      final int NUM_GAMES = 10;
      int gameCount = 0;
      int playerWon = 0;
      int tieGames = 0;
      while(gameCount < NUM_GAMES)
      {
         userPick = "";
         msg = "";
         computer = LOW + (int)(Math.random() * HIGH);
         while(!userPick.equals("rock") && !userPick.equals("paper") && !userPick.equals("scissors"))   
         {
            userPick = JOptionPane.showInputDialog(null,
               msg + instructions);
            userPick = userPick.toLowerCase();
            if(userPick.startsWith("ro"))
              userPick = "rock";
            else
              if(userPick.startsWith("pa"))
                 userPick = "paper";
              else
                 if(userPick.startsWith("sc"))
                   userPick = "scissors";
            msg = "You must pick rock, paper or scissors\n";
         }        
         if(computer == 1)
            computerPick = "rock";
         else
            if(computer == 2)
              computerPick = "paper";
            else
              computerPick = "scissors";
         if(userPick.equals(computerPick))
         {
            msg = "tie";
            ++tieGames;
         }
         else
           if(userPick.equals("rock"))
              if(computerPick.equals("paper"))
                 msg = "computer";
              else
              {
                 msg = "you";
                 ++playerWon;
              }
              else
                 if(userPick.equals("paper"))
                   if(computerPick.equals("scissors"))
                     msg = "computer";
                   else
                   {
                      msg = "you";
                      ++playerWon;
                   }
                 else
                   if(computerPick.equals("rock"))
                      msg = "computer";
                   else
                   {
                      msg = "you";
                      ++playerWon;
                   }
         JOptionPane.showMessageDialog(null,"You picked " +
         userPick + "\nComputer picked " + computerPick +
           "\nWinner: " + msg);
         ++gameCount;
      }

      JOptionPane.showMessageDialog(null, "End of " + NUM_GAMES + " games\nYou won " +
          playerWon + " games\nComputer won " + (NUM_GAMES - playerWon - tieGames) +
           " games\nThere were " + tieGames + " tie games");;
   }
}
  
