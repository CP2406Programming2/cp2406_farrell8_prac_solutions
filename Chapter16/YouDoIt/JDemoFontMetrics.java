import javax.swing.*;
import java.awt.*;
public class JDemoFontMetrics extends JPanel
{
   String movieQuote = 
      new String("Go ahead, make my day");
   Font courierItalic = new Font("Courier New", Font.ITALIC, 16),
       timesPlain = new Font("Times New Roman", Font.PLAIN, 16),
       scriptBold = new Font("Freestyle Script", Font.BOLD, 16);
   int ascent, descent, height, leading;
   int x, y; 
   @Override
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      x = 20;
      y = 30;
      g.setFont(courierItalic);
      displayMetrics(g);
      g.setFont(timesPlain);
      displayMetrics(g);
      g.setFont(scriptBold);
      displayMetrics(g);
   }
   public void displayMetrics(Graphics g)
   {
      leading = g.getFontMetrics().getLeading();
      ascent = g.getFontMetrics().getAscent();
      descent = g.getFontMetrics().getDescent();
      height = g.getFontMetrics().getHeight(); 
      g.drawString(movieQuote, x, y += height);
      g.drawString("Leading is " + leading, 
         x, y += height);
      g.drawString("Ascent is " + ascent, 
         x, y += height);
      g.drawString("Descent is " + descent, 
         x, y += height);
      g.drawString("Height is " + height,
         x, y += height);
      y += height * 2;
   }
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.add(new JDemoFontMetrics());
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(300, 460);
      frame.setVisible(true);
   }
}
