import javax.swing.*;
import java.awt.*;
public class JDemoLine extends JPanel 
{
   @Override
   public void paintComponent(Graphics pen)
   {
      super.paintComponent(pen);
      pen.drawLine(50, 50, 100, 200);
   }
   public static void main(String[] args)
   {
       JFrame frame = new JFrame();
       frame.setSize(150, 250);
       frame.setVisible(true);
       frame.add(new JDemoLine());
   }
}
