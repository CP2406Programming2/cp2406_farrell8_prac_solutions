public class CompareConcatenationTimes
{
   public static void main(String[] args)
   {
      long startTime1, startTime2,
         endTime1, endTime2;
      final int TIMES = 20000;
      int x;
      StringBuilder string1 = new StringBuilder("");
      StringBuilder string2 = new StringBuilder(TIMES * 4);
      startTime1 = System.currentTimeMillis();
      for(x = 0; x < TIMES; ++x)
         string1.append("Java");
      endTime1 = System.currentTimeMillis();
      System.out.println("Time for empty StringBuilder : "
         + (endTime1 - startTime1)+ " milliseconds");
      startTime2 = System.currentTimeMillis();
      for(x = 0; x < TIMES; ++x)
         string2.append("Java");
      endTime2 = System.currentTimeMillis();
      System.out.println("Time for large StringBuilder : "
         + (endTime2 - startTime2)+ " milliseconds");
   }
}
