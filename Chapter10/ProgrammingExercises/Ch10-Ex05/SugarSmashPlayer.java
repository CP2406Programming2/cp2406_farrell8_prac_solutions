public class SugarSmashPlayer
{
   private int idNumber;
   private String name;
   protected int[] scores;
   private final int MINSCORE = 100;
   private int LEVELS = 10;
   public SugarSmashPlayer()
   {
      scores = new int[LEVELS];
   }
   public void setIdNumber(int num)
   {
      idNumber = num;
   }
   public void setName(String player)
   {
      name = player;
   }
   public void setScore(int score, int level)
   {
      int x;
      boolean isBadLevel = false;
      if(level < 0 || level > scores.length - 1)
         System.out.println("****** " + level + " is an invalid level number");
      else
      {
         for(x = 0; x < level; ++x)
            if(scores[x] < MINSCORE)
               isBadLevel = true;
         if(isBadLevel)
            System.out.println("****** A score cannot yet be set for level " + level);
         else
            scores[level] = score;
      } 
   }
   public int getIdNumber()
   {
      return idNumber;
   }
   public String getName()
   {
      return name;
   }
   public int getScore(int level)
   {
      int score = -99;
      if(level < 0 || level > scores.length - 1)
         System.out.println(level + " is an invalid level number");
      else
          score = scores[level];
      return score;
   }
   public int getMinScore()
   {
      return MINSCORE;
   }
   public int getLevels()
   {
      return LEVELS;
   }
}
