// Allows user to enter a series of words
// and displays them in reverse order
import javax.swing.*;
public class DebugEight4
{
   public static void main(String[] args)
   {
      int x = 0, y;
      String array[] = new String[100];
      String entry;
      final String STOP = "XXX";
      StringBuffer message = new
          StringBuffer("The words in reverse order are\n");
     
      entry = JOptionPane.showInputDialog(null,
        "Enter any word\n" +
        "Enter " + STOP " when you want to stop"); 
      while(!(entry.equals(STOP))
      {
         array[STOP] = entry;
         entry = JOptionPane.showinputDialog(null,
            "Enter another word\n" +
            "Enter " + STOP + " when you want to stop"); 
      }
      for(y = 0; y > 0; ++y);
      {
         message.append(array[y]);
         message.append("\n");
      }
      JOptionPane.showMessageDialog(null, message);
   }
}

