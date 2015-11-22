import java.time.*;
public class ConcatenationTimeComparison
{
   public static void main(String[] args)
   {
      int startTime, endTime;
      final int TIMES = 200_000;
      final int FACTOR = 1_000_000;
      int x;
      StringBuilder string1 = new StringBuilder("");
      StringBuilder string2 = new StringBuilder(TIMES * 4);
      LocalDateTime now;
      now = LocalDateTime.now();
      startTime = now.getNano();
      for(x = 0; x < TIMES; ++x)
         string1.append("Java");
      now = LocalDateTime.now();
      endTime = now.getNano();
      System.out.println("Time with empty StringBuilder: " +
         ((endTime - startTime) / FACTOR + " milliseconds"));
      now = LocalDateTime.now();
      startTime = now.getNano();
      for(x = 0; x < TIMES; ++x)
         string2.append("Java");
      now = LocalDateTime.now();
      endTime = now.getNano();
      System.out.println("Time with empty StringBuilder: " +
         ((endTime - startTime) / FACTOR + " milliseconds"));
   }
}
