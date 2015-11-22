import java.util.Scanner;
public class SammysRentalPrice
{
   public static void main(String[] args)
   {
      final int MINUTES_IN_HOUR = 60;
      final int HOUR_RATE = 40;
      int minutes;
      int hours;
      int extraMinutes;
      int price;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter minutes >> ");
      minutes = input.nextInt();
      hours = minutes / MINUTES_IN_HOUR;
      extraMinutes = minutes % MINUTES_IN_HOUR;
      price = hours * HOUR_RATE + extraMinutes;
      System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
      System.out.println("S                                    S");
      System.out.println("S  Sammy's makes it fun in the sun.  S");
      System.out.println("S                                    S");
      System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
      System.out.println("For a rental of " + hours + " hours and " + extraMinutes + " minutes, the price is $" + price);
   }
}
