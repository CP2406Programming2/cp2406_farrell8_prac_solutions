import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
import java.text.*;
public class CreateBankFile
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      Path file =
         Paths.get("C:\\Java\\Chapter.13\\BankAccounts.txt");

      String s = "0000,        ,00000.00" + System.getProperty("line.separator");
      final int RECSIZE = s.length();
      FileChannel fc = null;
      final int NUMRECS = 10000;
      long pos;
      String delimiter = ",";
      String idString;
      int id;
      String name;
      double balance;
      final String QUIT = "9999";
      try
      {
         OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
         BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
         for(int count = 0; count < NUMRECS; ++count)
             writer.write(s, 0, s.length());
         writer.close();
      }
      catch(Exception e)
      {
          System.out.println("Error message: " + e);
      }try
      {
         fc = (FileChannel)Files.newByteChannel(file, CREATE, WRITE);
         
         System.out.print("Enter 4-digit customer account number >> ");
         idString = input.nextLine();
         while(!(idString.equals(QUIT)))
         {
            id = Integer.parseInt(idString);
            System.out.print("Enter name for customer >> ");
            name = input.nextLine();
            StringBuilder sb = new StringBuilder(name);
            sb.setLength(8);
            name = sb.toString();
            System.out.print("Enter balance >> ");
            balance = input.nextDouble();
            input.nextLine();
            DecimalFormat df = new DecimalFormat("00000.00");
            s = idString + delimiter + name + delimiter + 
              df.format(balance) + System.getProperty("line.separator");
            byte data[] = s.getBytes();
            ByteBuffer buffer = ByteBuffer.wrap(data);
            fc.position(id * RECSIZE);
            fc.write(buffer);
            System.out.print("Enter next customer account number or " + QUIT + " to quit >> ");
            idString = input.nextLine();
         }
         fc.close();
      }
      catch (Exception e)
      {
          System.out.println("Error message: " + e);
      }
   }
}

