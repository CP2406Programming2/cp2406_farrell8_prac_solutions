public class FullDeck
{
   public static void main(String[] args)
   {
      final int CARDS_IN_DECK = 52;
      Card[] card = new Card[CARDS_IN_DECK];
      final int HIGH_SUIT = 4;
      int x;
      int suit, value;
      suit = 1;
      value = 1;
      for(x = 0; x < CARDS_IN_DECK; ++x)
      {
         card[x] = new Card();
         if(suit == 1)
           card[x].setSuit("Spades");
         else
            if(suit == 2)
               card[x].setSuit("Hearts");
            else
               if(suit == 3)
                  card[x].setSuit("Diamonds");
               else
                  card[x].setSuit("Clubs");
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
