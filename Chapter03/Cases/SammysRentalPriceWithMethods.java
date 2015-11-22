import java.util.Scanner;
public class SammysRentalPriceWithMethods
{
   public static void main(String[] args)
   {
      int minutes;
      minutes = getMinutes();
      RentalDemo.displayMotto();
      displayDetails(minutes);
   }
   public static int getMinutes()
   {
      int minutes;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter minutes >> ");
      minutes = input.nextInt();
      return minutes;
   }
   public static void displayDetails(int minutes)
   {
      final int MINUTES_IN_HOUR = 60;
      final int HOUR_RATE = 40;
      int hours;
      int extraMinutes;
      int price;
      hours = minutes / MINUTES_IN_HOUR;
      extraMinutes = minutes % MINUTES_IN_HOUR;
      price = hours * HOUR_RATE + extraMinutes;
      System.out.println("For a rental of " + hours +
         " hours and " + extraMinutes +          " minutes, the price is $" + price);
   }   
}
