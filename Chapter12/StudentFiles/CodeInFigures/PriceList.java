public class PriceList
{
   private static final double[] price = {15.99, 27.88, 34.56, 45.89};
   public static void displayPrice(int item) throws IndexOutOfBoundsException
   {
      System.out.println("The price is $" + price[item]);
   }
}
