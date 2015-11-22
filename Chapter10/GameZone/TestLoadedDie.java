public class TestLoadedDie
{
   public static void main(String[] args)
   {
      final int TIMES = 1000;
      int count = 0;
      int die1Wins = 0;
      while(count < TIMES)
      {
         Die die1 = new Die();
         Die die2 = new Die();
         if(die1.getValue() > die2.getValue())
            ++die1Wins;
         ++count;
      }
      System.out.println("With two regular dice, " +
         "the first die won " + die1Wins +
         " times out of " + TIMES);
      count = 0;
      die1Wins = 0;
      while(count < TIMES)
      {
         Die die1 = new Die();
         LoadedDie die2 = new LoadedDie();
         if(die1.getValue() > die2.getValue())
           ++die1Wins;
        ++count;
      }
      System.out.println("With one die " +
         "and one loaded die, " +
         "the first die won " + die1Wins +
         " times out of " + TIMES);
   }
}