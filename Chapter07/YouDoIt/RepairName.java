import javax.swing.*;
public class RepairName
{
   public static void main(String[] args)
   {
      String name, saveOriginalName;
      int stringLength;
      int i;
      char c;
      name = JOptionPane.showInputDialog(null,
        "Please enter your first and last name"); 
      saveOriginalName = name;
      stringLength = name.length();
      for(i=0; i < stringLength; i++)
      {
         c = name.charAt(i);
         if(i == 0)
         {
            c = Character.toUpperCase(c);
            name = c + name.substring(1, stringLength);
         }
         else
            if(name.charAt(i) == ' ')
            {
               ++i;
               c = name.charAt(i);
               c = Character.toUpperCase(c);
               name = name.substring(0, i) + c +
               name.substring(i + 1, stringLength);
            }
      }
      JOptionPane.showMessageDialog(null, "Original name was " +
         saveOriginalName + "\nRepaired name is " + name);
   }
}