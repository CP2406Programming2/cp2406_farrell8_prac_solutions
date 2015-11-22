import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
public class SeekPosition
{
   public static void main(String[] args)
   {
      String name;
      Scanner keyboard = new Scanner(System.in);
      int pos;
      final int SIZE = 20;
      System.out.print("Enter a file name >> ");
      name = keyboard.nextLine();
      Path inputPath = Paths.get(name);
      Path fullPath = inputPath.toAbsolutePath();
      System.out.print("Enter a position number >> ");
      pos = keyboard.nextInt();
      byte[] data = new byte[SIZE];
      ByteBuffer buffer = ByteBuffer.allocate(SIZE);
      FileChannel fc = null;
      String s;

      try
      {
          fc = (FileChannel)Files.newByteChannel(fullPath, READ);
          buffer= ByteBuffer.wrap(data);
          fc.position(pos);
          fc.read(buffer);
          s = new String(data);
          System.out.println(s);
      }
      catch (Exception e)
      {
          System.out.println("Error message: " + e);
      }

   }
}

