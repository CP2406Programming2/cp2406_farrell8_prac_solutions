import java.nio.file.*;
import java.io.*;
import static java.nio.file.AccessMode.*;
public class DisplaySavedCustomerList
{
   public static void main(String[] args)
   {
      Path file =
         Paths.get("C:\\Java\\Chapter.13\\CustomerList.txt");
      String[] array = new String[4];
      String s = "";
      String delimiter = ",";
      try
      {
         InputStream input = new BufferedInputStream(Files.newInputStream(file));
         BufferedReader reader = new BufferedReader(new InputStreamReader(input));
         s = reader.readLine();
         while(s != null)
         {
            array = s.split(delimiter);
            for(int x = 0; x < array.length; ++x)
               System.out.print(array[x] + "  ");
            System.out.println();
            s = reader.readLine();           
         }
         reader.close();
      }
      catch(Exception e)
      {
        System.out.println("Message: " + e);
      }
   }
}
