import javax.swing.*;
public class SecretPhrase2
{
  public static void main(String[] args)
  {
    String[] targetPhrases = {"The Wizard of Oz", "Gone With The Wind", "Casablanca",
       "Chicago", "Top Hat", "White Christmas", "The Sound of Music", "Guys and Dolls",
       "Its a Mad Mad Mad Mad World", "Defending Your Life"};
    String displayPhrase = "";
    String target;
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
    int random = (int) (Math.random() * 100) % targetPhrases.length;
    target = targetPhrases[random];
    target = target.toLowerCase();
    
    final int LEN = target.length();
    x = 0;
  
    while(x < LEN)
    {
      if(target.charAt(x) == ' ')
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
            letter = target.charAt(position);
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
      targetPhrases[random]);
  }
}