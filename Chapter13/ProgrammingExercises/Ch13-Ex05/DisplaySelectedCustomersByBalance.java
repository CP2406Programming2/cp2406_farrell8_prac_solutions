import java.nio.file.*;
import java.io.*;
import static java.nio.file.AccessMode.*;
import java.util.Scanner;
public class DisplaySelectedCustomersByBalance
{
   public static void main(String[] args)
   {
      Scanner keyBoard = new Scanner(System.in);
      Path file =
         Paths.get("C:\\Java\\Chapter.13\\CustomerList.txt");
      String[] array = new String[4];
      String s = "";
      String delimiter = ",";
      double balance;
      boolean wasFound = false;
      final int BAL_POSITION = 3;
      try
      {
         InputStream input = new BufferedInputStream(Files.newInputStream(file));
         BufferedReader reader = new BufferedReader(new InputStreamReader(input));
         System.out.println();        
         System.out.print("Enter minimum balance >> ");
         balance = keyBoard.nextDouble();
         s = reader.readLine();
         while(s != null)
         {
            array = s.split(delimiter);
            custBal = Double.parseDouble(array[BAL_POSITION]);
            if(custBal >= balance)
            {
               wasFound = true;
               for(int x = 0; x < array.length; ++x)
                  System.out.print(array[x] + "  ");
               System.out.println();
            }
            s = reader.readLine();           
         }
         if(!wasFound)
           System.out.println("No records found with a balance of at least $" + balance);
         reader.close();
      }
      catch(Exception e)
      {
        System.out.println("Message: " + e);
      }
   }
}
