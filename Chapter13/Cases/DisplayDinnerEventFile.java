import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
public class DisplayDinnerEventFile
{
   public static void main(String[] args)
   {
      Path deFile =
         Paths.get("C:\\Java\\Chapter.13\\Events.txt");
      String s = "";

      try
      {
         InputStream dinner = new BufferedInputStream(Files.newInputStream(deFile));
         BufferedReader dinnerReader = new BufferedReader(new InputStreamReader(dinner));
         System.out.println("\nDinner Events\n");
         System.out.println("ID #  Type  Guests  Price");
         s = dinnerReader.readLine();
         while( s != null)
         {
            display(s);
            s = dinnerReader.readLine();   
         }         
         dinnerReader.close();
      }
      catch(Exception e)
      {
         System.out.println("Message: " + e);
      }
   }
   public static void display(String s)
   {
      String[] array = new String[4];
      String delimiter = ",";
      String stringId;
      String eventType;
      int guests;
      double price;
      array = s.split(delimiter);
      stringId = array[0];
      eventType = array[1];
      guests = Integer.parseInt(array[2]);
      price = Double.parseDouble(array[3]);
      System.out.println(stringId + "    " + eventType + "      " +
         guests +  "    $" + price);
   }
}