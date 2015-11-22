public class FullDeck2
{
   public static void main(String[] args)
   {
      final int CARDS_IN_DECK = 52;
      Card2[] card = new Card2[CARDS_IN_DECK];
      final int HIGH_SUIT = 4;
      int x;
      int suit, value;
      suit = 1;
      value = 1;
      for(x = 0; x < CARDS_IN_DECK; ++x)
      {
         card[x] = new Card2();
         if(suit == 1)
           card[x].setSuit(Suit.SPADES);
         else
           if(suit == 2)
             card[x].setSuit(Suit.HEARTS);
           else
              if(suit == 3)
                 card[x].setSuit(Suit.DIAMONDS);
              else
                 card[x].setSuit(Suit.CLUBS);
         card[x].setValue(value);
         System.out.println(card[x].getRank() + " of " + card[x].getSuit());
         ++value;
         if(value > card[x].HIGH_VAL)
         {
           ++suit;
           value = 1;
         }
       }
   }
}
