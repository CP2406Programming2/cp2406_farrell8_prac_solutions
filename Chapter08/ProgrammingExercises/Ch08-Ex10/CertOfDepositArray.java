import javax.swing.*;
import  java.time.*;
public class CertOfDepositArray
{
   public static void main(String[] args)
   {
      final int MAX = 5;
      CertOfDeposit[] certs = new CertOfDeposit[MAX];
      int x;
      String certNum;
      String name;
      double balance;
      String entryString;
      int mo, da, yr;
      LocalDate issueDate;

      for(x = 0; x < MAX; ++x)
      {
         certNum = JOptionPane.showInputDialog(null,
            "Enter certificate number");
         name = JOptionPane.showInputDialog(null,
           "Enter last name of owner");
         entryString = JOptionPane.showInputDialog(null,
           "Enter balance");
         balance = Double.parseDouble(entryString);
         entryString = JOptionPane.showInputDialog(null,
           "Enter month  of issue");
         mo = Integer.parseInt(entryString);
         entryString = JOptionPane.showInputDialog(null,
            "Enter day of issue");
         da = Integer.parseInt(entryString);
         entryString = JOptionPane.showInputDialog(null,
           "Enter year of issue");
         yr = Integer.parseInt(entryString);
         issueDate = LocalDate.of(yr, mo, da);
         certs[x] = new CertOfDeposit(certNum, name, balance, issueDate);
      }
      for(x = 0; x < MAX; ++x)
         display(certs[x], (x + 1));
   }
   public static void display(CertOfDeposit cd, int num)
   {
      JOptionPane.showMessageDialog(null,"Certificate " + num +
         "\nName: " + cd.getCertNum() +  " " +
         cd.getName() + "  Balance: $" + cd.getBalance() +
         "\nIssued: " + cd.getIssueDate() +
         "\nMatures: " + cd.getMaturityDate());
   }
}