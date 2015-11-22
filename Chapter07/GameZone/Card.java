public class Card
{
   private String suit;
   private int value;
   private String rank;
   public String getSuit()
   {
      return suit;
   }
   public int getValue()
   {
      return value;
   }
   public String getRank()
   {
      return rank;
   }
   public void setSuit(String s)
   {
      suit = s;
   }
   public void setValue(int v)
   {
      final int LOW = 1;
      final int HIGH = 13;
      if(v >= LOW && v <= HIGH)
         value = v;
       else
         value = LOW;
      if(value == 1)
        rank = "Ace";
      else
        if(value == 11)
          rank ="Jack";
        else
          if(value == 12)
             rank = "Queen";
          else
             if(value == 13)
               rank = "King";
             else
               rank = Integer.toString(value);
   }  
} 
   