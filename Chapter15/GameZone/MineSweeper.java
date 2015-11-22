import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
public class MineSweeper extends JFrame implements MouseListener
{
   final int ROWS = 4;
   final int COLS = 5;
   final int GAP = 1;
   final int NUM = (ROWS * COLS);
   final int NUMBOMBS = 4;
   final int NUMTOWIN = NUM - NUMBOMBS;
   final int BOMBCODE = 99;
   JPanel pane = new JPanel(new GridLayout(ROWS, COLS, GAP, GAP));
   JPanel[] card = new JPanel[NUM];
   JLabel[] label = new JLabel[NUM];
   int bombRow, bombCol;
   int saveRow = 999;
   int saveCol = 999;
   int r, c;
   int[][] grid = new int[ROWS][COLS];
   JLabel congratsLabel = new JLabel("Congratulations!");
   JLabel congratsLabel2 = new JLabel(NUMBOMBS + " bombs located");
   Font serifItalic = new Font("Serif", Font.ITALIC, 40);
   Font serifItalic20 = new Font("Serif", Font.ITALIC, 20);
   int clicks = 0;
   String bomb = new String("Bomb!");
   int numFound = 0;
   boolean gameLost = false;
   public MineSweeper()
   {
      super("Mine Sweeper");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      int x;
      congratsLabel.setFont(serifItalic);
      congratsLabel2.setFont(serifItalic20);
      for(r = 0; r < ROWS; ++ r)
         for(c = 0; c < COLS; ++c)
            grid[r][c] = 0;
      for(x = 0; x < NUM; ++x)
      {
        label[x] = new JLabel();
        label[x].setFont(serifItalic20);
        card[x] = new JPanel();
        card[x].setBackground(Color.YELLOW);
        card[x].setLayout(new FlowLayout());
        pane.add(card[x]);
        card[x].addMouseListener(this);
      }
      for(x = 0; x < NUMBOMBS; ++x)
      {
          bombRow = ((int)(Math.random() * 100) % ROWS);
          bombCol = ((int)(Math.random() * 100) % COLS);
          grid[bombRow][bombCol] = BOMBCODE;
          if(saveRow == bombRow && saveCol == bombCol)
            --x;
          saveRow = bombRow;
          saveCol = bombCol;
     }
     setUpGrid();
     setContentPane(pane);
  }
  public void setUpGrid()
  {
    for(r = 0; r < ROWS; ++ r)
       for(c = 0; c < COLS; ++c)
          if(grid[r][c] >= BOMBCODE)
          {
             if(r != 0)
             {
                int rowAbove = r - 1;
                if(c != 0) grid[rowAbove][c - 1]++;
                grid[rowAbove][c]++;
                if(c != COLS - 1) grid[rowAbove][c + 1]++;
             }
             // System.out.println(r + " " + c);
             // This statement useful when testing the game
             if(r != (ROWS - 1))
             {
                int rowBelow = r + 1;
                if(c != 0) grid[rowBelow][c - 1]++;
                grid[rowBelow][c]++;
                if(c != COLS - 1) grid[rowBelow][c + 1]++;
             }
             if(c != 0) grid[r][c - 1]++;
             if(c != COLS - 1) grid[r][c + 1]++;
          }
    for(r = 0; r < ROWS; ++ r)
       for(c = 0; c < COLS; ++c)
       {
          int sub = r * COLS + c;
          if(grid[r][c] <  BOMBCODE)
          {
            label[sub].setText("" + grid[r][c]);
            label[sub].setBackground(Color.WHITE);
          }
          else
           {
             label[sub].setText(bomb);
           }
        }
   }
          
           
  public static void main(String[] arguments)
  {
    MineSweeper frame = new MineSweeper();
    frame.setSize(250,200);
    frame.setVisible(true);
  }
   @Override
  public void mouseClicked(MouseEvent mEvent)
  {
    int x;
    Object source = mEvent.getSource();
   
    for(x = 0; x < NUM; ++x)
    {
       if(source == card[x])
       {

           card[x].add(label[x]);
           if(label[x].getText().equals(bomb))
           {
             card[x].setBackground(Color.RED);
             gameLost = true;
           }
           else
             card[x].setBackground(Color.WHITE);
           ++numFound;
           validate();
           x = NUM;
       }
    } 
    if(numFound == NUMTOWIN)
    {
       for(x = 0; x < NUM; ++x)
          pane.remove(card[x]);
       pane.setLayout(new FlowLayout());
       pane.add(congratsLabel);
       pane.add(congratsLabel2);
    }
    if(gameLost)
    {
        for(x = 0; x < NUM; ++x)
        {
           card[x].add(label[x]);
           if(label[x].getText().equals(bomb))
           {
             card[x].setBackground(Color.RED);
           }
           else
             card[x].setBackground(Color.WHITE);
       }
    } 

         
   validate();
   repaint();     
   
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
