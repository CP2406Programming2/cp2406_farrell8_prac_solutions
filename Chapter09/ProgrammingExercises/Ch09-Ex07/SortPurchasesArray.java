import java.util.Scanner;
public class SortPurchasesArray
{
   public static void main(String[] args)
   {
      Purchase[] purchases = new Purchase[6];
      int i;
      String message;
      char choice;
      final char QUIT = 'Z';
      int number;
      double price;
      Scanner keyboard = new Scanner(System.in);
      for(i = 0; i < purchases.length; ++i)
      {
         System.out.print("Enter invoice number >> ");
         number = keyboard.nextInt();
         System.out.print("Enter sale amount >> ");
         price = keyboard.nextDouble();
         purchases[i] = new Purchase();
         purchases[i].setInvoiceNumber(number);
         purchases[i].setSaleAmount(price);
      }
      keyboard.nextLine();
      System.out.print("\nSort Purchases by (I)nvoice number, or (S)ale amount? ");
      choice = keyboard.nextLine().charAt(0);
      while(choice != QUIT)
      {
         if(choice == 'I')
         {
             sortByInvoice(purchases);
             message = "\nSorted by invoice number\n"; 
             display(purchases, message);       
         }
         else
           if(choice == 'S')
           {
              sortBySaleAmount(purchases);
              message = "\nSorted by sale amount\n";
              display(purchases, message);
           }
           else
              System.out.println("Invalid choice");
        System.out.println("\nSort Purchases by (I)nvoice number, or (S)ale amount?");
        System.out.print("      or enter " + QUIT + " to quit >> "  );
        choice = keyboard.nextLine().charAt(0);
      }
   }
   public static void sortBySaleAmount(Purchase[] array)
   {
      int a, b;
      Purchase temp;
      int highSub = array.length - 1;
      for (a = 0; a < highSub; ++a)
      {
         for (b = 0; b < highSub; ++b)
         if(array[b].getSaleAmount() > array[b + 1].getSaleAmount())
         {
            temp = array[b];
            array[b] = array[b + 1];
            array[b + 1] = temp;
          }
        }
    }
    public static void sortByInvoice(Purchase[] array)
    {
        int a, b;
        Purchase temp;
        int highSub = array.length - 1;
        for (a = 0; a < highSub; ++a)
        {
           for (b = 0; b < highSub; ++b)
           if (array[b].getInvoiceNumber() > array[b + 1].getInvoiceNumber())
           {
              temp = array[b];
              array[b] = array[b + 1];
              array[b + 1] = temp;
           }
        }
     }
     public static void display(Purchase[] p, String msg)
     {
        System.out.println(msg);
        for (int i = 0; i < p.length; i++)
           p[i].display();
     }
}
