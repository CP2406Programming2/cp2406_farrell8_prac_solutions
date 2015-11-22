import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JBookQuote extends JFrame
{
   FlowLayout flow = new FlowLayout();
   JLabel msg1 = new  JLabel("To begin with,");
   JLabel msg2 = new JLabel("Marley was dead.");
   public JBookQuote()
   {
      super("Book Quote");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(flow);
      add(msg1); 
      add(msg2);
   }
   public static void main(String[] args)
   {
     JBookQuote aFrame = new JBookQuote();
     aFrame.setSize(300, 150);
     aFrame.setVisible(true);
   }
}