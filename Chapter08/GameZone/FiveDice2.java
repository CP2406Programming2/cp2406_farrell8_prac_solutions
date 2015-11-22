public class FiveDice2
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
     String computerName = "Computer";
     String playerName = "You";
     display(computerName, comp, NUM);
     display(playerName, player, NUM);
     compMatch = howManySame(comp, NUM);
     playerMatch = howManySame(player, NUM);
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
           System.out.println("It's a tie");
    
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
     for(x = 0; x < num; ++x)
       same[x] = 1; // every die matches itself
     for(x = 0; x < num - 1; ++x)
     {
       for(y = x + 1; y < num; ++y)
         if(die[x].getValue() == die[y].getValue())
         {
             same[x]++;
         }
     }
     highest = same[0];
     for(x = 1; x < num; ++x)
        if(same[x] > highest)
          highest = same[x];
     return highest;
  } 
}
  
     
 