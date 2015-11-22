import javax.swing.*;
import java.awt.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
public class DebugFifteen1 extends JFrame implements ActionListener
{
   JButton button1 = new JButton("Red");
   JButton button2 = new JButton("Pink");
   JButton button3 = new JButton("Orange");
   JButton button4 = new JButton("Yellow");
   JButton button5 = new JButton("Black");

   JPanel panel1 = new JPanel(new FlowLayout());
   JPanel panel2 = new JPanel();

   public DebugFifteen1()
   {
      setLayout(new GridLayout(1, 2));
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      add(panel1);
      add(panel2);
      panel1.add(button1);
      panel1.add(button1);
      panel1.add(button1);
      panel1.add(button1);
      panel1.add(button1);


      button1.addActionListener();
      button2.addActionListener();
      button3.addActionListener();
      button4.addActionListener();
      button5.addActionListener();
      setSize(400, 200);
      setVisible(true);
   }
   @Override
   public void actionPerformed(ActionEvent e)
   {
      Object source = e.getSource();
      if(source == button1)
         panel2.setBackground(Color.RED);
      else if(source  == button2)
         panel2.setBackground(Color.PINK);
      else if(source  == button3)
         panel2.setBackground(Color.ORANGE);
      else if(source  == button4)         
         panel2.setBackground(Color.YELLOW);
      else 
         panel2.setBackground(Color.YELLOW);
   }
   public static void main(String[] args)
   {
      DebugFifteen1 frame = new DebugFifteen1();
   }
}
