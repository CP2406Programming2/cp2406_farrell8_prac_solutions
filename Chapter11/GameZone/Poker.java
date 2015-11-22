public class Poker extends CardGame
{
    public Poker()
    {
       super();
       cardsDealt = 5;
    }
    public void displayDescription()
    {
      System.out.println("In poker, players bet on hands.");
      System.out.println("Winner can bluff or must have highest hand if called.");
    }
    public void deal()
    {
       int x;
       System.out.println("Your poker hand:");
       for(x = 0; x < cardsDealt; ++x)
       {
           System.out.println(card[x].getValue() + " of " + card[x].getSuit());
       }
    }  
}