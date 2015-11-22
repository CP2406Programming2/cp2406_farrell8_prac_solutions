import java.util.*;
public class PriceListApplication2
{
   public static void main(String[] args)
   {
      int item;
      Scanner input = new Scanner(System.in);
      final int MAXITEM = 3;
      System.out.print("Enter item number >> ");
      item = input.nextInt();
      try
      {
         PriceList.displayPrice(item);
      }
      catch(IndexOutOfBoundsException e)
      {
         PriceList.displayPrice(MAXITEM);
      }
   }
}
