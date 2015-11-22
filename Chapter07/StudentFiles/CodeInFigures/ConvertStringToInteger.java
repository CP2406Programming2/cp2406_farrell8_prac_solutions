import javax.swing.JOptionPane;
public class ConvertStringToInteger
{
   public static void main(String[] args)
   {
      String stringHours;
      int hours;
      Integer integerHours;
      final double PAY_RATE = 12.25;
      stringHours = JOptionPane.showInputDialog(null,
        "How many hours did you work this week?");
      integerHours = Integer.valueOf(stringHours);
      hours = integerHours.intValue();
      JOptionPane.showMessageDialog(null, "You worked " +
         hours + " hours at $" + PAY_RATE + " per hour" +
         "\nThat's $" + (hours * PAY_RATE));
   }
}
