import javax.swing.*;
import java.awt.geom.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
public class JTicTacToe2 extends JPanel implements ActionListener
{
   JLabel greeting = new JLabel("Tic Tac Toe");
   JLabel promptLabel = new JLabel("Choose one button");
   JLabel result = new JLabel();
   Font headlineFont = new Font("Helvetica", Font.BOLD, 20);
   Font mediumFont = new Font("Helvetica", Font.BOLD, 14);
   final int SIZE = 9;
   final static int ROW_SIZE = 3;
   final static int COL_SIZE = 3;
   int x, y;
   JButton[][] gameGrid =  new JButton[ROW_SIZE][COL_SIZE];
   final static String BLANK = "  "; 
   final static String XString = "X";
   final static String OString = "O";
   int row = 0, col = 0;
   int num;
   boolean spotFound;
   boolean isDone = false;
   boolean playersTurn = true;
   boolean isWinPossible = false;
   String msg = "";
   String gridString;
   char winChar;
   public static boolean checkForWinner(JButton [][] gameGrid)
   {
       boolean isDone = false;
       int x;
       for(x = 0; x < 3; ++x)
       if(!gameGrid[x][0].getText().equals(BLANK))
         if(gameGrid[x][0].getText().equals(gameGrid[x][1].getText()) && 
           gameGrid[x][0].getText().equals(gameGrid[x][2].getText()))
             isDone = true;
       for(x = 0; x < 3; ++x)
         if(!gameGrid[0][x].getText().equals(BLANK))
           if(gameGrid[0][x].getText().equals(gameGrid[1][x].getText()) &&
             gameGrid[1][x].getText().equals(gameGrid[2][x].getText()))
               isDone = true;
       if(!gameGrid[0][0].getText().equals(BLANK))
         if(gameGrid[0][0].getText().equals(gameGrid[1][1].getText()) &&
            gameGrid[0][0].getText().equals(gameGrid[2][2].getText()))
              isDone = true;
       if(!gameGrid[0][2].getText().equals(BLANK))
         if(gameGrid[0][2].getText().equals(gameGrid[1][1].getText()) &&
           gameGrid[0][2].getText().equals(gameGrid[2][0].getText()))
            isDone = true;
       return isDone;
  }

