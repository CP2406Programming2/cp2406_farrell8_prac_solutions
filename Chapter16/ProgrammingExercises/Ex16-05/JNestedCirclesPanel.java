import javax.swing.*;
import java.awt.*;
public class JNestedCirclesPanel extends JPanel
{
   int count;
   final int NUM = 15;
   final int INC = 10;
   int x;
   int y;
   int width, height;
   @Override
   public void paintComponent(Graphics gr)
   {
      super.paintComponent(gr);
      x = 20;
      y = 40;
      width = 300;
      height = 300;
      for(count = 0; count < NUM; ++count)
      {
         gr.drawOval(x, y, width, height);
         x += INC;
         y += INC;
         width -= INC * 2;
         height -= INC * 2;
      }     
   }
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.add(new JNestedCirclesPanel());
      frame.setSize(400, 400);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}
