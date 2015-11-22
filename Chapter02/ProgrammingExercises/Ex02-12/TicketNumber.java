// TicketNumber.java
import javax.swing.JOptionPane;
public class TicketNumber
{
   public static void main(String[] args)
   {
      final int CHECKDIGIT = 7;
      String ticketString;
      int tickNum, newTickNum, lastDigit, remainder;
      boolean result;
      ticketString = JOptionPane.showInputDialog(null,
         "Enter 6-digit ticket number", "Ticket Number Dialog",
         JOptionPane.INFORMATION_MESSAGE);
      tickNum = Integer.parseInt(ticketString);
      lastDigit = tickNum % 10; // gets last digit;
      newTickNum = tickNum / 10; //removes last digit
      remainder = newTickNum % CHECKDIGIT;
      result = (remainder == lastDigit);       
      JOptionPane.showMessageDialog(null,"For ticket number " +
         tickNum + ", last digit is " + lastDigit +
         " and remainder is " + remainder + ",\nso result is " +
         result);
   }
}