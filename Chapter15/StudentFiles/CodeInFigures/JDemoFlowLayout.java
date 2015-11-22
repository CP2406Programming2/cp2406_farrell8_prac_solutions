import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JDemoFlowLayout extends JFrame implements ActionListener
{
   private JButton leftButton = new JButton("L Button");
   private JButton rightButton = new JButton("R Button");
   private Container con = getContentPane();
   private FlowLayout layout = new FlowLayout();
   public JDemoFlowLayout()
   {
      con.setLayout(layout);
      con.add(leftButton);
      con.add(rightButton);
      leftButton.addActionListener(this);
      rightButton.addActionListener(this);
      setSize(500, 100);
   }
   @Override
   public void actionPerformed(ActionEvent event)
   {
      Object source = event.getSource();
      if(source == leftButton)
         layout.setAlignment(FlowLayout.LEFT);
      else
         layout.setAlignment(FlowLayout.RIGHT);
      con.invalidate();
      con.validate();
   }
   public static void main(String[] args)
   {
      JDemoFlowLayout frame = new JDemoFlowLayout();
      frame.setVisible(true);
   }
}
