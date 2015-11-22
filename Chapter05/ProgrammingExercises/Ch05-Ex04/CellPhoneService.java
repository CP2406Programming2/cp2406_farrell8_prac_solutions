import javax.swing.*;
public class CellPhoneService
{
   public static void main (String args[])
   {
      int talk;
      int texts;
      int data;
      final int TALK_MIN = 500; 
      final int TEXTS_MIN = 100;
      final int DATA_MIN = 2;
      final int PRICEA = 49;
      final int PRICEB = 55;
      final int PRICEC = 61;
      final int PRICED = 70;
      final int PRICEE = 79;
      final int PRICEF = 87;
      String entry, message;
      int price;
      String plan;
      entry = JOptionPane.showInputDialog(null,
         "Enter talk minutes needed");
      talk = Integer.parseInt(entry);
      entry = JOptionPane.showInputDialog(null,
         "Enter text messages needed");
      texts = Integer.parseInt(entry);
      entry = JOptionPane.showInputDialog(null,
         "Enter gigabytes of data needed");
      data = Integer.parseInt(entry);
      if(data > 0)
         if(data <= DATA_MIN)
         {
            plan = "E";
            price = PRICEE;
         }
         else
         {
            plan = "F";
            price = PRICEF;
         }
      else
         if(talk < TALK_MIN)
            if(texts == 0 && data == 0)
            {
               plan = "A";
               price = PRICEA;
            }
            else
            {
               plan = "B";
               price = PRICEB;
            }
        else
            if(texts < TEXTS_MIN)
            {
                plan = "C";
                price = PRICEC;
            }
            else
            {
                plan = "D";
                price = PRICED ;
            }
      message = "Plan " + plan + "  $" + price + " per month";
      JOptionPane.showMessageDialog(null, message);
   }
}
    



