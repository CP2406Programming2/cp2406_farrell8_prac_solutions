import javax.swing.*;
public class CreatePurchase
{
   public static void main(String[] args)
   {
      Purchase purch = new Purchase();
      int num;
      double amount;
      String entry;
      final int LOW = 1000, HIGH = 8000;
      entry = JOptionPane.showInputDialog(null, "Enter invoice number");
      num = Integer.parseInt(entry);
      while(num <= LOW || num >= HIGH)
      {
         entry = JOptionPane.showInputDialog(null, "Invoice number must be between " +
            LOW + " and " + HIGH + "\nEnter invoice number");
         num = Integer.parseInt(entry);
      }
   
      entry = JOptionPane.showInputDialog(null, "Enter sale amount");
      amount = Double.parseDouble(entry);
      while(amount < 0)
      {
         entry = JOptionPane.showInputDialog(null, "Enter sale amount");
         amount = Double.parseDouble(entry);
      }
      purch.setInvoiceNumber(num);
      purch.setSaleAmount(amount);
      purch.display();
   }
}