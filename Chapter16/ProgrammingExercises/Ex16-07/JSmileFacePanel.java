import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
public class JSmileFacePanel extends JPanel
{
   @Override
   public void paintComponent(Graphics gr)
   {
      super.paintComponent(gr);
      gr.setColor(Color.YELLOW);
      gr.fillOval(50, 50, 100, 100);
      gr.setColor(Color.BLACK);
      gr.fillOval(80, 75, 10, 10);
      gr.fillOval(105, 75, 10, 10);
      gr.drawArc(75, 75, 50, 50, 200, 140); 
   }
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.add(new JSmileFacePanel());
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(200, 230);
      frame.setVisible(true);
   }
}