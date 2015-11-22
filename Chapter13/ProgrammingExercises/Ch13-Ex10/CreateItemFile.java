import java.nio.file.*;
import java.io.*;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
import java.nio.channels.FileChannel;
public class CreateItemFile
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      Path file =
         Paths.get("C:\\Java\\Chapter.13\\Items.txt");
      String dummyItem = "                    ";
      String s = "000," + dummyItem + System.getProperty("line.separator");
      String delimiter = ",";
      String[] array = new String[3];
      byte data[] = s.getBytes();
      ByteBuffer buffer = ByteBuffer.wrap(data);
      FileChannel fc = null;
      final int RECSIZE = s.length();
      final int NUMRECS = 1000;
      final String QUIT = "999";
      String itemString;
      int itemNum;
      String description;
      String fileNum;
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
      }
      try
      {
         fc = (FileChannel)Files.newByteChannel(file, READ, WRITE);
                  
         System.out.print("Enter item number or " + QUIT + " to quit >> ");
         itemString = input.nextLine();
         while(!(itemString.equals(QUIT)))
         {
            itemNum = Integer.parseInt(itemString);
            buffer = ByteBuffer.wrap(data);
            fc.position(itemNum * RECSIZE);
            fc.read(buffer);
            s = new String(data);
            array = s.split(delimiter);
            fileNum = array[0];
            if(!(fileNum.equals("000")))
                System.out.println("Sorry - item " + itemString + " already exists");
            else
            {
               System.out.print("Enter description for item #" + itemNum + " >> ");
               description = input.nextLine();
               StringBuilder sb = new StringBuilder(description);
               sb.append(dummyItem);
               sb.setLength(dummyItem.length());
               description = sb.toString();
               s = itemString + delimiter + description + System.getProperty("line.separator");
               data = s.getBytes();
               buffer = ByteBuffer.wrap(data);
               fc.position(itemNum * RECSIZE);
               fc.write(buffer);
            }

            System.out.print("Enter next item number or " + QUIT + " to quit >> ");
            itemString = input.nextLine();
         }
         fc.close();
      }
      catch (Exception e)
      {
          System.out.println("Error message: " + e);
      }
   }
}

