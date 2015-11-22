import javax.swing.JOptionPane;
public class RockPaperScissors
{
   public static void main(String[] args)
   {
      int user;
      int computer;
      String msg;
      String userPick;
      String computerPick;
      final int LOW = 1;
      final int HIGH = 3; 
      computer = LOW + (int)(Math.random() * HIGH);
      user = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Type one of the following numbers:\n1 -- Rock" +
         "\n2 - Paper\n3 -- Scissors"));
      if(user == 1)
         userPick = "rock";
      else
         if(user == 2)
           userPick = "paper";
         else
           userPick = "scissors";
      if(computer == 1)
         computerPick = "rock";
      else
         if(computer == 2)
           computerPick = "paper";
         else
           computerPick = "scissors";
      if(user == 1)
        if(computer == 1)
           msg = "tie";
        else
          if(computer == 2)
            msg = "computer";
          else
            msg = "you";
      else
        if(user == 2)
          if(computer == 2)
             msg = "tie";
          else
            if(computer == 3)
              msg = "computer";
            else
              msg = "you";
         else
            if(computer == 3)
               msg = "tie";
            else
              if(computer == 1)
                msg = "computer";
              else
                msg = "you";
      JOptionPane.showMessageDialog(null,"You picked " +
        userPick + "\nComputer picked " + computerPick +
        "\nWinner: " + msg);
   }
}
