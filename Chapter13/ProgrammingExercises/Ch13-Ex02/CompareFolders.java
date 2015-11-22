import java.nio.file.*;
import java.io.IOException;
public class CompareFolders
{
   public static void main(String[] args)
   {
      Path file1 =
         Paths.get("C:\\Java\\Chapter.12\\TestData1.txt");
       Path file2 =
         Paths.get("C:\\Java\\Chapter.13\\TestData2.txt");
       Path file3 =
         Paths.get("C:\\Java\\Chapter.13\\TestData3.txt");
      boolean foldersAreSame = true;
      try
      {
         int count1 = file1.getNameCount();
         int count2 = file2.getNameCount();
         int count3 = file3.getNameCount();
         Path name3;
         System.out.println("Path for file1 is " + file1.toString());
         System.out.println("Path for file2 is " + file2.toString());
         System.out.println("Path for file3 is " + file3.toString());
         for(int x = 0; x < count3 - 1; ++x)
         {
            name3 = file3.getName(x);
            if(!(file1.getName(x).equals(name3)) &&
                file2.getName(x).equals(name3))
                   foldersAreSame = false;
         }
         if(foldersAreSame)
               System.out.println("All files are in the same folder");
         else
               System.out.println("Files are not in the same folder");      
      }
      catch(Exception e)
      {
          System.out.println("IO Exception");
      }
   }
}
