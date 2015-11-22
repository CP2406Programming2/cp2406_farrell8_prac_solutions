import javax.swing.*; 
public class PhoneNumberFormat
{
   public static void main(String[] args) 
   {
      String inputString;
      String newString;
      final String QUIT = "999";
      final int VALID_LENGTH = 10;
      inputString = JOptionPane.showInputDialog(null,
         "Enter an area code and phone number" +
         "\nas a series of 10 digits" +
         "\nEnter " + QUIT + " to quit");
      while(!inputString.equals(QUIT))
      {
         if(inputString.length() != VALID_LENGTH)
            newString = "invalid";
         else
         {
            newString = "(" + inputString.substring(0,3) + ") " +
               inputString.substring(3,6) + "-" +
               inputString.substring(6, inputString.length());
         }
         inputString = JOptionPane.showInputDialog(null,
           "The number is " + newString + 
           "\n\nEnter an area code and phone number" +
           "\nas a series of 10 digits" +
           "\nand I will display it in a nice format" +
           "\nEnter " + QUIT + " to quit");
      
      }
   }
}