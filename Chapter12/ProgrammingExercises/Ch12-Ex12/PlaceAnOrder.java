import java.util.*;
public class PlaceAnOrder
{
   public static void main(String[] args)
   {
      final int HIGHITEM = 9999;
      final int HIGHQUAN = 12;
      int code;
      int x;
      boolean found;
      final int[] ITEM = {111, 222, 333, 444};
      final double[] PRICE = {0.89, 1.47, 2.43, 5.99}; 
      int item;
      int quantity;
      double price = 0;
      double totalPrice = 0;
      Scanner input = new Scanner(System.in);
      try
      {
         code = 0;
         System.out.print("Enter item number ");
         item = input.nextInt();
         code = 1;
         System.out.print("Enter quantity ");
         quantity = input.nextInt();
         code = 2;
         if(item < 0)  
             throw (new OrderException(OrderMessages.message[code]));
         code = 3;
         if(item > HIGHITEM)
             throw(new OrderException(OrderMessages.message[code]));
         code = 4;
         if(quantity < 1)
	     throw (new OrderException(OrderMessages.message[code]));
         code = 5;
         if(quantity > HIGHQUAN)
	     throw (new OrderException(OrderMessages.message[code]));
         found = false;
         for(x = 0; x < ITEM.length; ++x)
         if(item == ITEM[x])
         {
             found = true;
             totalPrice = PRICE[x] * quantity;
             totalPrice *= 100;
             int temp = (int)totalPrice;
             totalPrice = temp / 100.0;
             price = PRICE[x];
             x = ITEM.length;
         }
         if(found)
         {
            System.out.println("Order OK. Total is $" + totalPrice +
               "\n  (" + quantity + " at $" + price + " each)");
         }
         else
         {
            code = 6;
            throw(new OrderException(OrderMessages.message[code]));
         }
      }
      catch(Exception ex)
      {
         System.out.print("Message is: ");
         System.out.println(ex.getMessage());
      } 
   }
}
 