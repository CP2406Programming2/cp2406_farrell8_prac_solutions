import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
public class StudentsStanding2
{
   public static void main(String[] args)
   {
      Path goodFile =
         Paths.get("C:\\Java\\Chapter.13\\StudentsGoodStanding.txt");
      Path probFile =
         Paths.get("C:\\Java\\Chapter.13\\StudentsAcademicProbation.txt");
      String s = "";

      try
      {
         InputStream goodStream = new BufferedInputStream(Files.newInputStream(goodFile));
         BufferedReader goodReader = new BufferedReader(new InputStreamReader(goodStream));
         InputStream probStream = new BufferedInputStream(Files.newInputStream(probFile));
         BufferedReader probReader = new BufferedReader(new InputStreamReader(probStream));
         System.out.println("\nProbationary Standing\n");
         s = probReader.readLine();
         while( s != null)
         {
            display(s);
            s = probReader.readLine();   
         }
         System.out.println("\nGood Standing\n");
         s = goodReader.readLine();
         while( s != null)
         {
            display(s);
            s = goodReader.readLine();   
         }         
         probStream.close();
         goodStream.close();
      }
      catch(Exception e)
      {
         System.out.println("Message: " + e);
      }
   }
   public static void display(String s)
   {
      String[] array = new String[4];
      String delimiter = ",";
      String stringId;
      String firstName;
      String lastName;
      double gpa;
      double overUnder;
      final double CUTOFF = 2.0;
      array = s.split(delimiter);
      stringId = array[0];
      firstName = array[1];
      lastName = array[2];
      gpa = Double.parseDouble(array[3]);
      overUnder = gpa - CUTOFF;
      System.out.println("ID #" + stringId + "  " + firstName + "  " +
         lastName + "  GPA: " + gpa + "    " + overUnder +
         " from " + CUTOFF + " cutoff");
   }
}