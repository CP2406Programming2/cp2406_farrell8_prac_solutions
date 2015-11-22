import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

public class JChangeSizeAndColorPanel2 extends JPanel implements ActionListener
{
   String phrase = new String("There's no place like home");
   int countClicks = 0;
   final int START_X = 10;
   int xPos = START_X;
   final int YPOS = 120;
   final int START_SIZE = 40;
   int size = START_SIZE;
   JButton aButton = new JButton("Click here");
   Font font;
   Color color;
   final int CHANGE = 8;
   final int MOVE_TO_RIGHT = 100;
   final int MAX_CLICKS = 3;
   public JChangeSizeAndColorPanel2()
   {
      setBackground(Color.WHITE);
      add(aButton);
      aButton.addActionListener(this);
   }
   @Override
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      font = new Font("Helvetica", Font.ITALIC, size);
      g.setFont(font);
      g.setColor(color);
      g.drawString(phrase, xPos, YPOS);
   }
   @Override      
   public void actionPerformed(ActionEvent e)
   {
      if(countClicks == 0)
         color = Color.BLUE; 
      else
         if(countClicks == 1)
            color = Color.RED;
         else
            if(countClicks == 2)
              color = Color.GREEN;
      countClicks++;
      size -= CHANGE;
      xPos += MOVE_TO_RIGHT;
      if(countClicks > MAX_CLICKS)
      {
          color = Color.BLACK;
          xPos = START_X;
          size = START_SIZE;
          countClicks = 0;
      }          
      repaint();
   }
   public static void main(String[] args)
   {
        JFrame frame = new JFrame();
        frame.add(new JChangeSizeAndColorPanel2());
        frame.setSize(600, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}