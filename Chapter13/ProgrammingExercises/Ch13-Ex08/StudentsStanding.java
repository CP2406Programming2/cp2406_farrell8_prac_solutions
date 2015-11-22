import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
import java.nio.channels.FileChannel;
public class StudentsStanding
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      Path goodFile =
         Paths.get("C:\\Java\\Chapter.13\\StudentsGoodStanding.txt");
      Path probFile =
         Paths.get("C:\\Java\\Chapter.13\\StudentsAcademicProbation.txt");
      String s = "";
      String delimiter = ",";
      String stringId;
      String firstName;
      String lastName;
      double gpa;
      final String QUIT = "ZZZ";
      final double CUTOFF = 2.0;
      try
      {
         OutputStream goodStream = new BufferedOutputStream(Files.newOutputStream(goodFile, CREATE));
         BufferedWriter goodWriter = new BufferedWriter(new OutputStreamWriter(goodStream));
         OutputStream probStream = new BufferedOutputStream(Files.newOutputStream(probFile, CREATE));
         BufferedWriter probWriter = new BufferedWriter(new OutputStreamWriter(probStream));
         System.out.print("Enter student ID >> ");
         stringId = kb.nextLine();
         while(!stringId.equals(QUIT))
         {
            System.out.print("Enter firstName >> ");
            firstName = kb.nextLine();
            System.out.print("Enter last name >> ");
            lastName = kb.nextLine();
            System.out.print("Enter grade point average >> ");
            gpa = kb.nextDouble();
            kb.nextLine();  
            s = stringId + delimiter + firstName + delimiter +
               lastName + delimiter + gpa + System.getProperty("line.separator");
            if(gpa < CUTOFF)
               probWriter.write(s, 0, s.length());
            else
               goodWriter.write(s, 0, s.length());  
            System.out.print("Enter next student ID  or " + QUIT + " to quit >> ");
            stringId = kb.nextLine();
         }
         probWriter.close();
         goodWriter.close();
      }
      catch(Exception e)
      {
         System.out.println("Message: " + e);
      }
   }
}
