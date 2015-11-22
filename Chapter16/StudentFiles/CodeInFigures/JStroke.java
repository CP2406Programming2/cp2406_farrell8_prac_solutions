import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class JStroke extends JPanel
{
   public void paintComponent(Graphics gr)
   {
      super.paintComponent(gr);
      Graphics2D gr2D = (Graphics2D)gr;
      BasicStroke aStroke = new BasicStroke(15.0f,
         BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
      gr2D.setStroke(aStroke);
      gr2D.draw(new Rectangle2D.Double(20, 20, 100, 100));
   }
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.add(new JStroke());
      frame.setSize(160, 180);
      frame.setVisible(true);
   }
}
