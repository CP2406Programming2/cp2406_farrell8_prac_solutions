import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
public class CornerTheKing extends JFrame implements MouseListener
{
   final int ROWS = 8;
   final int COLS = 8;
   final int GAP = 2;
   final int NUM = ROWS * COLS;
   final int NORTH = 0;
   final int WEST = 2;
   int x;
   JPanel pane = new JPanel(new GridLayout(ROWS, COLS, GAP, GAP));
   JPanel[] panel = new JPanel[NUM];
   Color color1 = Color.WHITE;
   Color color2 = Color.BLUE;
   Color tempColor;
   boolean[][] position = new boolean[ROWS][COLS];
   int currentX, currentY;
   JLabel marker = new JLabel("O");
   JLabel winLabel = new JLabel("Game over");
   public CornerTheKing()
   {
      super("Checkerboard");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      for(x = 0; x < NUM; ++x)
      {
         panel[x] = new JPanel();
         pane.add(panel[x]);
         panel[x].addMouseListener(this);
         if(x % COLS == 0)
         {
            tempColor = color1;
            color1 = color2;
            color2 = tempColor;
         }
         if(x % 2 == 0)
            panel[x].setBackground(color1);
         else
            panel[x].setBackground(color2); 
      }
      setContentPane(pane);
      int ran = (int)(Math.random() * 100) % COLS;
      currentX = ROWS - 1;
      currentY = ran;
      x = (currentX * ROWS) + currentY;
      panel[x].add(marker);
      position[currentX][currentY] = true;
      validate();
   }
   public static void main(String[] arguments)
   {
      CornerTheKing frame = new CornerTheKing();
      frame.setSize(300, 300);
      frame.setVisible(true);
   }
   @Override
   public void mouseClicked(MouseEvent mEvent)
   {
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
      int r, c;
      boolean moveIsOk = false;
      Object source = mEvent.getSource();
      int oldPosition = (currentX * COLS) + currentY;
      for(x = 0; x < NUM; ++x)
      {
        if(source == panel[x])
        {
            r = x / COLS;
            c = x % COLS;
            if((r == currentX && (c == currentY - 1 || c == currentY - 2)) ||
                ((c == currentY && r == currentX - 1 || r == currentX - 2)))
                   moveIsOk = true;
            if(moveIsOk)
            {
               panel[oldPosition].remove(marker);
               position[currentX][currentY] = false;
               currentX = r;
               currentY = c;
               position[currentX][currentY] = true;
               panel[x].add(marker);
               validate();
               repaint();
               x = NUM;
            }
        }
      }
      if(moveIsOk)
      {
         if(currentX == 0 && currentY == 0)
         {
            finalMessage('p');
         }
         else
         {
            computersMove();
         }
      }
    }
    public void computersMove()
    {
       int r, c;
       int moveDirection = (int)(Math.random() * 100) % 2;
       int moveNumber = (int)(Math.random() * 100) % 2;
       int oldPosition = (currentX * COLS) + currentY;
       if(currentX == 0)
          moveDirection = WEST;
       if(currentY == 0)
          moveDirection = NORTH;
       if(currentX == 1)
          moveNumber = 0;
       if(currentY == 1)
          moveNumber = 0;
       ++moveNumber;
       panel[oldPosition].remove(marker);
       position[currentX][currentY] = false;
       if(moveDirection == NORTH)
          currentX = currentX - moveNumber;
       else
          currentY = currentY - moveNumber;
       position[currentX][currentY] = true;
       x = (currentX * COLS) + currentY;
       panel[x].add(marker);
       if(currentX == 0 && currentY == 0)
       {
          finalMessage('c');
       }
    }
    public void finalMessage(char winner)
    {
       final int START = 9;
       final int START2 = 24;
       String[] msgString = {"G", "A", "M", "E", "", "", "",
                             "", "O", "V", "E", "R"};
       String[] playerWins =   {"P", "L", "A", "Y", "E", "R"," "," ",
                             "W", "I", "N", "S"};
       String[] computerWins = {"C", "O", "M", "P", "U", "T","E","R",
                             "W", "I", "N", "S"};
       JLabel[] msg = new JLabel[msgString.length]; 
       JLabel[] msg2 = new JLabel[playerWins.length];    
       for(x = 0; x < msgString.length; ++x)
       {
          msg[x] = new JLabel();
          msg[x].setText(msgString[x]);
       }
       for(x = START; x < 21; ++x)
       {
          panel[x].add(msg[x - START]);
       }
       if(winner == 'p')
       { 
         for(x = 0; x < playerWins.length; ++x)
         {
            msg2[x] = new JLabel();
            msg2[x].setText(playerWins[x]);
         }
       }
       else
       {
          for(x = 0; x < computerWins.length; ++x)
          {
             msg2[x] = new JLabel();
             msg2[x].setText(computerWins[x]);
          } 
       } 
       for(x = START2; x < START2 + playerWins.length; ++x)
       {
          panel[x].add(msg2[x - START2]);
       }          
       validate();
       repaint();
   } 
}