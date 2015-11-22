import javax.swing.JOptionPane; 
public class DoesItHaveLegs
{
   public static void main(String args[])
   {
      String[] questions = new String[100];
      String[] answers = new String[100];
      String yourAnimal = new String();
      String yourQuestion = new String();
      boolean isDone = false;
      boolean wantToPlay = true;
      int answer;
      int total = 100;
      int pos = 0, oldPos = 0;
      int yesPos = 1, noPos = 2;
      questions[pos] = "Does the animal you are thinking of have legs?";
      questions[1] = "Is it a dog?";
      questions[2] = "Is it a fish?";
      answers[1] = "dog";
      answers[2] = "fish";
      while(wantToPlay)
      {
         pos = 0;
         isDone = false;
         while(isDone == false)
         { 
            answer = JOptionPane.showConfirmDialog(null, questions[pos]);
            oldPos = pos;
            yesPos = pos * 2 + 1;
            noPos = pos * 2 + 2;
            if(answer == JOptionPane.YES_OPTION)
               pos = yesPos;
            else
               pos = noPos;
            if(questions[pos] == null)
            {
               if(answer == JOptionPane.YES_OPTION)
               {
                  JOptionPane.showMessageDialog(null, "Yay! I win!");
                  isDone = true;
                  pos = 0;
               }
               else
               {
                  yourAnimal = JOptionPane.showInputDialog(null,
                     "I give up.\nWhat was your animal?");
                  yourQuestion = JOptionPane.showInputDialog(null,
                     "Type a question for which the answer is Yes for " +
                     answers[oldPos] + "\nbut No for " + yourAnimal + ".");
                  questions[yesPos] = questions[oldPos];
                  questions[oldPos] = yourQuestion;
                  questions[noPos] = "Is it a " + yourAnimal + "?";
                  answers[yesPos] = answers[oldPos];
                  answers[noPos] = yourAnimal;
                  isDone = true;
                  pos = 0;
               }   
            }
         }
         answer = JOptionPane.showConfirmDialog(null, "Do you want to play again?");
         wantToPlay = (answer == JOptionPane.YES_OPTION);
      }
   }
}