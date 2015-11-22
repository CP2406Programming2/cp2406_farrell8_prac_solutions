import java.util.*;
public class PurchaseArray
{
   public static void main(String[] args)
   {
       Purchase[] purchases = new Purchase[5];
       int num;
       double amount;
       String entry;
       Scanner input = new Scanner(System.in);
       int x;
       final int LOW = 1000, HIGH = 8000;
       for(x = 0; x < purchases.length; ++x)
       {
          purchases[x] = new Purchase();
          System.out.print("Enter invoice number >> ");
          num = input.nextInt();
          while(num <= LOW || num >= HIGH)
          {
             System.out.println("Invoice number must be between " +
                LOW + " and " + HIGH);
             System.out.print("Enter invoice number >> ");
             num = input.nextInt();
          }
          System.out.print("Enter sale amount >> ");
          amount = input.nextDouble();
          while(amount < 0)
          {
             System.out.print("Enter sale amount greater than or equal to 0 >> ");
             amount = input.nextDouble();
          }
          purchases[x].setInvoiceNumber(num);
          purchases[x].setSaleAmount(amount);
      }
      System.out.println("\nSummary of purchases:");
      for(x = 0; x < purchases.length; ++x)
          purchases[x].display();
   }
}