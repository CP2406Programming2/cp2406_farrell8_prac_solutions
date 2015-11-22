import java.util.*;
public class DistanceFromAverageWithExceptionHandling
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      double[] numbers;
      int enteredSize = 0;
      double entry = 0;
      double total = 0;
      double average = 0;
      final int QUIT = 99999;
      boolean canCreateArray = true;
      boolean isValOk = false;
      int x = 0, y;
      try
      {
         System.out.print("Please enter a value for the array size >> ");
         enteredSize = input.nextInt();
      }
      catch(Exception e)
      {
            System.out.println("Invalid value for array size");
            canCreateArray = false;
            input.nextLine();
      }
      if(canCreateArray)
      {
         numbers = new double[enteredSize];
         while(!isValOk)
         {
             try
             {
                 System.out.print("Enter a numeric value or " +
                    QUIT + " to quit >> ");
                 entry = input.nextDouble();
                 isValOk = true;
             }
             catch(Exception e)
             {
                isValOk = false;
                input.nextLine();
             }
         }
         while(entry != QUIT && x < numbers.length)
         {
            numbers[x] = entry;
            ++x;
            if(x < numbers.length)
            {
               try
               {
                  System.out.print("Enter next numeric value or " +
                     QUIT + " to quit >> ");
                  entry = input.nextDouble();
               }
               catch(Exception e)
               {
                  --x;
                  input.nextLine();
               }
            }
         }
         if(x == 0)
            System.out.println("Average cannot be computed because no numbers were entered");
         else
         {
            for(int a = 0; a < numbers.length; ++a)
               total += numbers[a];
            average = total / x;
            System.out.println("You entered " + x +
               " numbers and their average is " + average);
            for(y = 0; y < x; ++y)
               System.out.println(numbers[y] + " is " +
                  (average - numbers[y]) + " away from the average");
         }           
      }
   }
}
