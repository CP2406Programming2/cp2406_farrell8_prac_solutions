import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JAction extends JFrame implements ActionListener
{
   JLabel label = new JLabel("Enter your name");
   JTextField field = new JTextField(12);
   JButton button = new JButton("OK");
   public JAction()
   {
      super("Action");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      add(label);
      add(field);
      add(button);
      button.addActionListener(this);
      field.addActionListener(this);
   }
   @Override
   public void actionPerformed(ActionEvent e)
   {
      label.setText("Thank you");
      button.setText("Done");
   }
   public static void main(String[] args)
   {
     JAction aFrame = new JAction();
     final int WIDTH = 250;
     final int HEIGHT = 100;
     aFrame.setSize(WIDTH, HEIGHT);
     aFrame.setVisible(true);
   }
}
