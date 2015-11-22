import java.util.*;
public class DemoLLBaseballGame
{
   public static void main(String[] args)
   {
      LittleLeagueBaseballGame bbGame = new LittleLeagueBaseballGame();
      bbGame.setNames("PeeWees", "Mighty Mice");
      System.out.println("\nAt start");
      display(bbGame);       
      bbGame.setScore(0, 0, 2);
      bbGame.setScore(1, 0, 0);
      System.out.println("\nAfter setting first inning");
      display(bbGame);
      System.out.println("\nTrying to set fifth inning (inning 4) too soon");
      bbGame.setScore(0, 4, 1);
      System.out.println("\nAfter setting second inning scores");
      bbGame.setScore(0, 1, 1);
      bbGame.setScore(1, 1, 4); 
      display(bbGame);
      System.out.println("\nTryng to use an invalid inning");
      bbGame.setScore(0, 6, 2);
      System.out.println("\nTrying to use an invalid team");
      bbGame.setScore(2, 2, 2);
      System.out.println("\nAfter setting the rest of the innings");
      for(int t = 0; t < 2; ++t)
         for(int i = 2; i < bbGame.getInnings(); ++i)
            bbGame.setScore(t, i, 2);
      bbGame.setScore(1, 5, 10); //10 extra runs in last inning
      display(bbGame);
      
}
   public static void display(LittleLeagueBaseballGame b)
   {
      int[] total = {0, 0};
      boolean areInningsLeft = false;
      int score;
      System.out.println("Game between " + b.getNames());
      for(int t = 0; t < 2; ++t)
      {
         for(int i = 0; i < b.getInnings(); ++i)
         {
             score = b.getScore(t, i);
             if(score != BaseballGame.UNPLAYED)
             {
               if(i == 0)
                  System.out.print("Team " + t + ": ");
               System.out.print(score + " ");
               total[t] += score;
             }
             else
               areInningsLeft = true;
         }
         System.out.println();
      }
      if(b.getScore(0, 0) == BaseballGame.UNPLAYED && b.getScore(1, 0) == LittleLeagueBaseballGame.UNPLAYED)
         System.out.println("No innings played yet.");
      if(!areInningsLeft) 
      {
         if(total[0] > total[1])
            System.out.println("Team 1 wins!");
         else
            if(total[0] < total[1])
               System.out.println("Team 2 wins!");
            else
               System.out.println("Tie Game!");
      }  
   }
}