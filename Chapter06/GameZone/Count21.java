import javax.swing.JOptionPane;
public class Count21
{
   public static void main(String[] args)
   {
      int player;
      int computer;
      String msg;
      int total = 0;
      final int FACTOR = 4;
      final int HIGH = 3;
      final int LOSING_VAL = 21; 
      final String inputMsg = "\nInput a number between 1 and " + HIGH;
      player = Integer.parseInt(JOptionPane.showInputDialog(null, inputMsg));
      while(player < 1 || player > HIGH)
         player = Integer.parseInt(JOptionPane.showInputDialog(null,
          "Number must be between 1 and " + HIGH + "\nPlease reenter"));
      total += player;
      while(total < LOSING_VAL)
      {
         msg = "You entered " + player + " bringing the total to " + total;
         if(player == 1)
            computer = 3;
         else
            if(player == 2)
              computer = 2;
            else
               computer = 1;
        total += computer;
        msg += "\nComputer adds " + computer + " bringing total to " + total;
        msg += inputMsg;
        player = Integer.parseInt(JOptionPane.showInputDialog(null, msg));
        while(player < 1 || player > HIGH)
            player = Integer.parseInt(JOptionPane.showInputDialog(null,
            "Number must be between 1 and " + HIGH + "\nPlease reenter"));
        total += player;
      }
      JOptionPane.showMessageDialog(null,"You brought the total to " + total +
          "\nSorry - you lose.");
   }
}
