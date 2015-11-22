import javax.swing.*;
import java.awt.*;
public class JFontPanel extends JPanel
{
   Font fancyFont = new Font("Serif", Font.ITALIC, 40);
   @Override
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      g.setFont(fancyFont);
      g.drawString("Hello", 20, 80);
   }
}