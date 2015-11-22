import javax.swing.*;
class PhoneNumbers
{
   public static void main(String[] args)
   {
       String[] names = new String[30];
       names[0] = "Gina";    names[1] = "Marcia";
       names[2] = "Rita";    names[3] = "Jennifer";
       names[4] = "Fred";    names[5] = "Neil";
       names[6] = "Judy";    names[7] = "Arlene";
       names[8] = "LaWanda"; names[9] = "Deepak";
       String numbers[] = new String[30];
       numbers[0] = "(847) 341-0912";
       numbers[1] = "(847) 341-2392";
       numbers[2] = "(847) 354-0654";
       numbers[3] = "(414) 234-0912";
       numbers[4] = "(414) 435-6567";
       numbers[5] = "(608) 123-0904";
       numbers[6] = "(608) 435-0434";
       numbers[7] = "(608) 123-0312";
       numbers[8] = "(920) 787-9813";
       numbers[9] = "(930) 412-0991";

       String entryName, entryPhone;
       int x;
       boolean isFound = false;
       int highest = 10;
       entryName = JOptionPane.showInputDialog(null,
           "Enter name to look up. Type 'quit' to quit.");
       while (highest < 30 && !entryName.equals("quit"))
       { 
          for(x = 0; x < highest; ++ x)
             if(entryName.equals(names[x]))
             {
                isFound = true;
                JOptionPane.showMessageDialog(null,
                   names[x] + "'s phone number is " + numbers[x]);
                x = highest;
             }
          if(!isFound)
          {
             entryPhone= JOptionPane.showInputDialog(null,
               "Enter phone number for " + entryName);
             names[highest] = entryName;
             numbers[highest] = entryPhone;
             ++highest;
          }
          entryName = JOptionPane.showInputDialog(null,
            "Enter name to look up. Type 'quit' to quit.");
          isFound = false;
      }
   }
}
   