import javax.swing.*;
public class FindPrice
{
   public static void main(String[] args)
   {
      final int NUMBER_OF_ITEMS = 10;
      int[] validValues = {101,  108,  201,  213,  266,
         304,  311,  409,  411,  412};
      double[] prices = {0.29,  1.23,  3.50,  0.69,  6.79,
         3.19,  0.99,  0.89,  1.26,  8.00};
      String strItem;
      int itemOrdered;
      double itemPrice = 0.0;
      boolean validItem = false;
      strItem = JOptionPane.showInputDialog(null,
         "Enter the item number you want to order");
      itemOrdered = Integer.parseInt(strItem);
      for(int x = 0; x < NUMBER_OF_ITEMS; ++x)
      {
         if(itemOrdered == validValues[x])
         {
            validItem = true;
            itemPrice = prices[x];
         }
      }
      if(validItem)
         JOptionPane.showMessageDialog(null, "The price for item " +
            itemOrdered + " is $" + itemPrice);
      else
         JOptionPane.showMessageDialog(null,
            "Sorry - invalid item entered");
    }
}
