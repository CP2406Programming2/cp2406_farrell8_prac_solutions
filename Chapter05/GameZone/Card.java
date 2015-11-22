public class Card
{
   final int LOW = 1;
   final int HIGH = 13;
   private char suit;
   private int value;
   public char getSuit()
   {
      return suit;
   }
   public int getValue()
   {
      return value;
   }
   public void setSuit(char s)
   {
      suit = s;
   }
   public void setValue(int v)
   {
      if(v >= LOW && v <= HIGH)
         value = v;
      else
         value = LOW;
   }
} 
    