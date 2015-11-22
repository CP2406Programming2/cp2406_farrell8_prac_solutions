import javax.swing.*;
public class PrepareTax
{
  public static void main(String[] args)
  {
    String entry = "", ssn, last, first, address, city, state, zip;
    char status;
    int x;
    double income = 0;
    boolean isGood = false;
    while(!isGood)
    {
       isGood = true;
       entry = JOptionPane.showInputDialog(null,
        "Enter your Social Security number");
       if(entry.length() != 11)
         isGood = false;
       else
       {
           for(x = 0; x < 3; ++x)
              if(!Character.isDigit(entry.charAt(x)))
                 isGood = false;
           for(x = 4; x < 6; ++x)
              if(!Character.isDigit(entry.charAt(x)))
                 isGood = false;
           for(x = 8; x < entry.length(); ++x)
              if(!Character.isDigit(entry.charAt(x)))
                 isGood = false;
           if(!(entry.charAt(3) == '-') || !(entry.charAt(6) == '-'))
              isGood = false;
        }
     }
     ssn = entry;
     first = JOptionPane.showInputDialog(null,
        "Enter your first name");
     
     last = JOptionPane.showInputDialog(null,
        "Enter your last name");
     address = JOptionPane.showInputDialog(null,
         "Enter your address");
     city = JOptionPane.showInputDialog(null,
        "Enter your city");
     state = JOptionPane.showInputDialog(null,
        "Enter your state");

     isGood = false;
     while(!isGood)
     {
        isGood = true;
        entry = JOptionPane.showInputDialog(null,
           "Enter your Zip code");
        if(entry.length() != 5)
           isGood = false;
        else
          for(x = 0; x < 5; ++x)
            if(!Character.isDigit(entry.charAt(x)))
               isGood = false;
     }
     zip = entry;
     isGood = false;
     while(!isGood)
     {
        isGood = true;
        entry = JOptionPane.showInputDialog(null,
           "Enter marital status");
        if(!(entry.charAt(0) == 's' || entry.charAt(0) == 'S' ||
           entry.charAt(0) == 'm' || entry.charAt(0) == 'M'))
              isGood = false;
     }
     status = entry.charAt(0);
     isGood = false;
     while(!isGood)
     {
        isGood = true;
        entry = JOptionPane.showInputDialog(null,
           "Enter your annnual income");
        income = Double.parseDouble(entry);
        if(income < 0)
           isGood = false;
     }
     TaxReturn taxRet = new TaxReturn(ssn, last, first,
            address, city, state, zip, income, status);
     taxRet.display();
  }
}