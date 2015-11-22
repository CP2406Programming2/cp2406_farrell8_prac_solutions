import javax.swing.*;
public class UseCustomerAccount
{
   public static void main(String[] args)
   {
      int num;
      double balance;
      String input;
      input = JOptionPane.showInputDialog(null,
         "Enter account number");
      num = Integer.parseInt(input);
      input = JOptionPane.showInputDialog(null, "Enter balance due");
      balance = Double.parseDouble(input);
      try
      {
         CustomerAccount ca = new CustomerAccount(num, balance);
         JOptionPane.showMessageDialog(null, "Customer #" +
            num + " has a balance of $" + balance);
      }
      catch( HighBalanceException hbe)
      {
         JOptionPane.showMessageDialog(null, "Customer #" +
            num + " has a balance of $" + balance +
            " which is higher than the credit limit");
      }
   }
}
