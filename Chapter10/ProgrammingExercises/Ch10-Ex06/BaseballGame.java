public class BaseballGame
{
   private String[] names = new String[2];
   protected int[][] scores;
   public static final int UNPLAYED = -99;
   private final int INNINGS = 9;
   public BaseballGame()
   {
      scores = new int[2][INNINGS];
      for(int t = 0; t < scores.length; ++t)
         for(int i = 0; i < scores[t].length; ++i)
            scores[t][i] = UNPLAYED;
   }
   public void setNames(String n1, String n2)
   {
      names[0] = n1;
      names[1] = n2;
   }
   public void setScore(int team, int inning, int score)
   {
      int x;
      boolean isBadTeam = false;
      boolean isBadInning = false;
      if(team < 0 || team > scores.length - 1)
          System.out.println("****** " + team + " is not a valid team value");
      else
         if(inning < 0 || inning > scores[0].length - 1)
            System.out.println("****** " + inning + " is not a valid inning value");
         else
         {
            for(x = 0; x < inning; ++x)
               if(scores[team][x] == UNPLAYED)
                  isBadInning = true;
            if(isBadInning)
               System.out.println("****** A score cannot yet be set for inning " + inning);
            else
               scores[team][inning] = score;
         } 
   }
   public String getNames()
   {
      return names[0] + " vs. " + names[1];
   }
   public String getName(int pos)
   {
      return names[pos];
   }
   public int getScore(int team, int inning)
   {
      int score = -99;
      if(team < 0 || team > scores.length - 1)
         System.out.println(team + " is an invalid team number");
      else
         if(inning < 0 || inning > scores[0].length - 1)
            System.out.println(inning + " is an invalid inning");
         else
            score = scores[team][inning];
      return score;
   }
   public int getInnings()
   {
      return INNINGS;
   }
}
