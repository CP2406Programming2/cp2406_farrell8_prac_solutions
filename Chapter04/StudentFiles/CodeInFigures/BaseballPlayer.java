public class BaseballPlayer
{
   private static int count = 0;
   private int number;
   private double battingAverage;
   public BaseballPlayer(int id, double avg)
   {
      number = id;
      battingAverage = avg;
      count = count + 1;
   }
   public void showPlayer()
   {
      System.out.println("Player #" + number +
        " batting average is " + battingAverage +
        " There are " + count + " players");
   }
}
