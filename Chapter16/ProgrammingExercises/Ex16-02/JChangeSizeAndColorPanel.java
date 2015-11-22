import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

public class JChangeSizeAndColorPanel extends JPanel implements ActionListener
{
   String phrase = new String("There's no place like home");
   int countClicks = 0;
   int xPos = 10;
   final int YPOS = 120;
   int size = 40;
   JButton aButton = new JButton("Click here");
   Font font;
   Color color;
   final int CHANGE = 8;
   final int MOVE_TO_RIGHT = 100;
   final int MAX_CLICKS = 3;
   public JChangeSizeAndColorPanel()
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
      if(countClicks <= MAX_CLICKS)
         repaint();
   }
   public static void main(String[] args)
   {
        JFrame frame = new JFrame();
        frame.add(new JChangeSizeAndColorPanel());
        frame.setSize(600, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}