// QuizWithExceptionsCaught.java
//Multiple choice quiz
import javax.swing.*;
public class QuizWithExceptionsCaught
{
   public static void main(String[] args)
   {
      String[] questions = 
       {"How   many players on a basketball team?\nA. 5   B.   6    C. 7",
         "How many points for a basket?\nA. 1    B. 2   C. 3",
         "How many points for a free throw?\nA. 1   B. 2   C. 3",
         "You can earn three points when you\nA. Make any basket\n" +
                "B. Throw from inside the three-point line\n" +
                "C. Throw from outside the three-point line",
         "What is the name of Chicago's NBA team?\n" +
               "A. Bulls   B. Bears   C. Cubs",
         "Who may ask a referee about a rule interpretation?\n" +
               "A. Team captain\n" +
               "B. A player who receives a foul\n" +
               "C. Any player on the floor",
         "Suppose a shooter from team A makes a basket\n" +
             "in team B's basket. Who gets credit for the basket?\n" +
             "A. The player who made the basket\n" +
             "B. The last player from team B who made a basket\n" +
             "C. The player from team B nearest the shooter",
         "A basketball game starts with a\n" +
             "A. Jump ball\nB. Throw in from the side\n" +
             "C. Throw in from the end",
         "Bouncing a ball while walking is\n" +
             "A. Slobbering   B. Dribbling   C. Dabbling",
         "Taking steps with the ball without dribbling is called\n" +
               "\nA. Stepping   B. Dunking    C. Travelling"};

      char[] answers = {'A', 'B', 'A', 'C', 'A', 'A', 'C', 'A', 'B', 'C' };
      char ans = ' ';
      int x, correct = 0;
      String entry = "";
      boolean isGood;
      boolean entryIsValid;
      for(x = 0; x < questions.length; ++x)
      {
          isGood = false;
          int firstError = 0;
          while(!isGood)
          {
             isGood = true;
             entryIsValid = false;
             while(!entryIsValid)
             {
                  try
                  {
                     entry = JOptionPane.showInputDialog
                        (null,questions[x]);
                     ans = entry.charAt(0);
                     entryIsValid = true;
                  }
                  catch(StringIndexOutOfBoundsException e)
                  {
                     JOptionPane.showMessageDialog(null,
                         "No answer given. Please try again");
                  }
             }

             if(ans != 'A' && ans != 'B' && ans != 'C')
             {
                   isGood = false;
                   if(firstError == 0)
                   {
                        questions[x] = questions[x] +
                           "\nYour answer must be A, B or C.";
                        firstError = 1;
                   }
             }
          }
            if(ans == answers[x])
            {
               ++correct;
               JOptionPane.showMessageDialog(null, "Correct!");
            }
            else
               JOptionPane.showMessageDialog(null, "The correct answer is " +
                     answers[x]);      
      }
      JOptionPane.showMessageDialog(null, "You got " +
               correct + " right and\n" +(questions.length -correct) +
               " wrong");
   }

}