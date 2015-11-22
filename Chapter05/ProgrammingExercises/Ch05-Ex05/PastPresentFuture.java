import java.util.*;
import java.time.*;
public class PastPresentFuture
{
  public static void main (String args[]) 
  {
      LocalDate today = LocalDate.now();
      int mo, da, yr;
      int todayMo, todayDa, todayYr;
      Scanner input = new Scanner(System.in);
      todayMo = today.getMonthValue();
      todayDa = today.getDayOfMonth();
      todayYr = today.getYear();
      System.out.print("Enter a month >> ");
      mo = input.nextInt();
      System.out.print("Enter a day >> ");
      da = input.nextInt();
      System.out.print("Enter a year (four digits) >> ");
      yr = input.nextInt();
      if(yr != todayYr)
         System.out.println(yr + " is not this year");
      else
         if(mo < todayMo)
            System.out.println(mo + " was a month earlier this year");
         else
            if(mo > todayMo)
               System.out.println(mo + " is a month later this year");
            else
               System.out.println(mo + " is this month");
   }
}


