import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JPanelWithButton2 extends JPanel implements ActionListener
{
   JButton button = new JButton("Press me");
   int count = 0;
   public JPanelWithButton2()
   {
      add(button);
      button.addActionListener(this);
   }
   public void actionPerformed(ActionEvent e)
   {  
      ++count;
      repaint();
   }
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      g.drawString("The count is " + count, 20, 80);
   }
}