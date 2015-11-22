import javax.swing.*;
public class ThreeLetterAcronym
{
   public static void main(String[] args)
   {
      String tla = "", entry;
      int stringLength;
      int i;
      int count = 0;
      int MAX = 3;
      char c;
      entry = JOptionPane.showInputDialog(null,
        "Please enter three words"); 
      stringLength = entry.length();
      tla += Character.toUpperCase(entry.charAt(0));
      ++count;
      for(i = 1; i < stringLength; i++)
      {
         if(count < MAX)
         {
            if(entry.charAt(i) == ' ')
            {
               ++i;
               c = entry.charAt(i);
               c = Character.toUpperCase(c);
               tla += c;
               ++count;
            }
         }
      }
      JOptionPane.showMessageDialog(null, "Original phrase was " +
         entry + "\nThree letter acronym is " + tla);
   }  
}