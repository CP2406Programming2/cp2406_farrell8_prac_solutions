import javax.swing.*;
import java.awt.*;
public class JCardLayout extends JFrame
{
   private JButton nb = new JButton("North");
   private JButton sb = new JButton("South");
   private JButton eb = new JButton("East");
   private JButton wb = new JButton("West");
   private JButton cb = new JButton("Center");
   public JCardLayout()
   {
      setLayout(new CardLayout());
      add("north", nb);
      add("south", sb);
      add("east", eb);
      add("west", wb);
      add("center", cb);
      setSize(250, 250);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   public static void main(String[] ags)
   {
      JCardLayout jbl = new JCardLayout();
   }
}

