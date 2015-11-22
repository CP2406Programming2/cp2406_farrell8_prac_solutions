import java.util.*;
public class DivisionMistakeCaught4
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int numerator, denominator, result;
      try
      {
         System.out.print("Enter numerator >> ");
         numerator = input.nextInt();
         System.out.print("Enter denominator >> ");
         denominator = input.nextInt();
         result = numerator / denominator;
         System.out.println(numerator + " / " + denominator + 
            " = " + result);  
      }
      catch(Exception mistake)
      {
         System.out.println("Operation unsuccessful");
      }
      System.out.println(“End of program”);
   }
}
