import java.util.Scanner;
public class CarlysEventPrice
{
   public static void main(String[] args)
   {
      final double GUEST_PRICE = 35.00;
      final int LARGE_EVENT = 50;
      double price;
      int guests;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter number of guests >> ");
      guests = input.nextInt();
      System.out.println("****************************************************");
      System.out.println("*                                                  *");
      System.out.println("*  Carly's makes the food that makes it a party.   *");
      System.out.println("*                                                  *");
      System.out.println("****************************************************");
      price = guests * GUEST_PRICE;
      System.out.println("The price for an event with " + guests +
         " guests at $" + GUEST_PRICE + " per guest is $" + price);
      System.out.println("Whether this is a large event is " +
         (guests >= LARGE_EVENT));

   }
}
