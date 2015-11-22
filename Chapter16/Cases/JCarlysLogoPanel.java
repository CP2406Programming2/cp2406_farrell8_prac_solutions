import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
public class JCarlysLogoPanel extends JPanel
{
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      g.setFont(new Font("Algerian", Font.ITALIC, 28));
      g.setColor(Color.YELLOW);
      g.fillOval(5, 5, 40, 40);
      g.setColor(Color.BLUE);
      g.fillOval(15, 5, 40, 40);
      g.setColor(Color.RED);
      g.fillOval(30, 5, 40, 40);
      g.setColor(Color.YELLOW);
      g.drawString("Carly's Catering", 50, 30);
   }
}
