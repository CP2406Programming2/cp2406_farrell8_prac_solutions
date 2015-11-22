import javax.swing.*;
public class TestScore
{
   public static void main(String args[]) throws Exception
   {
      int[] id = {1234, 2345, 3456, 4567, 5678};
      int[] score = {0, 0, 0, 0, 0};
      String scoreString = new String();
      final int HIGHLIMIT = 100;
      String inString, outString = "";
      for(int x = 0; x < id.length; ++x)
      {  
          inString = JOptionPane.showInputDialog(null, 
            "Enter score for student id number: " + id[x]);
          score[x] = Integer.parseInt(inString);
          try
          {
             if(score[x] > HIGHLIMIT)
             {
                scoreString = "Score over " + HIGHLIMIT;
                throw (new ScoreException(scoreString));
             }  
          }
          catch(ScoreException e)
          {  
             JOptionPane.showMessageDialog(null, e.getMessage());  
             score[x] = 0;
          }
       }
       for(int x = 0; x < id.length; ++x)
         outString = outString + "ID #" + id[x] + "  Score " +
              score[x] + "\n";
       JOptionPane.showMessageDialog(null, outString); 
   }
}
