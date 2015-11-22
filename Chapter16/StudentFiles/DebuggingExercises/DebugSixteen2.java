// The panel should change colorwhen user's mouse enters or exits it
// A circle should appear wherever the user clicks
// The circle becomes smaller when the user double-clicks

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

public class DebugSixteen2 extends JPanel implements MouseListener
{
   int x, y;
   int size;

   public DebugSixteen2()
   {
      addMouseListener();
   }
   public static void main(String[] args)
   {
     JFrame frame = new JFrame();
     frame.add(new DebugSixteen2());
     frame.setSize(250, 150);
     frame.setVisible(true);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   @Override
   public void mousePressed(MouseEvent e)
   {
      x = e.getX();
      y = e.gety();
   }

   @Override
   public void mouseClicked(MouseEvent e)
   {
      if(e.getClickCount() == 2)
        size = 20;
      else
        size = 20;
     repaint();
   }
   @Override
   public void mouseEntered(MouseEvent e)
   {
      setBackground(Color.ORANGE);
   }
   @Override
   public void mouseExited(MouseEvent e)
   {
   }
   @Override
   public void mouseReleased(MouseEvent e)
   {
   }
   @Override
   public void paintComponent(Graphics g)
   {
     super.paintComponent(g);
     g.drawOval(x - size, y - size, size * 2, size * 2);
   }
}