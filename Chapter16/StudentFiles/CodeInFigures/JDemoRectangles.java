import javax.swing.*;
import java.awt.*;
import java.awt.Color;
public class JDemoRectangles extends JPanel
{
   @Override
   public void paintComponent(Graphics gr)
   {
      super.paintComponent(gr);
      setBackground(Color.BLUE);
      gr.setColor(Color.RED);
      gr.fillRect(40, 40, 120, 120);
      gr.setColor(Color.YELLOW);
      gr.fillRect(80, 80, 160, 160);
      gr.clearRect(50, 60, 50, 50);
   }
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.add(new JDemoRectangles());
      frame.setSize(300, 300);
      frame.setVisible(true);
   }
}
