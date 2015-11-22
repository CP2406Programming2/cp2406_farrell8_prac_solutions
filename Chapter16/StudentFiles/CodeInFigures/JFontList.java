import javax.swing.*;
import java.awt.*;
import java.awt.Color;
public class JFontList extends JPanel
{
   int i, x, y;
   final int VERTICAL_SPACE = 10;
   final int HORIZONTAL_SPACE = 180;
   final int NUM_IN_COLUMN = 63;
   GraphicsEnvironment ge =
      GraphicsEnvironment.getLocalGraphicsEnvironment();
   String[] fontNames = ge.getAvailableFontFamilyNames(); 
   public JFontList()
   {
      setBackground(Color.WHITE);
   }
   @Override
   public void paintComponent(Graphics gr)
   {
      super.paintComponent(gr);
      x = 10;
      y = 20;
      gr.setFont(new Font("Arial", Font.PLAIN, 10));      
      for(i = 0; i < fontNames.length; ++i)
      {
         gr.drawString(fontNames[i], x, y);
         y += VERTICAL_SPACE;
         if(y > VERTICAL_SPACE * NUM_IN_COLUMN)
         {
            x += HORIZONTAL_SPACE;
            y = 20;
         }
      }
   }
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.add(new JFontList());
      frame.setSize(940, 680);
      frame.setVisible(true);
   }
}
