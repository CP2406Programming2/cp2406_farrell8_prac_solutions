import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

public class JFireworksPanel extends JPanel
{
   int x1Points[] = {42,52,72,52, 60,40, 15,28, 9,30,34,42};
   int y1Points[] = {38,62,68,80,105,85,102,75,58,36,44,38};
   int x2Points[] = {62,72,92,72,80,60,35,48,29,52,62};
   int y2Points[] = {48,72,78,90,115,95,112,85,68,40,48};

   @Override
   public void paintComponent(Graphics gr)
   {
     super.paintComponent(gr);
     setBackground(Color.WHITE);
     gr.setColor(Color.RED);
     gr.drawPolygon(x1Points, y1Points, x1Points.length);
     gr.setColor(Color.BLUE);
     gr.drawPolygon(x2Points, y2Points, x2Points.length);
     gr.setColor(Color.GREEN);
     gr.drawLine(80, 100, 150, 160);
     gr.drawLine(80, 40, 150, 30);
     gr.drawLine(80, 70, 150, 130);
     gr.drawLine(80, 60, 150, 100);
     gr.setColor(Color.RED);
     gr.drawLine(82, 105, 155, 165);
     gr.drawLine(82, 45, 155, 35);
     gr.drawLine(82, 75, 155, 135);
     gr.drawLine(82, 65, 155, 105);
   }
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.add(new JFireworksPanel());
      frame.setSize(200, 250);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}