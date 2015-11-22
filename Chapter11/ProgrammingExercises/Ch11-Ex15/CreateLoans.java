import javax.swing.*;
public class CreateLoans implements LoanConstants
{
  public static void main(String[] args)
  {
     final int MAX = 5;
     Loan[] loan = new Loan[MAX];
     int x;
     int num;
     String name;
     double amt, rate;
     int loanType;
     int term;
     String inStr,  outString = COMPANY + "\n";
     inStr = JOptionPane.showInputDialog(null,
       "Welcome to " + COMPANY +
       "\nEnter the current prime interest rate" +
       "\nas a decimal number, for example, .05");
     rate = Double.parseDouble(inStr);
     for(x = 0; x < MAX; ++x)
     {
       inStr = JOptionPane.showInputDialog(null,
        "Is this a (1) Business loan" +
        "\nor (2) Personal loan");
       loanType = Integer.parseInt(inStr);
       inStr = JOptionPane.showInputDialog(null,
           "Enter account number");
       num = Integer.parseInt(inStr);
       name = JOptionPane.showInputDialog(null,
           "Enter name");
       inStr = JOptionPane.showInputDialog(null,
           "Enter loan amount");
       amt = Double.parseDouble(inStr);
       inStr = JOptionPane.showInputDialog(null,
           "Enter term");
       term = Integer.parseInt(inStr);
       if(loanType == 1)
       {
         BusinessLoan temp = new 
           BusinessLoan(num, name, amt, term, rate);
         loan[x] = temp;
       }
       else
       {
          PersonalLoan temp = new PersonalLoan(num, name, amt, term, rate);
          loan[x] = temp;
        }
       }
       for(x = 0; x < MAX; ++x)
         outString += loan[x].toString() + "\n";  
       JOptionPane.showMessageDialog(null, outString);
  }
}
