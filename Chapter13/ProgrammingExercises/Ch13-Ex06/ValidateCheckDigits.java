import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
public class ValidateCheckDigits
{
   public static void main(String[] args)
   {
      Path fileIn =
         Paths.get("C:\\Java\\Chapter.13\\AcctNumsIn.txt");
      Path fileOut =
         Paths.get("C:\\Java\\Chapter.13\\AcctNumsOut.txt");
      String acct;
      int acctNum;
      int lastDigit;
      int digit;
      int sum;
      int x;
      String newline = "\n";
      InputStream input = null;
      OutputStream output = null;
      try
      {
         input = Files.newInputStream(fileIn);
         BufferedReader reader = new BufferedReader
            (new InputStreamReader(input));
         output = Files.newOutputStream(fileOut);
         acct = reader.readLine();
         while(acct != null)
         {
            sum = 0;
            acctNum = Integer.parseInt(acct);
            lastDigit = acctNum % 10;
            acctNum = acctNum / 10;
            for(x = 0; x < 6; x++) 
            {
                digit = acctNum % 10;
                acctNum = acctNum / 10;
                sum = sum + digit;
            }
            sum = sum % 10;
            if(sum == lastDigit)
            { 
              System.out.println(acct + " is valid");
              acct = acct + System.getProperty("line.separator");
              byte[] data = acct.getBytes();
              output.write(data);
            }
            else
            {
               System.out.println(acct + " is invalid");
            }
            acct = reader.readLine();
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

