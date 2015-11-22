import javax.swing.*;
import java.awt.*;
import java.awt.Color;
public class JDemoOval extends JPanel
{
   @Override
   public void paintComponent(Graphics tool)
   {
      super.paintComponent(tool);
      tool.drawRect(50, 50, 100, 60);
      tool.drawOval(50, 50, 100, 60);

   }
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.add(new JDemoOval());
      frame.setSize(200, 180);
      frame.setVisible(true);
   }
}
