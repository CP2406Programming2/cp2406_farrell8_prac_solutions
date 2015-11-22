import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
import java.nio.channels.FileChannel;
public class RentalDemoAndCreateFile
{
   public static void main(String[] args)
   {
      int option;
      String contractNum;
      int minutes;
      final int QUIT = 9;
      int eType;
      Rental[] rentals = new Rental[4];
      int x;
      for(x = 0; x < rentals.length; ++x)
      {
         contractNum = getContractNumber();
         minutes = getMinutes();
         eType = getType();
         rentals[x] = new Rental(contractNum, minutes, eType);
         rentals[x].setContactPhone(getPhone());
      }
      System.out.println("\n\nNow display the rentals");
      for(x = 0; x < rentals.length; ++x)
      {
         displayDetails(rentals[x]);
      }
      writeFile(rentals);
   }
   public static String getContractNumber()
   {
      Scanner input = new Scanner(System.in);
      String num;
      System.out.print("\nEnter contract number >> ");
      num = input.nextLine();
      return num;
   }  
   public static int getMinutes()
   {
      int minutes = 0;
      final int LOW_MIN = 60;
      final int HIGH_MIN = 7200;
      Scanner input = new Scanner(System.in);
      boolean isOK = false;
      while(!isOK)
      {
          isOK = true;
          try
          {
              System.out.print("Enter minutes >> ");
              minutes = input.nextInt();
          }
          catch(Exception e)
          {
              isOK = false;
          }
          input.nextLine();
      }
      while(minutes < LOW_MIN || minutes > HIGH_MIN)
      {
         System.out.println("Time must be between " + LOW_MIN +
            " minutes and " + HIGH_MIN + " minutes");
         isOK = false;
         while(!isOK)
         {
            isOK = true;
            try
            {
               System.out.print("Please reenter minutes >> ");
               minutes = input.nextInt();
            }
            catch(Exception e)
            {
                isOK = false;
            }
           input.nextLine();
         }
      }
      return minutes;
    }
   public static int getType()
   {
      int eType = 0;
      Scanner input = new Scanner(System.in);
      System.out.println("Equipment types:");
      for(int x = 0; x < Equipment.EQUIP_TYPES.length; ++x)
         System.out.println("   " + x + "  " + Equipment.EQUIP_TYPES[x]);
      boolean isOK = false;
      while(!isOK)
      {
          isOK = true;
          try
          {
             System.out.print("Enter equipment type >> ");
             eType = input.nextInt();
          }
          catch(Exception e)
          {
              isOK = false;
          }
          input.nextLine();
      }
      return eType;
   }
   public static void displayDetails(Rental r)
   {
      Equipment e = r.getEquipment();
      System.out.println("\nContract #" + r.getContractNumber());
      System.out.println("For a rental of " + r.getHours() +
         " hours and " + r.getExtraMinutes() +
         " minutes,\n    at a rate of $" + r.HOUR_RATE +
         " per hour and $1 per extra minute,\n    the base price is $" + r.getBasePrice());
      System.out.println("Contact phone number is: " + r.getContactPhone());
      System.out.println("Equipment rented is type #" + e.getEquipType() +
         " -- " + e.getEquipName());
      System.out.println(e.getLessonMessage());
      System.out.println("The equipment fee with lesson is " + e.getFee());
      System.out.println("The total price is " + r.getPrice());
      System.out.println("-------------------------------");
   }   
   public static String getPhone()
   {
      String phone;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter contact phone number >> ");
      phone = input.nextLine();
      return phone;
   }
   public static void writeFile(Rental[] r)
   {
      String s;
      String delimiter = ",";
      OutputStream ostream;
      BufferedWriter writer;
      Path file =
         Paths.get("C:\\Java\\Chapter.13\\Rentals.txt");

      try
      {
         ostream = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
         writer = new BufferedWriter(new OutputStreamWriter(ostream));
         for(int x = 0; x < r.length; ++x)
         {
             Equipment e = r[x].getEquipment();
             s = r[x].getContractNumber() + delimiter + r[x].getHours() +
                 delimiter + r[x].getExtraMinutes() +
                 delimiter + e.getEquipType() +
                 delimiter + e.getEquipName() +
                 delimiter + r[x].getPrice() +
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
}
