import javax.swing.JOptionPane;
import java.nio.file.*;
import java.io.*;
public class GameWithPassword
{
   public static void main(String[] args)
   {
      Path file =
         Paths.get("C:\\Java\\Chapter.13\\GamePlayers.txt");
      String userId;
      String password;
      String s;
      String delim = ",";
      String[] array = new String[2];
      boolean okToPlay = false;
      int guess;
      int result;
      String msg;
      int attempts = 1;
      final int LOW = 1;
      final int HIGH = 10; 
      result = LOW + (int)(Math.random() * HIGH);
      userId = JOptionPane.showInputDialog(null, "Enter your user ID");
      password = JOptionPane.showInputDialog(null, "Enter your password");
      try
      {
         InputStream input = new BufferedInputStream(Files.newInputStream(file));
         BufferedReader reader = new BufferedReader(new InputStreamReader(input));
         s = reader.readLine();

         while(s != null)
         {
            array = s.split(delim);
            if(array[0].equals(userId) && array[1].equals(password))
               okToPlay = true;
            s = reader.readLine();
         }
         reader.close();
      }
      catch(Exception e)
      {
          System.out.println("Message: " + e);
      }       
      if(!okToPlay)
      {
          JOptionPane.showMessageDialog(null, "Sorry - your ID or password was invalid");
      }
      else
      {  
         guess = Integer.parseInt(JOptionPane.showInputDialog(null,
            "Try to guess my number between " + LOW + " and " + HIGH));
         while(guess != result)
         {
             if(guess < result)
                msg = "Your guess was too low";
             else
                msg = "Your guess was too high";
             guess = Integer.parseInt(JOptionPane.showInputDialog(null,
                msg + "\nGuess again"));
             ++attempts;
         }
         JOptionPane.showMessageDialog(null,"Correct! You got it in " + 
              attempts + " attempts");
      }

   }
}
