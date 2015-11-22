public class War
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
         if(yourSuit > HIGH_SUIT)
           yourSuit = 1;
      }
      if(mySuit == 1)
         myCard.setSuit('s');
      else
         if(mySuit == 2)
           myCard.setSuit('h');
         else
            if(mySuit == 3)
              myCard.setSuit('d');
             else
              myCard.setSuit('c');
      if(yourSuit == 1)
         yourCard.setSuit('s');
      else
         if(yourSuit == 2)
           yourCard.setSuit('h');
         else
            if(yourSuit == 3)
              yourCard.setSuit('d');
             else
              yourCard.setSuit('c');
      System.out.println("My card is the " + myCard.getValue() +
            " of " + myCard.getSuit());
      System.out.println("Your card is the " + yourCard.getValue() +
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
