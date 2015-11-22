import java.awt.*;
import javax.swing.*;
public class JFrameDrawingDemo extends JFrame
{
   final int SIZE = 40;
   @Override
   public void paint(Graphics g)
   {
       super.paint(g);
       g.drawRect(50, 50, SIZE, SIZE);
       g.drawOval(80, 80, SIZE, SIZE);
       g.drawRect(110, 110, SIZE, SIZE);
   }
   public static void main(String[] args)
   {
       JFrameDrawingDemo frame = new JFrameDrawingDemo();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(170, 210);
       frame.setVisible(true);
   }
}
