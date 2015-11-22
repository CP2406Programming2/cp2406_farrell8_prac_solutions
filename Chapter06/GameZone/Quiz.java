import javax.swing.*;
public class Quiz
{
   public static void main (String args[])
   {
      int answer, totalAsked = 0, correct = 0;
      String entry;
      String q1 = "Who is buried in Grant's Tomb?\n";
      String q2 = "Who wrote Beethoven's 5th Symphony?\n";
      String q3 = "Who is honored by the Lincoln Memorial?\n";
      String q4 = "Who discovered the Fibonacci Sequence?\n";
      String q5 = "Who discovered Haley's Comet?\n";
      String a1 = "Grant", a2 = "Beethoven", a3 = "Lincoln",
              a4 = "Fibonacci", a5 = "Haley";		
      
      String answerList = "(1)  " + a1 + "\n" +
                          "(2)  " + a2 + "\n" +
                          "(3)  " + a3 + "\n" +
                          "(4)  " + a4 + "\n" +
                          "(5)  " + a5 + "\n" +
                          "(6)  " + "All of the above" + "\n";

      entry = JOptionPane.showInputDialog(null, q1 + answerList);
      answer = Integer.parseInt(entry);
      while(answer < 1 || answer > 6)
      {
            entry = JOptionPane.showInputDialog(null,
                   "Sorry - answer must be a number 1 through 6\n" +
                    q1 + answerList);
            answer = Integer.parseInt(entry);
      }
      ++totalAsked;
      if(answer != 1)
      {
           JOptionPane.showMessageDialog(null, "Sorry - answer was " + a1);
      }
      else
      {
           ++ correct;
           JOptionPane.showMessageDialog(null, "Good job!");
      }
//--------------------------

      entry = JOptionPane.showInputDialog(null, q2 + answerList);
      answer = Integer.parseInt(entry);
      while(answer < 1 || answer > 6)
      {
            entry = JOptionPane.showInputDialog(null,
                   "Sorry - answer must be a number 1 through 6\n" +
                    q2 + answerList);
            answer = Integer.parseInt(entry);
      }
      ++totalAsked;
      if(answer != 2)
      {
           JOptionPane.showMessageDialog(null, "Sorry - answer was " + a2);
      }
      else
      {
           ++ correct;
           JOptionPane.showMessageDialog(null, "Good job!");
      }
//--------------------------
     entry = JOptionPane.showInputDialog(null, q3 + answerList);
      answer = Integer.parseInt(entry);
      while(answer < 1 || answer > 6)
      {
            entry = JOptionPane.showInputDialog(null,
                   "Sorry - answer must be a number 1 through 6\n" +
                    q3 + answerList);
            answer = Integer.parseInt(entry);
      }
      ++totalAsked;
      if(answer != 3)
      {
           JOptionPane.showMessageDialog(null, "Sorry - answer was " + a3);
      }
      else
      {
           ++ correct;
           JOptionPane.showMessageDialog(null, "Good job!");
      }
//--------------------------
     entry = JOptionPane.showInputDialog(null, q4 + answerList);
      answer = Integer.parseInt(entry);
      while(answer < 1 || answer > 6)
      {
            entry = JOptionPane.showInputDialog(null,
                   "Sorry - answer must be a number 1 through 6\n" +
                    q4 + answerList);
            answer = Integer.parseInt(entry);
      }
      ++totalAsked;
      if(answer != 4)
      {
           JOptionPane.showMessageDialog(null, "Sorry - answer was " + a4);
      }
      else
      {
           ++ correct;
           JOptionPane.showMessageDialog(null, "Good job!");
      }
//--------------------------
     entry = JOptionPane.showInputDialog(null, q5 + answerList);
      answer = Integer.parseInt(entry);
      while(answer < 1 || answer > 6)
      {
            entry = JOptionPane.showInputDialog(null,
                   "Sorry - answer must be a number 1 through 6\n" +
                    q5 + answerList);
            answer = Integer.parseInt(entry);
      }
      ++totalAsked;
      if(answer != 5)
      {
           JOptionPane.showMessageDialog(null, "Sorry - answer was " + a5);
      }
      else
      {
           ++ correct;
           JOptionPane.showMessageDialog(null, "Good job!");
      }
//--------------------------
      JOptionPane.showMessageDialog(null, "You got " + correct +
           " Right out of " + totalAsked +
           "\nScore = " + (correct * 100 / totalAsked) +"%");
		
   }
}


