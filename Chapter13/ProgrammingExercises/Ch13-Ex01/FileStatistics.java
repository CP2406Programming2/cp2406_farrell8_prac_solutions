import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
public class FileStatistics
{
   public static void main(String[] args)
   {
      Path file =
         Paths.get("C:\\Java\\Chapter.13\\TestData.txt");
      try
      {
         int count = file.getNameCount();
         System.out.println("Path is " + file.toString());
         System.out.println("File name is " + file.getFileName());
         System.out.println("Folder name is " + file.getName(count - 2));
         BasicFileAttributes attr =
            Files.readAttributes(file, BasicFileAttributes.class);
         System.out.println("File's size is " + attr.size());
         FileTime time = attr.creationTime();
         System.out.println("File's creation time is " + time);       
      }
      catch(IOException e)
      {
          System.out.println("IO Exception");
      }
   }
}
