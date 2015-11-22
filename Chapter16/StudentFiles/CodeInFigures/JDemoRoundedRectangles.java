import javax.swing.*;
import java.awt.*;
public class JDemoRoundedRectangles extends JPanel
{
   @Override
   public void paintComponent(Graphics gr)
   {
      super.paintComponent(gr);
      int x = 20;
      int y = 40;
      final int WIDTH = 80, HEIGHT = 80;
      final int ARC_INCREASE = 20;
      final int HORIZONTAL_GAP = 100;
      for(int size = x; size <= HEIGHT; size += ARC_INCREASE)
      {
         gr.drawRoundRect(x, y, WIDTH, HEIGHT, size, size);
         x += HORIZONTAL_GAP;
      }
   }
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.add(new JDemoRoundedRectangles());
      frame.setSize(430, 180);
      frame.setVisible(true);
   }
}
