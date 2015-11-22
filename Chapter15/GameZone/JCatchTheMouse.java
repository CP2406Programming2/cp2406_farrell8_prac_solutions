import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JCatchTheMouse extends JFrame implements MouseListener
{
   final int ROWS = 8;
   final int COLS = 6;
   final int GAP = 2;
   final int NUM = ROWS * COLS;
   final int CHANCES = 10;
   JPanel pane = new JPanel(new GridLayout(ROWS, COLS, GAP, GAP));
   JPanel[] panel = new JPanel[NUM];
   JLabel label = new JLabel("X");
   int currentPanel;
   int count = 0;
   int clicks = 0;
   public JCatchTheMouse()
   {
     super("Catch The Mouse");
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
     for(int x = 0; x < NUM; ++x)
     {
       panel[x] = new JPanel();
       pane.add(panel[x]);
       panel[x].addMouseListener(this);
     }
     setContentPane(pane);
     currentPanel = ((int)(Math.random() * 100) % NUM);
     panel[currentPanel].add(label);
   }
   public static void main(String[] arguments)
   {
      JCatchTheMouse frame = new JCatchTheMouse();
      frame.setSize(450,300);
      frame.setVisible(true);
   }
   @Override
   public void mouseClicked(MouseEvent mEvent)
   {
      ++clicks;
      Object source = mEvent.getSource();
      if(source == panel[currentPanel])
      {
         ++count;
         panel[currentPanel].remove(label);
         currentPanel = ((int)(Math.random() * 100) % NUM);
         panel[currentPanel].add(label);  
         repaint();      
      }
    
     if(count >= CHANCES)
     {
       JLabel doneLabel = new JLabel("Congratulations! Hit rate is " +
           (count * 100 / clicks) + "%");
       for(int x = 0; x < NUM; ++x)
          pane.remove(panel[x]);
       pane.setLayout(new FlowLayout());
       pane.add(doneLabel);
       validate();
       repaint();
    }
   
  }
   @Override
   public void mouseEntered(MouseEvent mEvent)
   {
   }
   @Override
   public void mouseExited(MouseEvent mEvent)
   {
   }
   @Override
   public void mousePressed(MouseEvent mEvent)
   {
   }
   @Override
   public void mouseReleased(MouseEvent mEvent)
   {
   }
}
