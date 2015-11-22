import javax.swing.*;
import java.awt.*;
import java.awt.Color;
public class JColorPanel extends JPanel
{
   int count = 0;
   String colorString;
   public JColorPanel(Color color)
   {
      if(color.equals(Color.RED))
         colorString = "red";
      else
         colorString = "blue";
      setBackground(color);
   }
   @Override
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      ++count;
      System.out.println("In paintComponent() method -- " +
         colorString + " " + count);
   }
}