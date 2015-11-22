import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JMouseActionFrame extends JFrame implements MouseListener
{
   private int x, y;
   private JLabel label= new JLabel("Do something with the mouse");
   String msg = "";

   public JMouseActionFrame()
   {
      setLayout(new FlowLayout());
      addMouseListener(this);
      add(label);
   }
   @Override
   public void mouseClicked(MouseEvent e)
   {
      int whichButton = e.getButton();
      msg = "You pressed mouse ";
      if(whichButton == MouseEvent.BUTTON1)
         msg += "button 1.";
      else if(whichButton == MouseEvent.BUTTON2)
         msg += "button 2.";
      else msg += "button 3.";
      msg += " You are at position " +
         e.getX() + ", " + e.getY() + ".";
      if(e.getClickCount() == 2)
         msg += " You double-clicked.";
      else
         msg += " You single-clicked.";
      label.setText(msg);
   }
   @Override
   public void mouseEntered(MouseEvent e)
   {
       msg = "You entered the frame.";
       label.setText(msg);
   }
   @Override
   public void mouseExited(MouseEvent e)
   {
       msg = "You exited the frame.";
       label.setText(msg);
   }
   @Override
   public void mousePressed(MouseEvent e)
   {
   }
   @Override
   public void mouseReleased(MouseEvent e)
   {
   }

   public static void main(String[] args)
   {
      JMouseActionFrame mFrame = new JMouseActionFrame();
      final int WIDTH = 600;
      final int HEIGHT = 100;
      mFrame.setSize(WIDTH, HEIGHT);
      mFrame.setVisible(true);
   }
}
