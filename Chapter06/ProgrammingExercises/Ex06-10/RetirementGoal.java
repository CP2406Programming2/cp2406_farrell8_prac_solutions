import java.util.Scanner;
public class RetirementGoal
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      int years;
      int saveAmount;
      int total;
      System.out.print("How many years until retirement? >> ");
      years = input.nextInt();
      while(years <= 0)
      {
         System.out.println("Years cannot be 0 or negative");
         System.out.print("Please renter years >> ");
         years = input.nextInt();
      }  
      System.out.print("How much can you save annually? >> ");
      saveAmount = input.nextInt();
      while(saveAmount <= 0)
      {
         System.out.println("Amount cannot be 0 or negative");
         System.out.print("Please renter amount to save annually >> ");
         saveAmount = input.nextInt();
      }  
      total = saveAmount * years;
      System.out.print("If you save $" + saveAmount +
        " for " + years + " years, you will have $" + total);
      
   }
}

