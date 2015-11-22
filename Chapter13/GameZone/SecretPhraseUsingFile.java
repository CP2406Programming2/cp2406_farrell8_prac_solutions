import javax.swing.*;
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
public class SecretPhraseUsingFile
{
   public static void main(String[] args)
   {
      Path file =  Paths.get("C:\\Java\\Chapter.13\\Phrases.txt");
      InputStream input = null;
      String s = "";
   
      String displayPhrase = "";
      String buildDisplayPhrase;
      String prompt;
      String play = "Play our game - guess the phrase\n";
      String enterOne = "Enter one letter\n";
      String sorry = "Sorry - not in the phrase: ";
      String correct = "Correct! ";
      String userResponse;
      char guess;
      char letter;
      boolean found = false;
      int position;
      int oldPos = 0;
      int x;
      int random = 0;
      int count = 0;
      final int LEN;
      x = 0;
      try
      {
         input = Files.newInputStream(file);
         BufferedReader reader = new BufferedReader(new InputStreamReader(input));
         s = reader.readLine();
         while(s != null)
         {
            ++count;
            s= reader.readLine();
         }
         random = (int) (Math.random() * 100) % count;
         input.close();
      }
      catch (Exception e)
      {
         System.out.println(e);
      }
    
      try
      {
         input = Files.newInputStream(file);
         BufferedReader reader = new BufferedReader(new InputStreamReader(input));
         s = reader.readLine();
         int numRead = 0;
         while(numRead < random)
         {
            ++numRead;
            s = reader.readLine();
         }
         input.close();
      }
      catch (Exception e)
      {
         System.out.println(e);
      }
      s = s.toLowerCase();
      LEN = s.length();
      while(x < LEN)
      {
        if(s.charAt(x) == ' ')
          displayPhrase = displayPhrase + ' ';
        else
          displayPhrase = displayPhrase + "*";
        ++x;
      }
      prompt = play + enterOne;                                       
      while(displayPhrase.indexOf('*') != -1)
      {
         userResponse =  JOptionPane.showInputDialog(null, prompt +
           displayPhrase);
         userResponse = userResponse.toLowerCase();
         guess = userResponse.charAt(0);
         found = false;
         for(position = 0; position < LEN; ++position)
         {
            letter = s.charAt(position);
            if(letter == guess)
            {
               displayPhrase = displayPhrase.substring(0, position) +
                 guess + displayPhrase.substring(position + 1, LEN);
               found = true;
            }      
         }
         if(!found)
         {
            prompt = sorry + guess + '\n';
         }
         else
         {
            prompt = correct + enterOne;  
         } 
      }
      JOptionPane.showMessageDialog(null, "Congratulations!\nThe phrase was:\n" +
      s);
   }
}