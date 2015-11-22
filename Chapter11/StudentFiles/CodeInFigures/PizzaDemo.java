public class PizzaDemo implements PizzaConstants
{
   public static void main(String[] args)
   {
      double specialPrice = 11.25;
      System.out.println("Welcome to " + COMPANY);
      System.out.println("We are having a special offer:\na " +
         SMALL_DIAMETER + " inch pizza with four toppings\nor a " +
         LARGE_DIAMETER +
         " inch pizza with one topping\nfor only $" + specialPrice);
      System.out.println("With tax, that is only $" +
         (specialPrice + specialPrice * TAX_RATE));
   }
}
