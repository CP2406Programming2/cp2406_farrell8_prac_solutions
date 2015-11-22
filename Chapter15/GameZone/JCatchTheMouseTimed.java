import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.time.*;
public class JCatchTheMouseTimed extends JFrame implements MouseListener
{
   LocalDateTime time1, time2;
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
   int startSecond, startMinute, stopSecond, stopMinute;
   final int SECONDS_IN_A_MINUTE = 60;
   public JCatchTheMouseTimed()
   {
      super("Catch The Mouse Timed");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      time1 = LocalDateTime.now();
      startSecond = time1.getSecond();
      startMinute = time1.getMinute();
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
      JCatchTheMouseTimed frame = new JCatchTheMouseTimed();
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
         time2 = LocalDateTime.now();
         String msg;
         stopSecond = time2.getSecond();
         stopMinute = time2.getMinute();
         // Following statement helps in testing
         // System.out.println(startMinute + " " + startSecond + " " + stopMinute + " " + stopSecond);
         if(startMinute == stopMinute)
            msg = (stopSecond - startSecond) + " seconds";
         else
            if((stopMinute - startMinute) == 1)
               msg = ((SECONDS_IN_A_MINUTE - startSecond) + stopSecond) + "seconds";
            else
               msg = (stopMinute - startMinute - 1) + " mintute(s) " + (SECONDS_IN_A_MINUTE - startSecond + stopSecond) + " seconds";
            
         JLabel doneLabel = new JLabel("Congratulations! You got all " + CHANCES + " in " + msg);
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
