import java.util.*;
public class TryToParseDouble
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      double num;
      try
      {
         System.out.print("Enter a floating point number >> ");
         num = Double.parseDouble(keyboard.nextLine());  
      }
      catch(NumberFormatException error)
      {
         num = 0;
         System.out.println("Value entred cannot be converted to a floating-point number");
      }
      System.out.println("Number is " + num);
   }
}