import java.util.Scanner;
public class DinnerEventDemo
{
   public static void main(String[] args)
   {
      String eventNum;
      int guests;
      final int QUIT = 9;
      DinnerEvent[] events = new DinnerEvent[4];
      int option;
      int x;
      int y;
      int[] menuOption = new int[4];
      for(x = 0; x < events.length; ++x)
      {
         eventNum = getEventNumber();
         guests = getGuests();
         for(y = 0; y < menuOption.length; ++y)
            menuOption[y] = getMenu(y);   
         events[x] = new DinnerEvent(eventNum, guests, menuOption[0], menuOption[1], menuOption[2], menuOption[3]);
         events[x].setContactPhone(getPhone());
         events[x].setEventType(getType());
      }
      System.out.println("\n\nNow display the events");
      option = getOption(QUIT);
      while(option != QUIT)
      {
          if(option == 1)
             sortByEventNumber(events);
          else
             if(option == 2)
                sortByGuests(events);
             else
                if(option == 3)
                   sortByType(events);
                else
                   System.out.print("Invalid entry - please reenter.");
          option = getOption(QUIT);
      }

   }
   public static int getOption(final int QUIT)
   {
      Scanner input = new Scanner(System.in);
      int option;
      System.out.println("\nPlease enter an option");
      System.out.print("   1 - by event number\n   2 - by number of guests\n" +
          "   3 - by event type\n   " + QUIT + " - to quit     >> ");
      option = input.nextInt();
      input.nextLine();
      return option;
   }
   public static void sortByEventNumber(DinnerEvent[] array)
   {
       int a,b;
       DinnerEvent temp;
       String stringB, stringBPlus;
       int highSubscript = array.length  - 1;

       for(a = 0; a < highSubscript; ++a)

          for(b = 0; b < highSubscript; ++b)
          {  
             stringB = array[b].getEventNumber();
             stringBPlus = array[b + 1].getEventNumber();

             if(stringB.compareTo(stringBPlus) > 0)
               {
                  temp = array[b];
                  array[b] = array[b + 1];
                  array[b + 1] = temp;
               }
          }
      for(a = 0; a < array.length; ++a)
      {
         displayDetails(array[a]);
      }
   }
   public static void sortByGuests(DinnerEvent[] array)
   {
       int a,b;
       DinnerEvent temp;
       int highSubscript = array.length  - 1;

       for(a = 0; a < highSubscript; ++a)

          for(b = 0; b < highSubscript; ++b)
          {  
             if(array[b].getGuests() > array[b + 1].getGuests())
               {
                  temp = array[b];
                  array[b] = array[b + 1];
                  array[b + 1] = temp;
               }
          }
      for(a = 0; a < array.length; ++a)
      {
         displayDetails(array[a]);
      }
   }
   public static void sortByType(DinnerEvent[] array)
   {
       int a,b;
       DinnerEvent temp;
       int highSubscript = array.length  - 1;

       for(a = 0; a < highSubscript; ++a)

          for(b = 0; b < highSubscript; ++b)
          {  
             if(array[b].getEventType() > array[b + 1].getEventType())
               {
                  temp = array[b];
                  array[b] = array[b + 1];
                  array[b + 1] = temp;
               }
          }
      for(a = 0; a < array.length; ++a)
      {
         displayDetails(array[a]);
      }
   }
   public static String getEventNumber()
   {
      String num;
      Scanner input = new Scanner(System.in);
      System.out.print("\nEnter event number >> ");
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
   public static int getType()
   {
      int eType;
      Scanner input = new Scanner(System.in);
      System.out.println("Event types are");
      for(int x = 0; x < Event.EVENT_TYPES.length; ++x)
         System.out.println("    " + x + " " + Event.EVENT_TYPES[x]);
      System.out.print("Enter event type >> ");
      eType = input.nextInt();
      return eType;
   }
   public static void displayDetails(DinnerEvent e)
   {
      System.out.println("\nEvent #" + e.getEventNumber());
      System.out.println("The price for an event with " + e.getGuests() +
         " guests at $" + e.getPricePerGuest() + " per guest is $" + e.getPriceForEvent());
      System.out.println("Whether this is a large event is " +
         (e.getGuests() >= e.LARGE_EVENT));
      System.out.println("Contact phone number is: " + e.getContactPhone());
      System.out.println("The event is type " + e.getEventType() + " which is the following type: " + e.getEventTypeString());
      System.out.println("The menu includes " + e.getMenu());
   }
   public static DinnerEvent getLarger(DinnerEvent e1, DinnerEvent e2)
   {
      DinnerEvent larger = e2;
      if(e1.getGuests() >= e2.getGuests())
         larger = e1;
      return larger;
   }
   public static String getPhone()
   {
      String phone;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter contact phone number >> ");
      phone = input.nextLine();
      return phone;
   }
   public static int getMenu(int y)
   {
      int choice;
      if(y == 0)
         choice = displayEntreeMenu();
      else if (y == 1 || y == 2)
         choice = displaySidesMenu();
      else choice = displayDessertMenu();
      return choice;
   }
   public static int displayEntreeMenu()
   {
      Scanner keyboard = new Scanner(System.in);
      int x;
      int choice;
      System.out.println("Please select from the following entrees:");
      for(x = 0; x < DinnerEvent.ENTREES.length; ++x)
         System.out.println(x + "  --  " + DinnerEvent.ENTREES[x]);
      System.out.print("               >> ");
      choice = keyboard.nextInt();
      keyboard.nextLine();
      return choice;
   }    
   public static int displaySidesMenu()
   {
      Scanner keyboard = new Scanner(System.in);
      int x;
      int choice;
      System.out.println("Please select from the following sides:");
      for(x = 0; x < DinnerEvent.SIDES.length; ++x)
         System.out.println(x + "  --  " + DinnerEvent.SIDES[x]);
      System.out.print("               >> ");
      choice = keyboard.nextInt();
      keyboard.nextLine();
      return choice;
   }
   public static int displayDessertMenu()
   {
      Scanner keyboard = new Scanner(System.in);
      int x;
      int choice;
      System.out.println("Please select from the following desserts:");
      for(x = 0; x < DinnerEvent.DESSERTS.length; ++x)
         System.out.println(x + "  --  " + DinnerEvent.DESSERTS[x]);
      System.out.print("               >> ");
      choice = keyboard.nextInt();
      keyboard.nextLine();
      return choice;
   }      
      
}
