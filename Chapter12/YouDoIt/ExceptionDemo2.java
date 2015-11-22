import javax.swing.*;
public class ExceptionDemo2
{
   public static void main(String[] args)
   {
       int numerator = 0, denominator = 0, result;
       String inputString;
       try
       {
         inputString = JOptionPane.showInputDialog(null,
           "Enter a number to be divided");
         numerator = Integer.parseInt(inputString);
         inputString = JOptionPane.showInputDialog(null,
           "Enter a number to divide into the first number");
         denominator = Integer.parseInt(inputString);
         result = numerator / denominator;
       }
       catch(ArithmeticException exception)
       {
          JOptionPane.showMessageDialog(null, exception.getMessage());
          result = 0;
       }
       catch(NumberFormatException exception) 
       {
          JOptionPane.showMessageDialog(null, 
             "This application accepts digits only!");
          numerator = 999;
          denominator = 999;
          result = 1;
       }
       JOptionPane.showMessageDialog(null, numerator + " / " +
          denominator + "\nResult is " + result);
   }
}
