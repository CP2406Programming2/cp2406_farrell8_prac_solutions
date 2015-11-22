import javax.swing.*;
import java.awt.*;
public class JTwoButtons extends JFrame
{
   JButton button1 = new JButton("Enabled");
   JButton button2 = new JButton("Disabled");
   public JTwoButtons()
   {
      add(button1);  
      add(button2);
      button2.setEnabled(false);
      setLayout(new FlowLayout());
   }
   public static void main(String[] args)
   {
      JTwoButtons frame = new JTwoButtons();
      frame.setSize(150, 150);
      frame.setVisible(true);
   }
}