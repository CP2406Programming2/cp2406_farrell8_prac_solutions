import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
public class JSmileFacePanel2 extends JPanel implements ActionListener
{
   JButton button = new JButton("Change mood");
   int count = 0;
   boolean isHappy = true;
   public JSmileFacePanel2()
   {
      add(button);
      button.addActionListener(this);
   }
   @Override
   public void actionPerformed(ActionEvent e)
   {
      if(count % 2 == 0)
         isHappy = false;
      else
         isHappy = true;
      ++count;
      repaint();
   }
   @Override      
   public void paintComponent(Graphics gr)
   {
      super.paintComponent(gr);
      gr.setColor(Color.YELLOW);
      gr.fillOval(50, 50, 100, 100);
      gr.setColor(Color.BLACK);
      gr.fillOval(80, 75, 10, 10);
      gr.fillOval(105, 75, 10, 10);
      if(isHappy)
         gr.drawArc(75, 75, 50, 50, 200, 140);
      else
         gr.drawArc(75, 100, 50, 50, 20, 140);
   }
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.add(new JSmileFacePanel2());
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(200, 230);
      frame.setVisible(true);
   }
}