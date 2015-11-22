import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
import java.nio.channels.FileChannel;
public class StaffDinnerEventAndCreateFile
{
   public static void main(String[] args)
   {                 
      Employee[] emps = new Employee[15];
      DinnerEvent[] events = new DinnerEvent[3];
      int count;
      String eventNum;
      int guests;
      int option;
      int x;
      int y;
      int waitStaff;
      int bartenders;
      int[] menuOption = new int[4];
      for(int es = 0; es < events.length; ++es)
      {
         eventNum = getEventNumber();
         guests = getGuests();
         for(y = 0; y < menuOption.length; ++y)
           menuOption[y] = getMenu(y);   
         events[es] = new DinnerEvent(eventNum, guests, menuOption[0], menuOption[1], menuOption[2], menuOption[3]);
         events[es].setContactPhone(getPhone());
         events[es].setEventType(getType());
         waitStaff = guests / 10 + 1;
         for(count = 0; count < waitStaff; ++count)
            emps[count] = getWaitstaff();
         bartenders = guests / 25 + 1;
         for(; count < waitStaff + bartenders; ++count)
            emps[count] = getBartender();
         emps[count] = getCoordinator();
         events[es].setEmps(emps);
         ++count; 
      
         System.out.println("\n\nNow display the event");
         displayDetails(events[es], count);
      }
      writeDataFile(events);
   }
   public static Waitstaff getWaitstaff()
   {
      Scanner in = new Scanner(System.in);
      Waitstaff ws= new Waitstaff();
      System.out.print("Enter Employee number for waitstaff >> ");
      ws.setEmployeeNumber(in.nextLine());
      System.out.print("Enter first name >> ");
      ws.setFirstName(in.nextLine());
      System.out.print("Enter last name >> ");
      ws.setLastName(in.nextLine());
      boolean isValidPayRate = false;
      while(!isValidPayRate)
      {
         isValidPayRate = true;
         try
         {
            System.out.print("Enter pay rate >> ");
            ws.setPayRate(in.nextDouble());
         }
         catch(Exception e)
         {
            isValidPayRate = false;
         }
         in.nextLine();
      }
      ws.setJobTitle();
      return ws;
   }
   public static Bartender getBartender()
   {
      Scanner in = new Scanner(System.in);
      Bartender bt= new Bartender();
      System.out.print("Enter Employee number for bartender >> ");
      bt.setEmployeeNumber(in.nextLine());
      System.out.print("Enter first name >> ");
      bt.setFirstName(in.nextLine());
      System.out.print("Enter last name >> ");
      bt.setLastName(in.nextLine());
      boolean isValidPayRate = false;
      while(!isValidPayRate)
      {
         isValidPayRate = true;
         try
         {
            System.out.print("Enter pay rate >> ");
            bt.setPayRate(in.nextDouble());
         }
         catch(Exception e)
         {
            isValidPayRate = false;
         }
         in.nextLine();
      }
      bt.setJobTitle();
      return bt;
   }
   public static Coordinator getCoordinator()
   {
      Scanner in = new Scanner(System.in);
      Coordinator co= new Coordinator();
      System.out.print("Enter Employee number for coordinator >> ");
      co.setEmployeeNumber(in.nextLine());
      System.out.print("Enter first name >> ");
      co.setFirstName(in.nextLine());
      System.out.print("Enter last name >> ");
      co.setLastName(in.nextLine());
      boolean isValidPayRate = false;
      while(!isValidPayRate)
      {
         isValidPayRate = true;
         try
         {
            System.out.print("Enter pay rate >> ");
            co.setPayRate(in.nextDouble());
         }
         catch(Exception e)
         {
            isValidPayRate = false;
         }
         in.nextLine();
      }
      co.setJobTitle();
      return co;
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
      int guests = 0;
      final int MIN_GUESTS = 5;
      final int MAX_GUESTS = 100;
      Scanner input = new Scanner(System.in);
      boolean isGuestsOK = false;
      while(!isGuestsOK)
      {
          isGuestsOK = true;
          try
          {
              System.out.print("Enter number of guests >> ");
              guests = input.nextInt();
          }
          catch(Exception e)
          {
             isGuestsOK = false;
          }
          input.nextLine();
      }
      while(guests < MIN_GUESTS || guests > MAX_GUESTS)
      {
          System.out.println("The number of guests must be between " +
            MIN_GUESTS + " and " + MAX_GUESTS);
          isGuestsOK = false;
          while(!isGuestsOK)
          {
            isGuestsOK = true;
            try
            {
               System.out.print("Please renter >> ");
               guests = input.nextInt();
            }
            catch(Exception e)
            {
               isGuestsOK = false;
            }
            input.nextLine();
         }
      } 
      return guests;
   }
   public static int getType()
   {
      int eType = 0;
      Scanner input = new Scanner(System.in);
      System.out.println("Event types are");
      for(int x = 0; x < Event.EVENT_TYPES.length; ++x)
         System.out.println("    " + x + " " + Event.EVENT_TYPES[x]);
      boolean isTypeOK = false;
      while(!isTypeOK)
      {
         isTypeOK = true;
         try
         {
             System.out.print("Enter event type >> ");
             eType = input.nextInt();
         }
         catch(Exception e)
         {
             isTypeOK = false;
         }
         input.nextLine();
      }
      return eType;
   }
   public static void writeDataFile(DinnerEvent[] e)
   {
      String s;
      String delimiter = ",";
      OutputStream ostream;
      BufferedWriter writer;
      Path file =
         Paths.get("C:\\Java\\Chapter.13\\Events.txt");
      try
      {
         ostream = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
         writer = new BufferedWriter(new OutputStreamWriter(ostream));
         for(int x = 0; x < e.length; ++x)
         {
             s = e[x].getEventNumber() + delimiter + e[x].getEventType() + delimiter +
                 e[x].getGuests() + delimiter + e[x].getPriceForEvent() +
                 System.getProperty("line.separator");
            writer.write(s, 0, s.length());
         }
         writer.close();
      }
      catch(Exception x)
      {
         System.out.println("Message: " + x);
      }
   }
   public static void displayDetails(DinnerEvent e, int count)
   {
      Employee[] emps = new Employee[15];
      emps = e.getEmps();
      System.out.println("\nEvent #" + e.getEventNumber());
      System.out.println("The price for an event with " + e.getGuests() +
         " guests at $" + e.getPricePerGuest() + " per guest is $" + e.getPriceForEvent());
      System.out.println("Whether this is a large event is " +
         (e.getGuests() >= e.LARGE_EVENT));
      System.out.println("Contact phone number is: " + e.getContactPhone());
      System.out.println("The event is type " + e.getEventType() + " which is the following type: " + e.getEventTypeString());
      System.out.println("The menu includes " + e.getMenu());
      System.out.println("\nThe staff includes:");
      for(int x = 0; x < count; ++x)
      {
        System.out.print(emps[x].getEmployeeNumber());
        System.out.print( " " + emps[x].getName());
        System.out.println( " " + emps[x].getPayRate() + " " + emps[x].getJobTitle());
      }
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
      int choice = 0;
      boolean isEntreeOK = false;
      while(!isEntreeOK)
      {
         isEntreeOK = true;
         try
         {
            System.out.println("Please select from the following entrees:");
            for(x = 0; x < DinnerEvent.ENTREES.length; ++x)
               System.out.println(x + "  --  " + 
                  DinnerEvent.ENTREES[x]);
            System.out.print("               >> ");
            choice = keyboard.nextInt();
         }
         catch(Exception e)
         {
            isEntreeOK = false;
         }
         keyboard.nextLine();
      }
      return choice;
   }    
   public static int displaySidesMenu()
   {
      Scanner keyboard = new Scanner(System.in);
      int x;
      int choice = 0;
      boolean isSidesOK = false;
      while(!isSidesOK)
      {
          isSidesOK = true;
          try
          {
             System.out.println("Please select from the following sides:");
             for(x = 0; x < DinnerEvent.SIDES.length; ++x)
                System.out.println(x + "  --  " + DinnerEvent.SIDES[x]);
             System.out.print("               >> ");
             choice = keyboard.nextInt();
           }
          catch(Exception e)
          {
            isSidesOK = false;
          }
          keyboard.nextLine();
      }
      return choice;
   }
   public static int displayDessertMenu()
   {
      Scanner keyboard = new Scanner(System.in);
      int x;
      int choice = 0;
      boolean isDessertOK = false;
      while(!isDessertOK)
      {
          isDessertOK = true;
          try
          {
              System.out.println("Please select from the following desserts:");
              for(x = 0; x < DinnerEvent.DESSERTS.length; ++x)
                  System.out.println(x + "  --  " + DinnerEvent.DESSERTS[x]);
              System.out.print("               >> ");
              choice = keyboard.nextInt();
           }
           catch(Exception e)
           {
              isDessertOK = false;
           }
           keyboard.nextLine();
      }
      return choice;
   }      
      
}
