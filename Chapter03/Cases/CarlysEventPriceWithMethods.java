import java.util.Scanner;
public class CarlysEventPriceWithMethods
{
   public static void main(String[] args)
   {
      int guests;
      guests = getGuests();
      displayMotto();
      displayDetails(guests);
   }
   public static int getGuests()
   {
      int guests;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter number of guests >> ");
      guests = input.nextInt();
      return guests;
   }
   public static void displayDetails(int guests)
   {
      final double GUEST_PRICE = 35.00;
      final int LARGE_EVENT = 50;
      double price;
      price = guests * GUEST_PRICE;
      System.out.println("The price for an event with " + guests +
         " guests at $" + GUEST_PRICE + " per guest is $" + price);
      System.out.println("Whether this is a large event is " +
         (guests >= LARGE_EVENT));
   }
   public static void displayMotto()
   {
      System.out.println("****************************************************");
      System.out.println("*                                                  *");
      System.out.println("*  Carly's makes the food that makes it a party.   *");
      System.out.println("*                                                  *");
      System.out.println("****************************************************");
   }
}
