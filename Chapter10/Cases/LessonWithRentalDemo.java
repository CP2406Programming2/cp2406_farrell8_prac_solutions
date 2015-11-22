import java.util.Scanner;
public class LessonWithRentalDemo
{
   public static void main(String[] args)
   {
      int option;
      String contractNum;
      int minutes;
      final int QUIT = 9;
      int eType;
      LessonWithRental[] rentals = new LessonWithRental[4];
      int x;
      for(x = 0; x < rentals.length; ++x)
      {
         contractNum = getContractNumber();
         minutes = getMinutes();
         eType = getType();
         rentals[x] = new LessonWithRental(contractNum, minutes, eType);
         rentals[x].setContactPhone(getPhone());
      }
      System.out.println("\n\nNow display the rentals");
      option = getOption(QUIT);
      while(option != QUIT)
      {
          if(option == 1)
             sortByContractNumber(rentals);
          else
             if(option == 2)
                sortByPrice(rentals);
             else
                if(option == 3)
                   sortByType(rentals);
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
      System.out.print("   1 - by contract number\n   2 - by price\n" +
          "   3 - by equipment type\n   " + QUIT + " - to quit           >> ");
      option = input.nextInt();
      input.nextLine();
      return option;
   }
   public static void sortByContractNumber(LessonWithRental[] array)
   {
       int a,b;
       LessonWithRental temp;
       String stringB, stringBPlus;
       int highSubscript = array.length  - 1;

       for(a = 0; a < highSubscript; ++a)

          for(b = 0; b < highSubscript; ++b)
          {  
             stringB = array[b].getContractNumber();
             stringBPlus = array[b + 1].getContractNumber();

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
   public static void sortByPrice(LessonWithRental[] array)
   {
       int a,b;
       LessonWithRental temp;
       int highSubscript = array.length  - 1;

       for(a = 0; a < highSubscript; ++a)

          for(b = 0; b < highSubscript; ++b)
          {  
             if(array[b].getPrice() > array[b + 1].getPrice())
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
   public static void sortByType(LessonWithRental[] array)
   {
       int a,b;
       LessonWithRental temp;
       int highSubscript = array.length  - 1;

       for(a = 0; a < highSubscript; ++a)

          for(b = 0; b < highSubscript; ++b)
          {  
             if(array[b].getEquipType() > array[b + 1].getEquipType())
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
   public static String getContractNumber()
   {
      String num;
      Scanner input = new Scanner(System.in);
      System.out.print("\nEnter contract number >> ");
      num = input.nextLine();
      return num;
   }  
   public static int getMinutes()
   {
      int minutes;
      final int LOW_MIN = 60;
      final int HIGH_MIN = 7200;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter minutes >> ");
      minutes = input.nextInt();
      while(minutes < LOW_MIN || minutes > HIGH_MIN)
      {
         System.out.println("Time must be between " + LOW_MIN +
            " minutes and " + HIGH_MIN + " minutes");
         System.out.print("Please reenter minutes >> ");
         minutes = input.nextInt();
      }
      return minutes;
   }
   public static int getType()
   {
      int eType;
      Scanner input = new Scanner(System.in);
      System.out.println("Equipment types:");
      for(int x = 0; x < Rental.EQUIP_TYPES.length; ++x)
         System.out.println("   " + x + "  " + Rental.EQUIP_TYPES[x]);
      System.out.print("Enter equipment type >> ");
      eType = input.nextInt();
      return eType;
   }
   public static void displayDetails(LessonWithRental r)
   {
      System.out.println("\nContract #" + r.getContractNumber());
      System.out.println("For a rental of " + r.getHours() +
         " hours and " + r.getExtraMinutes() +
         " minutes,\n    at a rate of $" + r.HOUR_RATE +
         " per hour and $1 per minute,\n    the price is $" + r.getPrice());
      System.out.println("Contact phone number is: " + r.getContactPhone());
      System.out.println("Equipment rented is type #" + r.getEquipType() +
         "  " + r.getEquipTypeString());
      System.out.println(r.getInstructor());
   }   
   public static void displayMotto()
   {
      System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
      System.out.println("S                                    S");
      System.out.println("S  Sammy's makes it fun in the sun.  S");
      System.out.println("S                                    S");
      System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
   }
   public static LessonWithRental getLongerRental(LessonWithRental r1, LessonWithRental r2)
   {
      LessonWithRental longer = new LessonWithRental("X", 0, 0);
      int minutes1;
      int minutes2;
      minutes1 = r1.getHours() * Rental.MINUTES_IN_HOUR + r1.getExtraMinutes();
      minutes2 = r2.getHours() * Rental.MINUTES_IN_HOUR + r2.getExtraMinutes();
      if(minutes1 >= minutes2)
         longer = r1;
      else
         longer = r2;           
      return longer;
   }
   public static String getPhone()
   {
      String phone;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter contact phone number >> ");
      phone = input.nextLine();
      return phone;
   } 
}
