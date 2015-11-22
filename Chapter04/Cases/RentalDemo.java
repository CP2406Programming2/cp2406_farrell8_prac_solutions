import java.util.Scanner;
public class RentalDemo
{
   public static void main(String[] args)
   {
      String contractNum;
      int minutes;
      Rental r1 = new Rental();
      contractNum = getContractNumber();
      minutes = getMinutes();
      Rental r2 = new Rental(contractNum, minutes);
      displayDetails(r1);
      displayDetails(r2);
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
   public static void displayMotto()
   {
      System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
      System.out.println("S                                    S");
      System.out.println("S  Sammy's makes it fun in the sun.  S");
      System.out.println("S                                    S");
      System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
   }
}
