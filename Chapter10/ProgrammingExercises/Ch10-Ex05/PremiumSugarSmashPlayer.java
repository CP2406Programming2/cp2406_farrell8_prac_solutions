public class PremiumSugarSmashPlayer extends SugarSmashPlayer
{
   private final int MINSCORE = 100;
   private int LEVELS = 50;
   public PremiumSugarSmashPlayer()
   {
      scores = new int[LEVELS];
   }
   @Override
   public int getLevels()
   {
      return LEVELS;
   }
}
