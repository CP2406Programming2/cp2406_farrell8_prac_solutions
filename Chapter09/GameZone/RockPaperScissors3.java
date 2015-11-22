import javax.swing.JOptionPane;
public class RockPaperScissors3
{
   enum Rps {ROCK, PAPER, SCISSORS}

   public static void main(String[] args)
   {
      String userPick ="";
      Rps pick = Rps.ROCK;
      Rps computerPick;
      int computer;
      String msg = "";
      String instructions = "Type one of the following :\nRock\nPaper\nScissors";
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
              pick = Rps.ROCK;
            else
              if(userPick.startsWith("pa"))
                 pick = Rps.PAPER;
              else
                 if(userPick.startsWith("sc"))
                   pick = Rps.SCISSORS;
            msg = "You must pick rock, paper or scissors\n";
         }        
         if(computer == 1)
            computerPick = Rps.ROCK;
         else
            if(computer == 2)
              computerPick = Rps.PAPER;
            else
              computerPick = Rps.SCISSORS;
         if(pick.equals(computerPick))
         {
            msg = "tie";
            ++tieGames;
         }
         else
           if(pick.equals(Rps.ROCK))
              if(computerPick.equals(Rps.PAPER))
                 msg = "computer";
              else
              {
                 msg = "you";
                 ++playerWon;
              }
              else
                 if(pick.equals(Rps.PAPER))
                   if(computerPick.equals(Rps.SCISSORS))
                     msg = "computer";
                   else
                   {
                      msg = "you";
                      ++playerWon;
                   }
                 else
                   if(computerPick.equals(Rps.ROCK))
                      msg = "computer";
                   else
                   {
                      msg = "you";
                      ++playerWon;
                   }
         JOptionPane.showMessageDialog(null,"You picked " +
         pick + "\nComputer picked " + computerPick +
           "\nWinner: " + msg);
         ++gameCount;
      }

      JOptionPane.showMessageDialog(null, "End of " + NUM_GAMES + " games\nYou won " +
          playerWon + " games\nComputer won " + (NUM_GAMES - playerWon - tieGames) +
           " games\nThere were " + tieGames + " tie games");;
   }
}
  
