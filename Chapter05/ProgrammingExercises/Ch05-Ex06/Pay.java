import javax.swing.*; 
public class Pay
{
   public static void main(String[] args) throws Exception
   {
      String entry, message;
      int level;
      double hoursWorked;
      double regularPay, overtimePay, totalPay;
      double payRate;
      double medical = 0, dental = 0,
         disability = 0, retirement = 0, totalDeductions;
      int medOption =0, dentOption = 0,
         disOption = 0, retOption = 0;
      final double PAY1 = 17.00;
      final double PAY2 = 20.00;
      final double PAY3 = 22.00;
      final int FULLWEEK = 40;
      final double OT_RATE = 1.5;
      final double MEDINS = 32.50;
      final double DENTALINS = 20.00;
      final double LTINS = 10.00;
      final double RET_RATE = 0.03;
      entry = JOptionPane.showInputDialog(null,
         "Please enter skill level - 1, 2, or 3");
      level = Integer.parseInt(entry);
      entry = JOptionPane.showInputDialog(null,
         "Please enter hours worked");
      hoursWorked = Double.parseDouble(entry);
      if(level == 1)
         payRate = PAY1;
      else
         if(level == 2)
            payRate = PAY2;
         else
            payRate = PAY3;
      if(hoursWorked > FULLWEEK)
      {
	  regularPay = FULLWEEK * payRate;
	  overtimePay = (hoursWorked - FULLWEEK) * OT_RATE * payRate;
      }
      else
      {
         regularPay = hoursWorked * payRate;
         overtimePay = 0.0;
      }
      totalPay = regularPay + overtimePay;
      if(level == 2 || level == 3)
      {
         entry = JOptionPane.showInputDialog(null,
            "Do you want the medical insurance?\n" +
            "   Enter 1 for Yes and 2 for No.");
         medOption = Integer.parseInt(entry);
         if(medOption == 1)
             medical = MEDINS;
         entry = JOptionPane.showInputDialog(null,
            "Do you want the dental insurance?\n" +
            "   Enter 1 for Yes and 2 for No.");
         dentOption = Integer.parseInt(entry);
         if(dentOption == 1)
             dental = DENTALINS;
         entry = JOptionPane.showInputDialog(null,
            "Do you want the long term disability insurance?\n" +
            "   Enter 1 for Yes and 2 for No.");
         disOption = Integer.parseInt(entry);
         if(disOption == 1)
             disability = LTINS;
      
         if(level == 3)
          {
            entry = JOptionPane.showInputDialog(null,
            "Do you want the retirement plan?\n" +
            "   Enter 1 for Yes and 2 for No.");
            retOption = Integer.parseInt(entry);
            if(retOption == 1)
             retirement = totalPay * RET_RATE;      
          }
       }
       totalDeductions = medical + dental + disability + retirement;
       
       message =
         "\nHours worked is    " + hoursWorked +
         "\nHourly pay rate is " + payRate +
	   "\nRegular pay is     " + regularPay +
	   "\nOvertime pay is    " + overtimePay +
         "\nTotal pay is.................." + totalPay +
         "\nDeductions" +
         "\n      Medical     " + medical +
         "\n      Dental      " + dental +
         "\n      Disability  " + disability +
         "\n      Retirement  " + retirement +
         "\nTotal deductions.............." + totalDeductions;
       if (totalDeductions > totalPay)
           message = message + "\nDeductions exceed goss pay";
       else
           message = message + "\nNet pay is...................." +
            (totalPay - totalDeductions);
       JOptionPane.showMessageDialog(null, message);
   }
}





