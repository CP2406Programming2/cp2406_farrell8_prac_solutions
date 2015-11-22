import javax.swing.*;
import java.awt.*;
public class JDiagonalLinesPanel extends JPanel
{
   int startX;
   int startY;
   int endX;
   int endY;
   final int INC = 20;
   int width = 300, height = 300;
   @Override
   public void paintComponent(Graphics gr)
   {
     super.paintComponent(gr);
     startX= 40;
     startY = 40;
     endX = 40;
     endY = 40;
     gr.drawRect(startX, startY, width, height);
     int longestPoint = width + startX;
     while(startX < longestPoint)
     {
       gr.drawLine(startX, startY, endX, endY);
       startX += INC;
       endY += INC;
     }
     while(startY < longestPoint)
     {
       gr.drawLine(startX, startY, endX, endY);
       startY += INC;
       endX += INC;
     }    
   }
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.add(new JDiagonalLinesPanel());
      frame.setSize(400, 400);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}
