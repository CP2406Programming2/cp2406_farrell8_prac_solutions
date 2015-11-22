import java.time.*;
import java.util.Scanner;
public class DaysTilNextMonth
{
   public static void main(String[] args)
   {
      LocalDate today = LocalDate.now();
      int day;
      int daysTilNextMo;
      System.out.println("Today is " + today);
      day = today.getDayOfMonth();
      daysTilNextMo = today.lengthOfMonth() - day;
      System.out.println("There are " + daysTilNextMo +
         " days until " + today.plusMonths(1).getMonth() + " starts");
   }
}
