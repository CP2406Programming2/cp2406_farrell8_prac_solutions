import javax.swing.*;
public class ConstructID
{
   public static void main(String[] args)
   {
      String name, address;
      int x;
      name = JOptionPane.showInputDialog(null,
        "Enter your full name - first, middle, and last");
      address = JOptionPane.showInputDialog(null,
        "Enter your complete street address");
      int stringLength = name.length();
      StringBuffer id = new StringBuffer();
      id.append(name.charAt(0));
      for(x = 1; x < stringLength - 1; ++x)
         if(name.charAt(x) == ' ')
            id.append(name.charAt(x + 1));
      stringLength = address.length();
      for(x = 0; x < stringLength; ++ x)
         if(address.charAt(x) == ' ')
            x = stringLength;
         else
            if(Character.isDigit(address.charAt(x)))
                id.append(address.charAt(x));
      JOptionPane.showMessageDialog(null, "ID is " + id);
   }
}