import javax.swing.*;
import java.awt.*;
import java.awt.Color;
public class JDemo3DRectangles extends JPanel
{
   public void paintComponent(Graphics gr)
   {
      super.paintComponent(gr);
      final int WIDTH = 60, HEIGHT = 80;
      gr.setColor(Color.PINK);
      gr.fill3DRect(20, 40, WIDTH, HEIGHT, true);
      gr.fill3DRect(100, 40, WIDTH, HEIGHT, false);
   }
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.add(new JDemo3DRectangles());
      frame.setSize(200, 180);
      frame.setVisible(true);
   }
}
