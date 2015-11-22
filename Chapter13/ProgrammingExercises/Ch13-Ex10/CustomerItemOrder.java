import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
public class CustomerItemOrder
{
   public static void main(String[] args)  
   {
      Scanner keyBoard = new Scanner(System.in);
      Path customers =
         Paths.get("C:\\Java\\Chapter.13\\Customers.txt");
      Path items =
         Paths.get("C:\\Java\\Chapter.13\\Items.txt");
      String customersString = "000,      ,00000" + System.getProperty("line.separator");
      final int CUSTOMERS_RECSIZE = customersString.length();
      String itemsString = "000,                    " + System.getProperty("line.separator");
      final int ITEMS_RECSIZE = itemsString.length();
      byte[] dataCustomers = customersString.getBytes();
      byte[] dataItems = itemsString.getBytes();
      ByteBuffer bufferC = ByteBuffer.wrap(dataCustomers);
      ByteBuffer bufferI = ByteBuffer.wrap(dataItems);
      FileChannel fcCustomers = null;
      FileChannel fcItems = null;
      String[] arrayC = new String[3];
      String[] arrayI = new String[2];
      String cString;
      String iString;
      int cust;
      int item;
      String delimiter = ",";
      final String QUIT = "999";
      try
      {
         fcCustomers = (FileChannel)Files.newByteChannel(customers, READ);
         fcItems = (FileChannel)Files.newByteChannel(items, READ);
         System.out.print("Enter customer number number or " +
            QUIT + " to quit >> ");
         cString = keyBoard.nextLine();
         while(!cString.equals(QUIT))
         {
            cust = Integer.parseInt(cString); 

            fcCustomers.position(cust * CUSTOMERS_RECSIZE);
            fcCustomers.read(bufferC);
            bufferC= ByteBuffer.wrap(dataCustomers);
            customersString = new String(dataCustomers);
            
            arrayC = customersString.split(delimiter);
            if(arrayC[0].equals("000"))  
               System.out.println("No customer " + cString + " found");
            else
            {
               System.out.print("Enter item number >> ");
               iString = keyBoard.nextLine();
               item = Integer.parseInt(iString);
               bufferI= ByteBuffer.wrap(dataItems);
               fcItems.position(item * ITEMS_RECSIZE);
               fcItems.read(bufferI);
               itemsString = new String(dataItems);

               arrayI = itemsString.split(delimiter);
               if(arrayI[0].equals("000"))
                  System.out.println("No such item " + iString + " found");
               else
               {
                   System.out.print("Customer: " + arrayC[0] +
                      "   Name: " + arrayC[1] + "   zip code: " + arrayC[2]);
                   System.out.println("  ordered Item #" + arrayI[0] +
                      " which is a " + arrayI[1]);
}
            }         
            System.out.print("Enter customer ID number or " +
               QUIT + " to quit >> ");
            cString = keyBoard.nextLine();
         }
         fcCustomers.close();
         fcItems.close();
      }
      catch (Exception e)
      {
          System.out.println("Error message: " + e);
      }
   }
}

