import java.util.Scanner;
public class EventDemo
{
   public static void main(String[] args)
   {
      String eventNum;
      int guests;
      eventNum = getEventNumber();
      guests = getGuests();
      Event e1 = new Event(eventNum, guests);
      eventNum = getEventNumber();
      guests = getGuests();
      Event e2 = new Event(eventNum, guests);
      eventNum = getEventNumber();
      guests = getGuests();
      Event e3 = new Event(eventNum, guests);
      displayDetails(e1);
      displayDetails(e2);
      displayDetails(e3);
      Event larger = new Event();
      larger = getLarger(e1, e2);
      System.out.println("\nOf Event #" + e1.getEventNumber() +
         " with " + e1.getGuests() + " guests " + " and Event #" +
         e2.getEventNumber() + " with " + e2.getGuests() +
         "\n   the larger is Event #" + larger.getEventNumber() +
         " with " + larger.getGuests());
      larger = getLarger(e1, e3);
      System.out.println("\nOf Event #" + e1.getEventNumber() +
         " with " + e1.getGuests() + " guests " + " and Event #" +
         e3.getEventNumber() + " with " + e3.getGuests() +
         "\n   the larger is Event #" + larger.getEventNumber() +
         " with " + larger.getGuests());
      larger = getLarger(e2, e3);
      System.out.println("\nOf Event #" + e2.getEventNumber() +
         " with " + e2.getGuests() + " guests " + " and Event #" +
         e3.getEventNumber() + " with " + e3.getGuests() +
         "\n   the larger is Event #" + larger.getEventNumber() +
         " with " + larger.getGuests());
      for(int x = 0; x < e1.getGuests(); ++x)
         System.out.println("Please come to my event!");
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
      final int MIN_GUESTS = 5;
      final int MAX_GUESTS = 100;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter number of guests >> ");
      guests = input.nextInt();
      while(guests < MIN_GUESTS || guests > MAX_GUESTS)
      {
          System.out.println("The number of guests must be between " +
            MIN_GUESTS + " and " + MAX_GUESTS);
          System.out.print("Please renter >> ");
          guests = input.nextInt();
      } 
      input.nextLine();
      return guests;
   }
   public static void displayDetails(Event e)
   {
      System.out.println("\nEvent #" + e.getEventNumber());
      System.out.println("The price for an event with " + e.getGuests() +
         " guests at $" + e.getPricePerGuest() + " per guest is $" + e.getPriceForEvent());
      System.out.println("Whether this is a large event is " +
         (e.getGuests() >= e.LARGE_EVENT));
   }
   public static Event getLarger(Event e1, Event e2)
   {
      Event larger = e2;
      if(e1.getGuests() >= e2.getGuests())
         larger = e1;
      return larger;
   } 
}
