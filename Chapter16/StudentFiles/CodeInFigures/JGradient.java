import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.Color;
public class JGradient extends JPanel
{
   int x, y, x2, y2;
   @Override
   public void paintComponent(Graphics gr)
   {
      super.paintComponent(gr);
      x = 20;
      y = 40;
      x2 = 180;
      y2 = 100;
      Graphics2D gr2D = (Graphics2D)gr;
      gr2D.setPaint(new GradientPaint(x, y, Color.LIGHT_GRAY,
         x2, y2, Color.DARK_GRAY, false));
      gr2D.fill(new Rectangle2D.Double(x, y, x2, y2));
      x = 210;
      gr2D.setPaint(new GradientPaint(x, y, Color.LIGHT_GRAY,
         x2, y2, Color.DARK_GRAY, true));
      gr2D.fill(new Rectangle2D.Double(x, y, x2, y2));
   }
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.add(new JGradient());
      frame.setSize(440, 200);
      frame.setVisible(true);
   }
}
