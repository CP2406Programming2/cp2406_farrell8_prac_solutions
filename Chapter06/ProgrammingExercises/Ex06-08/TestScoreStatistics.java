import java.util.*;
public class TestScoreStatistics
{
   public static void main (String args[])
   {
      int score;
      int total = 0;
      int count = 0;
      int highest;
      int lowest;
      final int QUIT = 999;
      final int MIN = 0;
      final int MAX = 100;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a score >> ");
      score = input.nextInt();
      highest = score;
      lowest = score;
      while(score != QUIT)
      {
         if(score >= MIN && score <= MAX)
         {
            ++count;
            total += score;
            if(score > highest)
               highest = score;
            if(score < lowest)
               lowest = score;
          }
         else
            System.out.print("Score must be between " + MAX + " and " + MIN + "   ");
         System.out.print("Enter another score >> ");
         score = input.nextInt();
      }
      System.out.println(count + " scores were entered");
      System.out.println("Highest was " + highest);
      System.out.println("Lowest was " + lowest);
      System.out.println("Average was " + (total * 1.0 / count));
         
   }
}


