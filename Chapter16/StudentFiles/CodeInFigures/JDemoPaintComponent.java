import javax.swing.*;
import java.awt.*;
import java.awt.Color;
public class JDemoPaintComponent extends JFrame
{
   JColorPanel p1 = new JColorPanel(Color.RED);
   JColorPanel p2 = new JColorPanel(Color.BLUE);
   public JDemoPaintComponent()
   {
      setLayout(new BorderLayout());
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      getContentPane().setBackground(Color.YELLOW);
      add(p1, BorderLayout.EAST);
      add(p2, BorderLayout.SOUTH);
   }
   public static void main(String[] args)
   {
      JDemoPaintComponent frame = new JDemoPaintComponent();
      frame.setSize(150, 100);
      frame.setVisible(true);
   }
}

