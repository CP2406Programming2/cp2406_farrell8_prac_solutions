import javax.swing.*;
public class TaxReturn
{
   private String ssn;
   private String last;
   private String first;
   private String address;
   private String city;
   private String state;
   private String zipCode;
   private double income;
   private char status;
   private double tax;
   private final double LOWINCOME = 20000;
   private final double HIGHINCOME = 50000;
   private final double SINGLELOW = 0.15;
   private final double SINGLEMED = 0.22;
   private final double SINGLEHIGH = 0.30;
   private final double MARRIEDLOW = 0.14;
   private final double MARRIEDMED = 0.20;
   private final double MARRIEDHIGH = 0.28;

   public TaxReturn(String socSec, String lastName,
      String firstName, String add, String cty, String st,
      String zip, double inc, char stat)
   {  
      ssn = socSec;
      last = lastName;
      first = firstName;
      address = add;
      city = cty;
      state = st;
      zipCode = zip;
      income = inc;
      status = stat;

      double rate;
      if(income <= LOWINCOME)
         if(status == 's' || status == 'S')
              rate = SINGLELOW;
         else
              rate = MARRIEDLOW;
       else
         if(income < HIGHINCOME)
            if(status == 's' || status == 'S')
                rate = SINGLEMED;
            else
                rate = MARRIEDMED;
         else
            if(status == 's' || status == 'S')
                rate = SINGLEHIGH;
            else
                rate = MARRIEDHIGH;
      tax = rate * income;
   }
   public void display()
   {
      JOptionPane.showMessageDialog(null,
         "Taxpayer ssn: " + ssn + " " + first + " " + last + "\n" +
         address + "\n" + city + ", " + state + " " + zipCode +
         "\n Marital status: " + status + "\n" +
         "Income: $" + income + "  Tax: $" + tax); 
  }
}


