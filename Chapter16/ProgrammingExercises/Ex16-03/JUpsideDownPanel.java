import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

public class JUpsideDownPanel extends JPanel implements ActionListener
{
   String phrase = new String("There's no place like home");
   int count = 0;
   int xpos = 100;
   int ypos = 100;
   final int SIZE = 38;
   JButton aButton = new JButton("Click here");
   Font rightSideUpFont = new Font("Arial", Font.ITALIC, SIZE);
   Font upSideDownFont = new Font("Arial", Font.ITALIC, -SIZE);
   Font font = rightSideUpFont;
   int yUpSide = ypos - SIZE / 2;
   public JUpsideDownPanel()
   {
      setBackground(Color.WHITE);
      add(aButton);
      aButton.addActionListener(this);
   }
   @Override
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      g.setFont(font);
      g.drawString(phrase, xpos, ypos);
   }     
   @Override
   public void actionPerformed(ActionEvent e)
   {
      if(count % 2 == 1)
      {
         font = rightSideUpFont;
         xpos = 100;
         ypos = 100;
      }
      else
      {
         font = upSideDownFont;
         xpos = 500;
         ypos = yUpSide;
      }
      ++count;
      repaint();
   }
   public static void main(String[] args)
   {
        JFrame frame = new JFrame();
        frame.add(new JUpsideDownPanel());
        frame.setSize(600, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}