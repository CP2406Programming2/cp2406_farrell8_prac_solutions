public class TwoDice2
{
   public static void main(String[] args)
   {
      Die firstDie = new Die();
      Die secondDie = new Die();
      int value1 = firstDie.getValue();
      int value2 = secondDie.getValue();
      System.out.println("First die is  " + value1);
      System.out.println("Second die is " + value2);
      if(value1 > value2)
         System.out.println("First is greater");
      else
        if(value2 > value1)
           System.out.println("Second value is greater");
        else
           System.out.println("The dice are equal");
   }
}