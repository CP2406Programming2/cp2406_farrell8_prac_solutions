import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.time.*;
public class JTargetPractice extends JFrame implements MouseListener
{
   final int ROWS = 10;
   final int COLS = 10;
   final int GAP = 2;
   final int NUM = ROWS * COLS;
   final int CHANCES = 20;
   final int ATONCE = 5;
   final int TIME = 10;
   JPanel pane = new JPanel(new GridLayout(ROWS, COLS, GAP, GAP));
   JPanel[] panel = new JPanel[NUM];
   JLabel[] label = new JLabel[ATONCE];
   int[] currentPanel = new int[ATONCE];
   int count = 0;
   int countHit = 0;
   LocalDateTime time1, time2;
   int seconds1, seconds2, minutes1, minutes2, difference;
   final int SECONDS_IN_MINUTE = 60;
   public JTargetPractice()
   {
      super("Target Practice");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      for(int x = 0; x < NUM; ++x)
      {
         panel[x] = new JPanel();
         pane.add(panel[x]);
         panel[x].addMouseListener(this);
      }
      setContentPane(pane);
      for(int y = 0; y < ATONCE; ++y)
      {
         label[y] = new JLabel("X");
         currentPanel[y] = ((int)(Math.random() * 100) % NUM);
         panel[currentPanel[y]].add(label[y]);
      }
      time1 = LocalDateTime.now();
      seconds1 = time1.getSecond();
      minutes1 = time1.getMinute();
      repaint();
   }
   public static void main(String[] arguments)
   {
      JTargetPractice frame = new JTargetPractice();
      frame.setSize(450,300);
      frame.setVisible(true);
   }
   @Override
   public void mouseClicked(MouseEvent mEvent)
   {
      Object source = mEvent.getSource();
      for(int x = 0; x < ATONCE; ++x)
      {
         if(source == panel[currentPanel[x]])
         {
            label[x].setText("BAM");
            ++count;
            ++countHit;
            if(countHit == ATONCE)
            {
               countHit = 0;
               for(int y = 0; y < ATONCE; ++y)
               {
                   panel[currentPanel[y]].remove(label[y]);
                   label[y].setText("X");
                   currentPanel[y] = ((int)(Math.random() * 100) % NUM);
                   panel[currentPanel[y]].add(label[y]);  
                   repaint();
               }
            }
            x = NUM; 
         }      
      }
      time2 = LocalDateTime.now();
      seconds2 = time2.getSecond();
      minutes2 = time2.getMinute();
      if(minutes1 == minutes2)
         difference = seconds2 - seconds1;
      else
         difference =
           SECONDS_IN_MINUTE - seconds1 + seconds2;
      if(difference >= TIME)
      {
         String msg;
         if(count == 0)
            msg = "Time's up! You didn't hit anything!";
         else
            msg = "Congratulations! You hit " +
               count + " targets";
         JLabel doneLabel = new JLabel(msg);
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
