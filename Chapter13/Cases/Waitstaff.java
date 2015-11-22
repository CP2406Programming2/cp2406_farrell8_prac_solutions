public class Waitstaff extends Employee
{
   public final static double PAY_RATE = 10.00;
   public void setPayRate(double rate)
   {
      if(rate > PAY_RATE)
        payRate = PAY_RATE;
      else
        payRate = rate;
   }
   public void setJobTitle()
   {
      jobTitle = "waitstaff";
   }
}
