public class War3
{
   public static void main(String[] args)
   {
      final int CARDS_IN_DECK = 52;
      final int CARDS_EACH = CARDS_IN_DECK / 2;
      Card[] card = new Card[CARDS_IN_DECK];
      Card playerCard = new Card();
      Card computerCard = new Card();
      createDeck(card, CARDS_IN_DECK);
      int x, y;
      int playerCardNum, computerCardNum;
      int playerWins = 0, computerWins = 0, ties = 0;
      int cardsLeft = CARDS_IN_DECK;
      for(x = 0; x < CARDS_EACH; ++x)
      {
         playerCardNum = ((int)(Math.random() * 100) % cardsLeft);
         playerCard.setSuit(card[playerCardNum].getSuit());
         playerCard.setValue(card[playerCardNum].getValue());
         for(y = playerCardNum; y < cardsLeft - 1; ++y)
           card[y] = card[y + 1];
         --cardsLeft;
         computerCardNum = ((int)(Math.random() * 100) % cardsLeft);
         computerCard = new Card();
         computerCard.setSuit(card[computerCardNum].getSuit());
         computerCard.setValue(card[computerCardNum].getValue());
         for(y = computerCardNum; y < cardsLeft -1; ++y)
           card[y] = card[y + 1];
         --cardsLeft;
         System.out.println("Player has " + playerCard.getRank() + " of " + playerCard.getSuit() +
           "  Computer has " + computerCard.getRank() + " of " + computerCard.getSuit());
         if(playerCard.getValue() == computerCard.getValue())
         {
           System.out.println("    It's a tie");
           ++ties;
         }
         else
           if(playerCard.getValue() > computerCard.getValue())
           {
              System.out.println("    Player wins");
              ++playerWins;
           }
           else
           {
              System.out.println("    Computer wins");
              ++computerWins;
           }
       }
       System.out.println("Final tally:");
       System.out.println("    Player wins: " + playerWins);
       System.out.println("    Computer wins: " + computerWins);
       System.out.println("    Ties: " + ties);
   }
   public static void createDeck(Card[] card, int CARDS_IN_DECK)
   {
      final int HIGH_VAL = 13;
      final int LOW_VAL = 1;
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
         ++value;
         if(value > HIGH_VAL)
         {
           ++suit;
           value = 1;
         }
      }
  }
}
