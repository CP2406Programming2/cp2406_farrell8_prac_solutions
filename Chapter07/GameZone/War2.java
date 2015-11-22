public class War2
{
   public static void main(String[] args)
   {
      int myValue, mySuit;  
      int yourValue, yourSuit;
      final int HIGH = 13;
      final int LOW = 1;
      final int HIGH_SUIT = 4;
      Card myCard = new Card();
      Card yourCard = new Card();
      myValue = ((int)(Math.random() * 100) % HIGH + LOW);
      yourValue = ((int)(Math.random() * 100) % HIGH + LOW);
      myCard.setValue(myValue);
      yourCard.setValue(yourValue);
      mySuit = ((int)(Math.random() * 100) % HIGH_SUIT + LOW);
      yourSuit = ((int)(Math.random() * 100) % HIGH_SUIT + LOW);
      if(myValue == yourValue && mySuit == yourSuit)
      {
         yourSuit = yourSuit + 1;
         if(yourSuit > 4)
            yourSuit = 1;
      }
      if(mySuit == 1)
         myCard.setSuit("Spades");
      else
         if(mySuit == 2)
            myCard.setSuit("Hearts");
         else
            if(mySuit == 3)
               myCard.setSuit("Diamonds");
             else
               myCard.setSuit("Clubs");
      if(yourSuit == 1)
         yourCard.setSuit("Spades");
      else
         if(yourSuit == 2)
           yourCard.setSuit("Hearts");
         else
            if(yourSuit == 3)
              yourCard.setSuit("Diamonds");
            else
              yourCard.setSuit("Clubs");
      
      System.out.println("My card is the " + myCard.getRank() +
            " of " + myCard.getSuit());
      System.out.println("Your card is the " + yourCard.getRank() +
            " of " + yourCard.getSuit());
      if(myValue == yourValue)
          System.out.println("It's a tie");
      else
         if(myValue > yourValue)
           System.out.println("I win");
         else
           System.out.println("You win");
   }
}
