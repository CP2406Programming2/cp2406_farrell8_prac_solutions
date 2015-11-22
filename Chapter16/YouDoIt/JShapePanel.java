import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
public class JShapePanel extends JPanel implements ActionListener
{
   JButton button = new JButton("Press me");
   Color color = Color.RED;
   String shape = "circle";
   int x = 0;
   int y = 0;
   int count = 0;
   final int SIZE = 40;
   final int INCREASE = 15;
   final int TIMES = 14;
   public JShapePanel()
   {
      setBackground(Color.WHITE);
      add(button);
      button.addActionListener(this);
   }
   @Override
   public void actionPerformed(ActionEvent e)
   {  
      ++count;
      if(count == TIMES)
      {
         x = 0;
         y = 0;
         count = 0;
      }
      if(shape.equals("circle"))
      {
         color = Color.BLUE;  
         shape = "rect";
      }
      else
      {
         shape = "circle";
         color = Color.RED;
      }
      x += INCREASE;
      y += INCREASE;
      repaint();
   }
   @Override
   public void paintComponent(Graphics g)
   {
      //super.paintComponent(g);
      g.setColor(color);
      if(shape.equals("circle"))
         g.fillOval(x, y, SIZE, SIZE);
      else
         g.fillRect(x, y, SIZE, SIZE);        
   }
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(new JShapePanel());
      frame.setSize(300, 300);
      frame.setVisible(true);
   }
}