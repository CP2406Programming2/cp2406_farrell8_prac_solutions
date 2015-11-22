public class FiveDice3
{
  public static void main(String[] args)
  {
     final int NUM = 5;
     Die[] comp = new Die[NUM];
     Die[] player =  new Die[NUM];
     int x;
     for(x = 0; x < NUM; ++x)
     {
        comp[x] = new Die();
        player[x] = new Die();
     }
     int compMatch, playerMatch;
     int compHigh, playerHigh;
     String computerName = "Computer";
     String playerName = "You";
     display(computerName, comp, NUM);
     display(playerName, player, NUM);
     compMatch = howManySame(comp, NUM);
     playerMatch = howManySame(player, NUM);
     compHigh = compMatch / 10;
     playerHigh = playerMatch / 10;
     compMatch = compMatch % 10;
     playerMatch = playerMatch % 10;
     if(compMatch == 1)
       System.out.println("Computer has nothing");
     else
       System.out.println("Computer has " + compMatch + " of a kind");
     if(playerMatch == 1)
       System.out.println("You have nothing");
     else
       System.out.println("You have " + playerMatch + " of a kind");
     if(compMatch > playerMatch)
        System.out.println("Computer wins");
     else
        if(compMatch < playerMatch)
           System.out.println("You win");
        else
        {
          if(compHigh > playerHigh)
            System.out.println("Computer's values are higher - computer wins");
          else
            if(compHigh < playerHigh)
               System.out.println("Your values are higher - you win");
            else
              System.out.println("It's a tie");
        }
  }
  public static void display(String who, Die[] die, int num)
  {
     int x;
     String dice = "";
     for(x = 0; x < num; ++x)
        dice = dice + die[x].getValue() + " ";
     System.out.println(who + " rolled: " + dice);
  }
  public static int howManySame(Die[] die, int num)
  {
     int[] same = new int[num];
     int x, y;
     int highest;
     int highValue = 0;
     for(x = 0; x < num; ++x)
       same[x] = 1; // every die matches itself
     for(x = 0; x < num - 1; ++x)
     {
       for(y = x + 1; y < num; ++y)
         if(die[x].getValue() == die[y].getValue())
         {
             same[x]++;
             if(die[x].getValue() > highValue)
                highValue = die[x].getValue();
         }
     }
     highest = same[0];
     for(x = 1; x < num; ++x)
        if(same[x] > highest)
          highest = same[x];
     highest = highest + 10 * highValue;
     return highest;
  } 
}
  
     
 