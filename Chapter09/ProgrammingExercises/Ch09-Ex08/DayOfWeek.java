import java.util.Scanner;
public class DayOfWeek
{
   enum Day {SUN, MON, TUE, WED, THU, FRI, SAT};

   public static void main(String[] args)
   {
      Day day;
      String userEntry;
      int position;
      int comparison;
      String[] times = {"11 - 5", "9 - 9", "10 - 6"};
      Scanner input = new Scanner(System.in);
      System.out.println("The days are:");
      for(Day d : Day.values())
         System.out.print(d + " ");
      System.out.print("\n\nEnter the day code to find our hours >> ");
      userEntry = input.nextLine().toUpperCase();
      day = Day.valueOf(userEntry);
      System.out.println("You entered " + day);
      position =  day.ordinal();
      System.out.print("On " + day + " our hours are ");
      if(position == 0)
         System.out.println(times[0]);
      else
         if(position == 6)
            System.out.println(times[2]);
         else
            System.out.println(times[1]);
         
   }
}
