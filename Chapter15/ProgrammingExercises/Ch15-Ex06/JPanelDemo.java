import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
public class JPanelDemo extends JFrame
{
   Container con = null;
   JFlexiblePanel p1 = new JFlexiblePanel(Color.ORANGE, Color.BLACK,
        new Font("Arial", Font.PLAIN, 20), "Test 1");
   JFlexiblePanel p2 = new JFlexiblePanel(Color.GRAY, Color.RED,
        new Font("Courier", Font.BOLD, 11), "Test 2");
   JFlexiblePanel p3 = new JFlexiblePanel(Color.YELLOW, Color.GREEN,
         new Font("Helvetica", Font.ITALIC, 18), "Test 3");
   JFlexiblePanel p4 = new JFlexiblePanel(Color.BLUE, Color.WHITE,
         new Font("Algerian", Font.PLAIN, 24), "Test 4");

   public JPanelDemo()
   {
      con = this.getContentPane();
      con.setLayout(new GridLayout(2,2));
      con.add(p1);
      con.add(p2);
      con.add(p3);
      con.add(p4);
      setSize(250, 250);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   public static void main(String[] args)
   {
      JPanelDemo app = new JPanelDemo();
      app.setVisible(true);
      app.setSize(240, 240);
   }
}
   

