public class LittleLeagueBaseballGame extends BaseballGame
{
   private final int INNINGS = 6;
   public LittleLeagueBaseballGame()
   {
      scores = new int[2][INNINGS];
      for(int t = 0; t < scores.length; ++t)
         for(int i = 0; i < scores[t].length; ++i)
            scores[t][i] = UNPLAYED;
   }
   @Override
   public int getInnings()
   {
      return INNINGS;
   }
}
