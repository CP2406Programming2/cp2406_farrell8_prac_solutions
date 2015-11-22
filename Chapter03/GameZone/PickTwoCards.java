public class PickTwoCards
{
   public static void main(String[] args)
   {
      final int CARDS_IN_SUIT = 13;
      int myValue;    
      int yourValue;
      Card myCard = new Card();
      Card yourCard = new Card();
      myValue = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
      yourValue = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
      myCard.setValue(myValue);
      yourCard.setValue(yourValue);
      myCard.setSuit('s');
      yourCard.setSuit('h');
      System.out.println("My card is the " + myCard.getValue() + " of " + myCard.getSuit());
      System.out.println("Your card is the " + yourCard.getValue() + " of " + yourCard.getSuit());
   }
}
