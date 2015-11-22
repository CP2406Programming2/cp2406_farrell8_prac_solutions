import java.nio.file.*;
import java.io.*;
import static java.nio.file.AccessMode.*;
import java.util.Scanner;
public class DisplaySelectedCustomer
{
   public static void main(String[] args)
   {
      Scanner keyBoard = new Scanner(System.in);
      Path file =
         Paths.get("C:\\Java\\Chapter.13\\CustomerList.txt");
      String[] array = new String[4];
      String s = "";
      String delimiter = ",";
      String searchID;
      boolean wasFound = false;
      try
      {
         InputStream input = new BufferedInputStream(Files.newInputStream(file));
         BufferedReader reader = new BufferedReader(new InputStreamReader(input));
         System.out.println();        

         System.out.print("Enter ID number to search for >> ");
         searchID = keyBoard.nextLine();
         s = reader.readLine();
         while(s != null)
         {
            array = s.split(delimiter);
            if(searchID.equals(array[0]))
            {
               wasFound = true;
               for(int x = 0; x < array.length; ++x)
                  System.out.print(array[x] + "  ");
               System.out.println();
            }
            s = reader.readLine();           
         }
         if(!wasFound)
           System.out.println("No records found for " + searchID);
         reader.close();
      }
      catch(Exception e)
      {
        System.out.println("Message: " + e);
      }
   }
}
