import javax.swing.*;
public class Quiz2
{
   public static void main (String args[])
   {
      int answer;
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
      while(answer != 1)
      {
            entry = JOptionPane.showInputDialog(null,
                   "Try again\n" +
                    q1 + answerList);
            answer = Integer.parseInt(entry);
      }
      JOptionPane.showMessageDialog(null, "Good job!");
      
//--------------------------

      entry = JOptionPane.showInputDialog(null, q2 + answerList);
      answer = Integer.parseInt(entry);
      while(answer != 2)
      {
            entry = JOptionPane.showInputDialog(null,
                   "Try again\n" +
                    q2 + answerList);
            answer = Integer.parseInt(entry);
      }
      JOptionPane.showMessageDialog(null, "Good job!");
//--------------------------
     entry = JOptionPane.showInputDialog(null, q3 + answerList);
      answer = Integer.parseInt(entry);
      while(answer != 3)
      {
            entry = JOptionPane.showInputDialog(null,
                   "Try again\n" +
                    q3 + answerList);
            answer = Integer.parseInt(entry);
      }
      JOptionPane.showMessageDialog(null, "Good job!");
//--------------------------
     entry = JOptionPane.showInputDialog(null, q4 + answerList);
      answer = Integer.parseInt(entry);
     while(answer != 4)
      {
            entry = JOptionPane.showInputDialog(null,
                   "Try again\n" +
                    q4 + answerList);
            answer = Integer.parseInt(entry);
      }
      JOptionPane.showMessageDialog(null, "Good job!");
//--------------------------
     entry = JOptionPane.showInputDialog(null, q5 + answerList);
      answer = Integer.parseInt(entry);
     while(answer != 5)
      {
            entry = JOptionPane.showInputDialog(null,
                   "Try again\n" +
                    q5 + answerList);
            answer = Integer.parseInt(entry);
      }
      JOptionPane.showMessageDialog(null, "Good job!");
//--------------------------
   }
}


