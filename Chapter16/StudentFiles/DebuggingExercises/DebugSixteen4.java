// This program shows a customer
// what a shirt looks like in different colors
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
public class DebugSixteen4 extends JPanel implements ActionListener
{
   JLabel header = new JLabel("Outfit planner);
   JButton changeButton = new JButton("Change clothes");
   int counter = 0;
   int xTop[] = { 20, 40, 50, 60, 80, 75, 62, 66, 40, 38, 25, 20};
   int yTop[] = {142,130,138,130,138,148,142,160,160,142,148,142};
   Color[] colors = {Color.RED, Color.PINK, Color.YELLOW, Color.GREEN, Color.CYAN};
   Font font = new Font("Arial", Font.BOLD, 14);
   final double price = 39.95;
   final int X = 100;
   int y = 80;
   final int GAP = 20;
   int cycle = 0;
   public DebugSixteen4()
   {
      setBackground(Color.WHITE);
      add(header);
      add(changeButton);
      changeButton.addActionListener(this);
   }
   @Override
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      ++counter;
      g.setFont(font);
      g.setColor(colors[cycle]);
      g.fillPolygon(xTop, yTop, 12);
      g.setColor(Color.BLACK);
      g.drawString("Just look at the colors", X, y);
      g.drawString("in which you can buy", X, y += GAP);
      g.drawString("this beautiful shirt", X, y += GAP);
      g.drawString("Only $" + PRICE, X, y += GAP);
   }
   @Override
   public void actionPerformed(ActionEvent e)
   {
      cycle = counter % colors.length;
      repaint();
   }
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.add(new DebugSixteen4());
      frame.setSize(350, 240);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}