import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JCardLayout2 extends JFrame implements ActionListener
{
   private JButton nb = new JButton("North");
   private JButton sb = new JButton("South");
   private JButton eb = new JButton("East");
   private JButton wb = new JButton("West");
   private JButton cb = new JButton("Center");
   CardLayout cardLayout = new CardLayout();
   public JCardLayout2()
   {
      setLayout(cardLayout);
      add("north", nb);
      add("south", sb);
      add("east", eb);
      add("west", wb);
      add("center", cb);
      setSize(250, 250);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      nb.addActionListener(this);
      sb.addActionListener(this);
      eb.addActionListener(this);
      wb.addActionListener(this);
      cb.addActionListener(this);
   }
   @Override
   public void actionPerformed(ActionEvent e)
   {
      cardLayout.next(getContentPane());
   }
   public static void main(String[] ags)
   {
      JCardLayout2 jbl = new JCardLayout2();
   }
}

