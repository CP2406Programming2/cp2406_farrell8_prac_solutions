import java.util.*;
class MorgansBonuses
{
   public static void main(String[] args)
   {
      double[][] bonuses = 
         { { 5, 9, 16, 22, 30},
           {10, 12, 18, 24, 36},
           {20, 25, 32, 42, 53},
           {32, 38, 45, 55, 68},
           {46, 54, 65, 77, 90},
           {60, 72, 84, 96, 120} }; 
      Scanner keyboard = new Scanner(System.in);
      final int QUIT = 99;
      int weeks;
      int reviews;
      int x, y;
      
      System.out.print("Enter number of full weeks worked or " + QUIT + " to quit >> ");
      weeks = keyboard.nextInt();
      while(weeks != QUIT)
      {
         System.out.print("Enter number of positive reviews received >> ");
         reviews = keyboard.nextInt();
         if(weeks >= bonuses.length)
            weeks = bonuses.length - 1; 
         if(reviews >= bonuses[0].length)
            reviews = bonuses[0].length - 1;
         System.out.println("Bonus for " + weeks + " weeks and " +
           reviews + " positive reviews is " + bonuses[weeks][reviews]);        
         System.out.print("Enter number of full weeks worked or " + QUIT + " to quit >> ");
         weeks = keyboard.nextInt();     
      }
   }
}
   