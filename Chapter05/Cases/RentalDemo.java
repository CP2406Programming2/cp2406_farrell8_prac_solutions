import java.util.Scanner;
public class RentalDemo
{
   public static void main(String[] args)
   {
      String contractNum;
      int minutes;
      contractNum = getContractNumber();
      minutes = getMinutes();
      Rental r1 = new Rental(contractNum, minutes);
      contractNum = getContractNumber();
      minutes = getMinutes();
      Rental r2 = new Rental(contractNum, minutes);
      contractNum = getContractNumber();
      minutes = getMinutes();
      Rental r3 = new Rental(contractNum, minutes);
      displayDetails(r1);
      displayDetails(r2);
      displayDetails(r3);
      System.out.println("Of Contract #" + r1.getContractNumber() + " with a time of " +
         r1.getHours() + " hours and " + r1.getExtraMinutes() + " minutes,\n   and Contract #" +
         r2.getContractNumber() + " with a time of " + r2.getHours() + " hours and " +
         r2.getExtraMinutes() + " minutes,\n   the one with the longer time is Contract #" +
         getLongerRental(r1, r2).getContractNumber());
      System.out.println("Of Contract #" + r1.getContractNumber() + " with a time of " +
         r1.getHours() + " hours and " + r1.getExtraMinutes() + " minutes,\n   and Contract #" +
         r3.getContractNumber() + " with a time of " + r3.getHours() + " hours and " +
         r3.getExtraMinutes() + " minutes,\n   the one with the longer time is Contract #" +
         getLongerRental(r1, r3).getContractNumber()); 
      System.out.println("Of Contract #" + r2.getContractNumber() + " with a time of " +
         r2.getHours() + " hours and " + r2.getExtraMinutes() + " minutes,\n   and Contract #" +
         r3.getContractNumber() + " with a time of " + r3.getHours() + " hours and " +
         r3.getExtraMinutes() + " minutes,\n   the one with the longer time is Contract #" +
         getLongerRental(r2, r3).getContractNumber());  
   }
   public static String getContractNumber()
   {
      String num;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter contract number >> ");
      num = input.nextLine();
      return num;
   }  
   public static int getMinutes()
   {
      int minutes;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter minutes >> ");
      minutes = input.nextInt();
      return minutes;
   }
   public static void displayDetails(Rental r)
   {
      System.out.println("\nContract #" + r.getContractNumber());
      System.out.println("For a rental of " + r.getHours() +
         " hours and " + r.getExtraMinutes() +
         " minutes, at a rate of " + r.HOUR_RATE +
         " the price is $" + r.getPrice());
   }   
   public static Rental getLongerRental(Rental r1, Rental r2)
   {
      Rental longer = new Rental();
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
}
