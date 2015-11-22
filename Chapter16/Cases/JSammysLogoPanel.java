import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public class JSammysLogoPanel extends JPanel
{
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      final int NUMWAVES = 7;
      int pos = 10;
      setBackground(Color.PINK);
      g.setFont(new Font("Juice ITC", Font.BOLD, 38));
      g.setColor(Color.BLUE);
      g.drawString("Sammy's Seashore", 20, 50);
      for(int x = 0; x < NUMWAVES; ++x, pos += 26)
         g.fillArc(pos, 80, 100, 50, 0, 80);
   }
}
