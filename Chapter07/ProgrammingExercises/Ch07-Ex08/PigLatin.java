import javax.swing.*;
public class PigLatin
{
   public static void main(String[] args)
   {
      StringBuffer str = new StringBuffer("");
      String userEntry;
      String suffix = "";
      char letter;
      int firstVowel = -1;
      int x;
      userEntry = JOptionPane.showInputDialog(null, "Enter a word\n" +
        "to be converted to Pig Latin");    
      str.insert(0, userEntry);
      for(x = 0; x < userEntry.length(); ++x)
      {
         letter = userEntry.charAt(x);
         if(isVowel(letter))
         {
             firstVowel = x;
             x = userEntry.length();
         }
         else
            if(x != 0 && letter == 'y')
            {
               firstVowel = x;
               x = userEntry.length();
            }
      }
      for(x = 0; x < firstVowel; ++x)
          suffix = suffix + userEntry.charAt(x);
      suffix = suffix + "ay";
      for(x = firstVowel - 1; x >= 0; --x)
         str.deleteCharAt(x);
      str.append(suffix);
      JOptionPane.showMessageDialog(null,"Pig Latin version:\n" + str);
   }
   public static boolean isVowel(char c)
   {
      boolean isVowel = false;
      if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
         isVowel = true;
      return isVowel;
   }
}