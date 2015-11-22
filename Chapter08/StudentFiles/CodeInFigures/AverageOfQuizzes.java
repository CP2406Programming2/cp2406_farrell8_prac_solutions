import java.util.*;
public class AverageOfQuizzes
{
   public static void main(String[] args)
   {
      int[] scores = new int[10];
      int score = 0;
      int count = 0;
      int total = 0;
      final int QUIT = 999;
      final int MAX = 10;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter quiz score or " +
         QUIT + " to quit      >> ");
      score = input.nextInt();
      while(score != QUIT)
      {
          scores[count] = score;
          total += scores[count];
          ++count;
          if(count == MAX)
             score = QUIT;
          else
          {
              System.out.print("Enter next quiz score or " +
                  QUIT + " to quit >> ");
              score = input.nextInt();
          }
      }
      System.out.print("\nThe scores entered were: ");
      for(int x = 0; x < count; ++x)
         System.out.print(scores[x] + "  ");
      if(count != 0)
         System.out.println("\n The average is " + (total * 1.0 / count));
      else
         System.out.println("No scores were entered.");
   }
}