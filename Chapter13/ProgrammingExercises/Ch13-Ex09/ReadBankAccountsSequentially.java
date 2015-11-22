import java.nio.file.*;
import java.io.*;
import static java.nio.file.AccessMode.*;
public class ReadBankAccountsSequentially
{
   public static void main(String[] args)
   {
      Path file =
         Paths.get("C:\\Java\\Chapter.13\\BankAccounts.txt");
      String[] array = new String[3];
      String s = "";
      String delimiter = ",";
      int id;
      String stringId;
      String name;
      double balance;
      try
      {
         InputStream input = new BufferedInputStream(Files.newInputStream(file));
         BufferedReader reader = new BufferedReader(new InputStreamReader(input));
         System.out.println();        
         s = reader.readLine();
         while(s != null)
         {
            array = s.split(delimiter);
            stringId = array[0];
            id = Integer.parseInt(array[0]);
            if(id !=  0)
            {
               name = array[1];
               balance = Double.parseDouble(array[2]);
               System.out.println("ID#" + stringId + "  " + name + "   $" + balance);
            }
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
