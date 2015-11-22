import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.geom.*;

public class JStatePanel extends JPanel
{
   @Override
   public void paintComponent(Graphics gr)
   {
      super.paintComponent(gr);
      Graphics2D gr2D = (Graphics2D)gr;
      gr2D.drawString("Nevada",80,100);
      GeneralPath pol = new GeneralPath();
      pol.moveTo(20F,30F);
      pol.lineTo(150F,30F);
      pol.lineTo(150F,245F);
      pol.lineTo(80F,245F);
      pol.lineTo(10F,170F);
      pol.lineTo(10F,50F);
      pol.lineTo(20F,50F);
      pol.closePath();
      gr2D.draw(pol);
   }
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.add(new JStatePanel());
      frame.setSize(200, 300);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}