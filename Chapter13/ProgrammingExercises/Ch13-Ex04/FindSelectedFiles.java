import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
public class FindSelectedFiles
{
   public static void main(String[] args)
   {
      Path f1 =
         Paths.get("C:\\Java\\CompareFolders.java");
      Path f2 =
         Paths.get("C:\\Java\\FileStatistics.class");
      Path f3 =
         Paths.get("C:\\Java\\Hello.doc");
      int count = 0;
      try
      {
         if(Files.exists(f1))
         {
            System.out.println(f1.toString() + " exists");
            ++count;
         }
         if(Files.exists(f2))
         {
            System.out.println(f2.toString() + " exists");
            ++count;
         }
         if(Files.exists(f3))
         {
            System.out.println(f3.toString() + " exists");
            ++count;
         }
         System.out.println(count + " of the files exist");
      }
      catch(Exception e)
      {
          System.out.println("IO Exception");
      }
   }
}
