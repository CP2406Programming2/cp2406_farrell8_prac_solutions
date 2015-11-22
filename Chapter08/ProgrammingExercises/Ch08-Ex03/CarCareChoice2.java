import javax.swing.*;
public class CarCareChoice2
{
   public static void main (String[] args)
   {
      boolean isMatch = false;
      String[] items =  { "oil change", "tire rotation",
         "battery check", "brake inspection"};
      int[] prices = {25, 22, 15, 5};
      int x;
      int matchIndex = 0;
      String menu = "Enter selection:";
      for(x = 0; x < items.length; ++x)
        menu += "\n   " + items[x];
      String selection = JOptionPane.showInputDialog(null, menu);
      for (x = 0; x < items.length; x++)
      if(selection.substring(0, 3).equals(items[x].substring(0, 3)))
      {
	  isMatch = true;
	  matchIndex = x;
      }
      if(isMatch)
          JOptionPane.showMessageDialog(null,
             items[matchIndex] + " price is $" + prices[matchIndex]);
      else
        JOptionPane.showMessageDialog(null, "Invalid Entry");
  }
}
