import javax.swing.*;
public class BirthdayReminder
{
   public static void main(String[] args)
   {
      final int MAX = 10;
      final String QUIT = "ZZZ";
      String[] names = new String[MAX];
      String[] birthdates = new String[MAX];
      String entry;
      String msg;
      String list = "";
      int count = 0, x;
      boolean isFound = false;
      entry = JOptionPane.showInputDialog(null, "Enter a name");
      names[count] = entry;
      while(count < names.length && (!entry.equals(QUIT)) )
      {
         entry = JOptionPane.showInputDialog(null, "Enter birthdate with slashes between the month, day, and year");
         birthdates[count] = entry;
         ++count;
         if(count < names.length)
         {
            entry = JOptionPane.showInputDialog(null,
               "Enter a name or " + QUIT + " to quit");
            names[count] = entry;
         }
      }
      JOptionPane.showMessageDialog(null,
        "Count of names entered: " + count);
      for(x = 0; x < count; ++x)
         list += names[x] + "\n";
      JOptionPane.showMessageDialog(null, list);
      entry = JOptionPane.showInputDialog(null,
          "Enter a name to search for");
      while(!entry.equals(QUIT))
      {
          isFound = false;
          for(x = 0; x < count; ++x)
             if (entry.equals(names[x]))
             {
                isFound = true;
                JOptionPane.showMessageDialog(null, names[x] +
                  "'s birthdate is " + birthdates[x]);
             }
          if(!isFound)
            msg = "Sorry, no entry for " + entry + "\n";
          else
            msg = "";
          entry = JOptionPane.showInputDialog(null,
            msg + "Enter a name to search for or " + QUIT + " to quit");
      }
   }
}