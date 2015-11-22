import java.util.Scanner;
public class Inbetween
{
   public static void main (String args[])	
   {
      Scanner kb = new Scanner(System.in);
      int num1;
      int num2;
      int diff;
      int x;
      System.out.print("Enter an integer >> ");
      num1 = kb.nextInt();
      System.out.print("Enter another integer >> ");
      num2 = kb.nextInt();
      diff = num1 - num2;
      if(diff >= -1 && diff <= 1)
         System.out.println("There are no integers between " +
            num1 + " and " + num2);
      else
      {
         System.out.print("The numbers between " + num1 + " and " +
            num2 + " include:");
         if(num1 > num2)
            for(x = num2 + 1; x < num1; ++x)
               System.out.print(" " + x);
         else
            for(x = num1 + 1; x < num2; ++x)
               System.out.print(" " + x);
         System.out.println();
      }                  
  }
}


