import java.util.Scanner;
class QuartsToGallonsWithExceptionHandling
{    
   public static void main(String[] args) 
   {  
      final int QUARTS_IN_GALLON = 4;
      int quartsNeeded = 18;
      int gallonsNeeded;
      int extraQuartsNeeded;
      boolean isGoodUserEntry = false;
      Scanner input = new Scanner(System.in);
      while(!isGoodUserEntry)
      {
         try
         {
            System.out.print("Enter quarts needed >> ");
            quartsNeeded = input.nextInt();
            isGoodUserEntry = true;
         }
         catch(Exception e)
         {
            input.nextLine();
            System.out.println("Invalid data rntry");
         }
      }
      gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
      extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;
      System.out.println("A job that needs " + quartsNeeded +
         " quarts requires " + gallonsNeeded + " gallons plus " +
         extraQuartsNeeded + " quarts.");
   }
}