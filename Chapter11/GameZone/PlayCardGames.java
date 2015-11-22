public class PlayCardGames
{
   public static void main(String[] args)
   { 
      Poker aGame = new Poker();
      Bridge anotherGame = new Bridge();
      aGame.shuffle();
      aGame.displayDescription();
      aGame.deal();
      System.out.println();
      anotherGame.shuffle();
      anotherGame.displayDescription();
      anotherGame.deal();
   }
}