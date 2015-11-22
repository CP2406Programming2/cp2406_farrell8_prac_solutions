public class DogTriathlonParticipant3
{
   private final int NUM_EVENTS;
   private static int totalCumulativeScore = 0;
   private String name;
   private int obedienceScore;
   private int conformationScore;
   private int agilityScore;
   private boolean scoresAgree;
   private int total;
   private double avg;
   public DogTriathlonParticipant3(String name, int numEvents,
      int score1, int score2, int score3)
   {
      this.name = name;
      if(numEvents == 0)
        NUM_EVENTS = 1;
      else
        NUM_EVENTS = numEvents;
      int totalNot0 = 0;
      switch(numEvents)
      {
         case 0:
           if(score1 == 0 && score2 == 0 && score3 == 0)
              scoresAgree = true;
           else
              scoresAgree = false;
           break;
         case 1:
           if(score1 == 0)
              if(score2 == 0 || score3 == 0)
                 scoresAgree = false;
               else
                  scoresAgree = true; 
           else
              if(score2 == 0)
                 if(score3 == 0) 
                    scoresAgree = false;
                 else
                    scoresAgree = true;
              else
                 if(score3 == 0)
                    scoresAgree = true;
                 else
                    scoresAgree = false;
            break;
         case 2:
            if(score1 == 0)
              if(score2 == 0 || score3 == 0)
                 scoresAgree = false;
              else
                 scoresAgree = true;
            else
              if(score2 == 0)
                 if(score3 == 0)
                   scoresAgree = false;
                 else
                   scoresAgree = true;
              else
                 if(score3 == 0)
                    scoresAgree = true;
                 else
                    scoresAgree = false;
              break;                        
          case 3:
            if(score1 != 0 && score2 != 0 && score3 != 0)
               scoresAgree = true;
            else
               scoresAgree = false;
            break;
         default:
            scoresAgree = false;
      }
      if(scoresAgree)
      {
         obedienceScore = score1;
         conformationScore = score2;
         agilityScore = score3;
      }
      else
      {
         obedienceScore = 0;
         conformationScore = 0;
         agilityScore = 0;
      }  
      total = obedienceScore + conformationScore + agilityScore;
      if(NUM_EVENTS == 0)
         avg = 0;
      else
         avg = (double) total / NUM_EVENTS;
      totalCumulativeScore = totalCumulativeScore + total;
   }
   public void display()
   {
      if(!scoresAgree)
         System.out.println("\nNotice! Number of events for " +
            name + " does not agree with scores reported.");
      System.out.println(name + " participated in " + NUM_EVENTS +
         " events and has an average score of " + avg);
      System.out.println("   " + name + " has a total score of " +
         total + " bringing the total cumulative score to " +
         totalCumulativeScore);
   }
}
