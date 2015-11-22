// Program reads in a file of phone numbers without area codes
// inserts "(312) " in front of each phone number
// and produces an output file with the new complete phone numbers
import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
public class FixDebugThirteen2
{
   public static void main(String[] args)
   {
      Path fileIn =
         Paths.get("C:\\Java\\Chapter.13\\DebugData3.txt");
      Path fileOut =
         Paths.get("C:\\Java\\Chapter.13\\DebugData3New.txt");
      String areaCode = "(312) ";
      String phone;
      InputStream input = null;
      OutputStream output = null;
      try
      {
         input = Files.newInputStream(fileIn);
         BufferedReader reader = new BufferedReader
            (new InputStreamReader(input));
         output = Files.newOutputStream(fileOut);
         phone = reader.readLine();
         while(phone != null)
         {
            phone = areaCode + phone + System.getProperty("line.separator");
            byte[] phoneBytes = phone.getBytes();
            output.write(phoneBytes);
            phone = reader.readLine();
         }
         input.close();
         output.close();
       }
       catch (IOException e)
       {
          System.out.println(e);
       }
   }
}