   public static boolean spacesRemain(JButton[][] grid)
   {
      int x, y;
      boolean stillDigitsLeft = false;
      for(x = 0; x < ROW_SIZE; ++x)
      {
        for(y = 0; y < COL_SIZE; ++y)
           if(grid[x][y].getText().equals(BLANK))
              stillDigitsLeft = true;
     }
     return stillDigitsLeft;
  }
  public static void chooseSpot(JButton[][] gameGrid)
  {
     int x, y;
     boolean placementMade = false;
     for(x = 0; x < ROW_SIZE && !placementMade; ++x)
     {
        if(gameGrid[x][0].getText().equals(OString) &&
           gameGrid[x][1].getText().equals(OString) &&
            gameGrid[x][2].getText().equals(BLANK))
        {
            gameGrid[x][2].setText(OString);
            placementMade = true;
        }
        else
           if(gameGrid[x][0].getText().equals(OString) &&
             gameGrid[x][2].getText().equals(OString) &&
              gameGrid[x][1].getText().equals(BLANK))
           {
               gameGrid[x][1].setText(OString);
               placementMade = true;
           }
           else
             if(gameGrid[x][1].getText().equals(OString) &&
               gameGrid[x][2].getText().equals(OString) &&
                gameGrid[x][0].getText().equals(BLANK))
             {
                  gameGrid[x][0].setText(OString);
                  placementMade = true;
             }
      }
      for(y = 0; y < COL_SIZE && !placementMade; ++y)
      {
        if(gameGrid[0][y].getText().equals(OString) && gameGrid[1][y].getText().equals(OString) &&
           gameGrid[2][y].getText().equals(BLANK))
        {
            gameGrid[2][y].setText(OString);
            placementMade = true;
        }
        else
          if(gameGrid[0][y].getText().equals(OString) && gameGrid[2][y].getText().equals(OString) &&
              gameGrid[1][y].getText().equals(BLANK))
           {
               gameGrid[1][y].setText(OString);
               placementMade = true;
           }
           else
             if(gameGrid[1][y].getText().equals(OString) && gameGrid[2][y].getText().equals(OString) &&
                gameGrid[0][y].getText().equals(BLANK))
             {
                  gameGrid[0][y].setText(OString);
                  placementMade = true;
             }
      }
      if(!placementMade)
        if(gameGrid[0][0].getText().equals(OString) && gameGrid[1][1].getText().equals(OString) &&
             gameGrid[2][2].getText().equals(BLANK))
        {
           gameGrid[2][2].setText(OString);
           placementMade = true;
         }
         else
            if(gameGrid[0][0].getText().equals(OString) && gameGrid[2][2].getText().equals(OString) &&
                gameGrid[1][1].getText().equals(BLANK))
            {
              gameGrid[1][1].setText(OString);
              placementMade = true;
            }
            else
               if(gameGrid[2][2].getText().equals(OString) && gameGrid[1][1].getText().equals(OString) &&
                 gameGrid[0][0].getText().equals(BLANK))
               {
                  gameGrid[0][0].setText(OString);
                  placementMade = true;
               }
               else
                  if(gameGrid[0][2].getText().equals(OString) && gameGrid[1][1].getText().equals(OString) &&
                     gameGrid[2][0].getText().equals(BLANK))
                  {
                     gameGrid[2][0].setText(OString);
                     placementMade = true;
                  }
                  else
                    if(gameGrid[0][2].getText().equals(OString) && gameGrid[2][0].getText().equals(OString) &&
                      gameGrid[1][1].getText().equals(BLANK))
                    {
                      gameGrid[1][1].setText(OString);
                      placementMade = true;
                    }
                    else
                        if(gameGrid[1][1].getText().equals(OString) && gameGrid[2][0].getText().equals(OString) &&
                          gameGrid[0][2].getText().equals(BLANK))
                        {
                          gameGrid[0][2].setText(OString);
                          placementMade = true;
                        }
        if(!placementMade)
        {
              
           while(!placementMade)
           {
             placementMade = true;
             int num = (int)((Math.random() * 100) % 9);
             x = num / 3;
             y = num % 3;
             if(!gameGrid[x][y].getText().equals(BLANK))
                placementMade = false;
           }
           gameGrid[x][y].setText(OString);
         } 
   }

 
    public JTicTacToe2()
    {
       greeting.setFont(headlineFont);
       add(greeting);
       promptLabel.setFont(mediumFont);
       add(promptLabel);
       for(x = 0; x < ROW_SIZE; ++x)
        for(y = 0; y < COL_SIZE; ++y)
        {
           gameGrid[x][y] = new JButton();
           gameGrid[x][y].setText(BLANK);
           add(gameGrid[x][y]);
           gameGrid[x][y].addActionListener(this);
        }       
       add(result);
    }
   @Override
   public void actionPerformed(ActionEvent e)
   {
       isDone = false;
       Object squareChosen = e.getSource();
       for(x = 0; x < ROW_SIZE; ++x)
        for(y = 0; y < COL_SIZE; ++y)
           if(squareChosen == gameGrid[x][y])
           {
               row = x;
               col = y;
               x = ROW_SIZE;
               y = COL_SIZE;
           }
        
       if(gameGrid[row][col].getText().equals(XString) || gameGrid[row][col].getText().equals(OString))
       {
            msg = "That position is already taken\n";
       }
       else
       {
             gameGrid[row][col].setText(XString);
             msg = "";
             isDone = checkForWinner(gameGrid);
             
             msg = "";
             if(isDone)
             {
                msg = "You win! ";
                winChar = 'x';
             }
             else
               if(!spacesRemain(gameGrid))
               {
                  isDone = true;
                  msg = " Tie game";
                  winChar = 't';
               }
             if(isDone)
                   result.setText("Game over! " + msg);
             else
             {
               chooseSpot(gameGrid);
               isDone = checkForWinner(gameGrid);
               if(isDone)
               {
                 result.setText("Sorry - you lose");
                 winChar = 'o';
               }       
           }
           
      }
      if(isDone)
         repaint();
   }
   @Override
   public void paintComponent(Graphics gr)
   {
      super.paintComponent(gr);
      float startx = 30f;
      float starty = 210f;
      float width = 50f;
      float height = 50f;
      Graphics2D g = (Graphics2D)gr;
      BasicStroke aStroke = new BasicStroke(6.0f,
      BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
      g.setStroke(aStroke);
      g.setColor(Color.BLUE);
      if(winChar == 'x')
      {
        g.draw(new Line2D.Float(startx, starty, startx + width, starty + height));
        g.draw(new Line2D.Float(startx, starty + height, startx + width, starty));
      }
      else
       if(winChar == 'o')
       {
         g.draw(new Ellipse2D.Float(startx, starty, width, height));
       }
       else
         if(winChar == 't')
         {
           g.draw(new Line2D.Float(startx, starty, startx + width, starty + height));
           g.draw(new Line2D.Float(startx, starty + height, startx + width, starty));
           g.setColor(Color.RED);
           g.draw(new Ellipse2D.Float(startx, starty, width, height));
         }
   }
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.add(new JTicTacToe2());
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(180, 300);
      frame.setVisible(true);
   }
        
}
