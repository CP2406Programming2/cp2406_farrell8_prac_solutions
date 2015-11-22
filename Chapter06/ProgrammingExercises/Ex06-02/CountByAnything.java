import java.util.Scanner;
public class CountByAnything
{
   public static void main (String args[])
   {
      final int STOP = 200;
      final int NUMBER_PER_LINE;
      Scanner keyboard = new Scanner(System.in);
      int stepValue;
      System.out.print("Enter number to count by >> ");
      stepValue = keyboard.nextInt();
      NUMBER_PER_LINE = stepValue * 10;
      for(int i = stepValue; i <= STOP; i += stepValue)
      {
         System.out.print(i + "  ");
         if(i % NUMBER_PER_LINE == 0)
            System.out.println();
      }
   }
}


