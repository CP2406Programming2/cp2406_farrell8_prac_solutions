public class Billing
{
   final static double TAX = 0.08;
   public static void main(String[] args)
   {
      double bill;
      bill = computeBill(24.99);
      System.out.println("The total for a photobook that costs $24.99 is $" +
         bill);
      bill = computeBill(17.50, 4);
      System.out.println("The total for four photobooks that cost $17.50 is $" +
         bill);
      bill = computeBill(10.00, 6, 20.00);
      System.out.println("The total for six photobooks that cost $10.00 with a $20 coupon is $" +
         bill);
    }

   public static double computeBill(double amt)
   {
      double bill = amt + amt * TAX;
      return bill;
   }

   public static double computeBill(double amt, int quantity)
   {
      double bill = amt * quantity;
      bill = bill + bill * TAX;
      return bill;
   }
   public static double computeBill(double amt, int quantity, double coupon)
   {
      double bill = amt * quantity;
      bill = bill - coupon;
      bill = bill + bill * TAX;
      return bill;
   }
}