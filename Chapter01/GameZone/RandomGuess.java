import javax.swing.JOptionPane;
public class RandomGuess
{
   public static void main(String[] args)
   {
      JOptionPane.showMessageDialog(null,
         "Before pressing OK try to guess my number between 1 and 10");
      JOptionPane.showMessageDialog(null,
          "The number is " + (1 + (int)(Math.random() * 10)));
   }
}
