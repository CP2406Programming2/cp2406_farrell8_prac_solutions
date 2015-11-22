import javax.swing.*;
import java.awt.*;
public class JDemoFilledArcs extends JPanel
{
   @Override
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      g.fillArc(20, 50, 100, 100, 20, 320);
      g.fillArc(60, 50, 100, 100, 340, 40);
   }
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.add(new JDemoFilledArcs());
      frame.setSize(200, 200);
      frame.setVisible(true);
   }
}
