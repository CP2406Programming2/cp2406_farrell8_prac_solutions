public class Bridge extends CardGame
{
   public Bridge()
   {
      super();
      cardsDealt = 13;
   }
   public void displayDescription()
   {
      System.out.println("In bridge, partners bid on how many tricks they will take.");
      System.out.println("The high bid determines a trump suit.");
   }
   public void deal()
   {
      int x;
      System.out.println("Your bridge hand:");
      for(x = 0; x < cardsDealt; ++x)
      {
         System.out.println(card[x].getValue() + " of " + card[x].getSuit());
      }
   }   
}