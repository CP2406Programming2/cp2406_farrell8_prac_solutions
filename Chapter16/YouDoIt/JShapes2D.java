import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class JShapes2D extends JPanel
{
   public void paintComponent(Graphics gr)
   {
      super.paintComponent(gr);
      Graphics2D gr2D = (Graphics2D)gr;
      Rectangle2D.Float rect = 
         new Rectangle2D.Float(20F, 20F, 40F, 40F);
      Rectangle2D.Float rect2 = 
         new Rectangle2D.Float(20F, 70F, 40F, 40F);
      gr2D.draw(rect);
      gr2D.fill(rect2);
      Ellipse2D.Float ellipse = new Ellipse2D.Float(20F, 120F, 40F, 40F);
      Ellipse2D.Float ellipse2 = new Ellipse2D.Float(20F, 170F, 40F, 40F);
      gr2D.draw(ellipse);
      gr2D.fill(ellipse2);
      Arc2D.Float ac = new 
         Arc2D.Float(20F, 220F, 50F, 50F, 30F, 120F, Arc2D.PIE);
      Arc2D.Float ac2 = new 
         Arc2D.Float(20F, 270F, 50F, 50F, 30F, 120F, Arc2D.PIE);
      gr2D.draw(ac);
      gr2D.fill(ac2);  
      GeneralPath pol = new GeneralPath();
      pol.moveTo(20F, 300F);
      pol.lineTo(40F, 360F);
      pol.lineTo(100F, 380F);
      pol.closePath();
      gr2D.draw(pol);
   }
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.add(new JShapes2D());
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(100, 430);
      frame.setVisible(true);
   }
} 
