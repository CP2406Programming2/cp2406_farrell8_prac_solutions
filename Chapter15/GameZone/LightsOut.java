import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.Color;
public class LightsOut extends JFrame implements MouseListener
{
   final int ROWS = 5;
   final int COLS = 5;
   final int GAP = 2;
   final int NUM = ROWS * COLS;
   JPanel mainPane = new JPanel(new BorderLayout());
   JPanel pane = new JPanel(new GridLayout(ROWS, COLS, GAP, GAP));
   JPanel congratsPane = new JPanel();
   JPanel[] panel = new JPanel[NUM];
   int numToStart;
   int ranPanelPos;
   int count = 0;
   int clicks = 0;
   int[][] colors = new int[ROWS][COLS];
   int x, r, c;
   int selectedRow, selectedCol;
   JLabel congratsLabel =  new JLabel("");
   public LightsOut()
   {
      super("Lights Out");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      mainPane.add(pane, BorderLayout.CENTER);
      mainPane.add(congratsPane, BorderLayout.SOUTH);
      congratsPane.add(congratsLabel);
      for(x = 0; x < NUM; ++x)
      {
         panel[x] = new JPanel();
         pane.add(panel[x]);
         panel[x].setBackground(Color.BLUE);
         panel[x].addMouseListener(this);
      }
      for(r = 0; r < ROWS; ++r)
        for(c = 0; c < COLS; ++c)
          colors[r][c] = 1;
       setContentPane(mainPane);
       numToStart = 0;
       while(numToStart == 0)
       numToStart = ((int)(Math.random() * 100) % NUM);
       // This ensures the game won't
       // start with all squares already selected
      for(x = 0; x < numToStart; ++x)
      {
         ranPanelPos = ((int)(Math.random() * 100) % NUM);
         panel[ranPanelPos].setBackground(Color.WHITE);
         c = ranPanelPos % COLS;
         r = ranPanelPos / ROWS;
         colors[r][c] = 0;
      }
   }
   public static void main(String[] arguments)
   {
      LightsOut frame = new LightsOut();
      frame.setSize(450,300);
      frame.setVisible(true);
   }
   @Override
   public void mouseClicked(MouseEvent mEvent)
   {
      ++clicks;
      Object source = mEvent.getSource();
      for(x = 0; x < NUM; ++x)
      {
         if(source == panel[x])
         {
            ++count;
            selectedRow = x / ROWS;
            selectedCol = x % COLS;
            for(r = 0; r < ROWS; ++r)
               for(c = 0; c < COLS; ++c)
               {
                  if((r == selectedRow && c == selectedCol) ||
                     (r == selectedRow || c == selectedCol))
                  { 
                     if(colors[r][c] == 0)
                        colors[r][c] = 1;
                     else
                        colors[r][c] = 0;
                  }
               }
            for(r = 0; r < ROWS; ++r)
            for(c = 0; c < COLS; ++c)
               if(colors[r][c] == 0)
                  panel[r * COLS + c].setBackground(Color.WHITE);
               else
                  panel[r * COLS + c].setBackground(Color.BLUE);
            x = NUM;
         }
     }
     if(areAllBlue())
        congratsLabel.setText("*******Congratulations!*******");
   }

   public boolean areAllBlue()
   {
     boolean answer = true;
     for(r = 0; r < ROWS; ++r)
        for(c = 0; c < COLS; ++c)
           if(colors[r][c] == 0)
           {
              answer = false;
              c = COLS;
              r = ROWS;
           }
      return answer;
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
