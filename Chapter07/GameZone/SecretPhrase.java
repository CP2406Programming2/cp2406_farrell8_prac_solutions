import javax.swing.*;
public class SecretPhrase
{
   public static void main(String[] args)
   {
      String targetPhrase = "Hello There";
      String displayPhrase = "H**** T****";
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
      final int LEN = targetPhrase.length();
      prompt = play + enterOne;                                                         
      while(displayPhrase.indexOf('*') != -1)
      {
         userResponse =  JOptionPane.showInputDialog(null, prompt +
             displayPhrase);
         guess = userResponse.charAt(0);
         found = false;
         for(position = 0; position < LEN; ++position)
         {
              letter = targetPhrase.charAt(position);
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
      JOptionPane.showMessageDialog(null,
         "Congratulations!\nThe phrase was:\n" + targetPhrase);
   }
}