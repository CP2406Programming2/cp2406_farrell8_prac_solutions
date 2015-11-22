import javax.swing.*;
public class SqrtException
{
   public static void main(String[] args) throws ArithmeticException
   {
      double num, result;
      String numString;
      numString = JOptionPane.showInputDialog(null,"Enter a number");
      num = Integer.parseInt(numString);
      try
      {
         if(num < 0)
            throw(new ArithmeticException());
         result = Math.sqrt(num);
         JOptionPane.showMessageDialog(null,"Result is " + result);
      }
      catch(ArithmeticException error)
      {
         JOptionPane.showMessageDialog(null,
           "Can't take square root of negative number");
      }
   }
}