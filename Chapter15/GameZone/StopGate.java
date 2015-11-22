import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
// Player moves horizontally
// Computer moves vertically
public class StopGate extends JFrame implements MouseListener
{
   final int ROWS = 8;
   final int COLS = 8;
   final int GAP = 0;
   final int NUM = (ROWS) * COLS;
   int x, r, c;
   JPanel mainPane = new JPanel(new BorderLayout());
   JPanel pane = new JPanel(new GridLayout(ROWS, COLS, GAP, GAP));
   JPanel[] panel = new JPanel[NUM];
   JPanel winPane = new JPanel(new FlowLayout());
   Color color1 = Color.WHITE;
   Color color2 = Color.LIGHT_GRAY;
   Color tempColor;
   Color PLAYERS_COLOR = Color.BLUE;
   Color COMPUTERS_COLOR = Color.BLACK;
   boolean[][] position = new boolean[ROWS][COLS];
   boolean isDone = false;
   JLabel winLabel = new JLabel("");
   String winString = "Game over.";
   public StopGate()
   {
      super("Stop Gate");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      mainPane.add(pane, BorderLayout.CENTER);
      winPane.add(winLabel);
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
      for(r = 0; r < ROWS; ++r)
         for(c = 0; c < COLS; ++c)
             position[r][c] = false;
   }
   public static void main(String[] arguments)
   {
      StopGate frame = new StopGate();
      frame.setSize(250, 250);
      frame.setVisible(true);
   }
   @Override
   public void mouseClicked(MouseEvent mEvent)
   {
       boolean moveIsOk = false;
       Object source = mEvent.getSource();
       for(x = 0; x < NUM; ++x)
       {
          if(source == panel[x])
          {
               moveIsOk = checkMoves('p', x);
               if(moveIsOk)
               {
                   panel[x].setBackground(PLAYERS_COLOR);
                   panel[x + 1].setBackground(PLAYERS_COLOR);
                   r = x / COLS;
                   c = x % COLS;
                   position[r][c] = true;
                   position[r][c + 1] = true;
               }
               x = NUM;
           }
               
       }
       if(moveIsOk)
       {
           isDone = checkForWinner('p');
           if(isDone)
           {
                displayWinner('p');
           }
           else
           {
                getComputersMove();
                isDone = checkForWinner('c');
                if(isDone)
                {
                    displayWinner('c');
                }
           }
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
   boolean checkMoves(char player, int x)
   {
       boolean ok = false;
       int r = x / COLS;
       int c = x % COLS;
       if(player == 'p')
       {
          if(c < (COLS - 1))
             if(position[r][c] == false && position[r][c + 1] == false)
                ok = true;
       }
       else
       {
           if(r < (ROWS - 1))
              if(position[r][c] == false && position[r + 1][c] == false)
                ok = true;
       }
       return ok;
   }
   boolean checkForWinner(char player)
   {
       boolean isDone = true;
       if(player == 'p')
       {
           for(r = 0; r < ROWS - 1; ++r)
              for(c = 0; c < COLS; ++c)
                if(position[r][c] == false &&
                    position[r + 1][c] == false)
                {
                     isDone = false;
                     r = ROWS;
                     c = COLS;
                }
        }
        else
        {
            for(r = 0; r < ROWS; ++r)
               for(c = 0; c < COLS - 1; ++c)
                  if(position[r][c] == false &&
                       position[r][c + 1] == false)
                  {
                     isDone = false;
                     r = ROWS;
                     c = COLS;
                  }
        }
        return isDone;       
   }
   public void getComputersMove()
   {
        int move = (int)(Math.random() * 100) % NUM;
        while(!checkMoves('c', move))
        {
            ++move;
            if(move == NUM)
                move = 0;
        }
        panel[move].setBackground(COMPUTERS_COLOR);
        panel[move + COLS].setBackground(COMPUTERS_COLOR);
        r = move / COLS;
        c = move % COLS;
        position[r][c] = true;
        position[r + 1][c] = true;
   }
   public void displayWinner(char winner)
   {
       if(winner == 'p')
          winString += " You win.";
       else
           winString += "You lose.";
       winLabel.setText(winString);
       setContentPane(winPane);
       invalidate();
       validate();  
   } 
}