import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
public class SketchPad extends JPanel implements MouseListener, MouseMotionListener
{
   int xStart, yStart;
   int xStop, yStop;
   BasicStroke aStroke = new BasicStroke(5.0f,
      BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
   public SketchPad()
   {
      addMouseListener(this);
      addMouseMotionListener(this);
   }
   public void mousePressed(MouseEvent e)
   {
      xStart = e.getX();
      yStart = e.getY();
   }
   public void mouseDragged(MouseEvent e)
   {
      xStop = e.getX();
      yStop = e.getY();
      repaint();
      xStart = xStop;
      yStart = yStop;
   }   
   public void mouseClicked(MouseEvent e)
   {
   }
   public void mouseEntered(MouseEvent e)
   {
   }
   public void mouseExited(MouseEvent e)
   {
   }
   public void mouseReleased(MouseEvent e)
   {
   }
   public void mouseMoved(MouseEvent e)
   {
   }
   public void paintComponent(Graphics g)
   {
      Graphics2D gr2D = (Graphics2D)g;
      Line2D.Float line = new Line2D.Float((float)xStart, (float)yStart, (float)xStop, (float)yStop);
      gr2D.setStroke(aStroke);
      gr2D.draw(line);
   }
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.add(new SketchPad());
      frame.setSize(400, 400);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}