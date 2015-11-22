public class Bartender extends Employee
{
   public final static double PAY_RATE = 14.00;
   public void setPayRate(double rate)
   {
      if(rate > PAY_RATE)
         payRate = PAY_RATE;
      else
         payRate = rate;
   }
   public void setJobTitle()
   {
      jobTitle = "bartender";
   }
}