import java.util.Scanner;
public class EventDemo
{
   public static void main(String[] args)
   {
      String eventNum;
      int guests;
      Event e1 = new Event();
      eventNum = getEventNumber();
      guests = getGuests();
      Event e2 = new Event(eventNum, guests);
      displayDetails(e1);
      displayDetails(e2);
   }
   public static String getEventNumber()
   {
      String num;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter event number >> ");
      num = input.nextLine();
      return num;
   }  
   public static int getGuests()
   {
      int guests;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter number of guests >> ");
      guests = input.nextInt();
      input.nextLine();
      return guests;
   }
   public static void displayDetails(Event e)
   {
      System.out.println("\nEvent #" + e.getEventNumber());
      System.out.println("The price for an event with " + e.getGuests() +
         " guests at $" + e.GUEST_PRICE + " per guest is $" + e.getPrice());
      System.out.println("Whether this is a large event is " +
         (e.getGuests() >= e.LARGE_EVENT));
   }
}
