import java.util.*;
import javax.swing.*;
public class VerifyCode
{
   public static void main(String[] args)
   {
      char[] codes = {'B', 'E', 'K', 'M', 'P', 'T'};
      String entry;
      char usersCode;
      int position;
      entry = JOptionPane.showInputDialog(null,
         "Enter a product code");        
      usersCode = entry.charAt(0);
      position = Arrays.binarySearch(codes, usersCode);
      if(position >= 0)
         JOptionPane.showMessageDialog(null, "Position of " +
            usersCode + " is " + position);
      else
         JOptionPane.showMessageDialog(null, usersCode +
            " is an invalid code");
   }
}
