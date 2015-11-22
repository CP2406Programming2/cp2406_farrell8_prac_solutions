import javax.swing.*;
public class TicTacToe
{
   public static void main(String[] args)
   {
      final int SIZE = 9;
      final int ROW_SIZE = 3;
      final int COL_SIZE = 3;
      int x, y;
      char[][] gameGrid =  new char[ROW_SIZE][COL_SIZE];
      gameGrid[0][0] = '1';
      gameGrid[0][1] = '2';
      gameGrid[0][2] = '3';
      gameGrid[1][0] = '4';
      gameGrid[1][1] = '5';
      gameGrid[1][2] = '6';
      gameGrid[2][0] = '7';
      gameGrid[2][1] = '8';
      gameGrid[2][2] = '9';
      int row = 0, col = 0;
      int num;
      boolean spotFound;
      boolean isDone = false;
      boolean playersTurn = true;
      String msg = "";
      String gridString;
      gridString = buildGridString(gameGrid);
      JOptionPane.showMessageDialog(null, "Welcome to Tic Tac Toe." +
           "\nYou will have X and the computer will have O");
      while(!isDone)
      {
        playersTurn = true;
        while(playersTurn)
        { 
          num = Integer.valueOf(JOptionPane.showInputDialog(null,
             msg + "\nEnter the position where you want to play" +
             gridString));
          if(num <= 3)
             row = 0;
          else
            if(num <= 6)
              row = 1;
            else
              row = 2;
          if(num % 3 == 1)
            col = 0;
          else
            if(num % 3 == 2)
              col = 1;
            else
              col = 2;
          if(!Character.isDigit(gameGrid[row][col]))
             msg = "That position is already taken\n";
          else
          {
             gameGrid[row][col] = 'X';
             msg = "";
             playersTurn = false;
          }
        }
        gridString = buildGridString(gameGrid);

        isDone = checkForWinner(gameGrid);
        msg = "";
        if(isDone)
        {
           msg = "\nCongratulations!";
        }
        else
           if(!spacesRemain(gameGrid))
           {
              isDone = true;
              msg = "\nTie game";
            }
        if(isDone)
          JOptionPane.showMessageDialog(null, "Game over!" + msg + gridString);
        else
        {
           JOptionPane.showMessageDialog(null, "Your move is recorded;\nnow the computer will play\n" +
           gridString);
           spotFound = false;
           while(!spotFound)
           {
             spotFound = true;
             num = (int)((Math.random() * 100) % SIZE);
             row = num /3;
             col = num % 3;
             if(!Character.isDigit(gameGrid[row][col]))
                spotFound = false;
           }
           gameGrid[row][col] = 'O';
           gridString = buildGridString(gameGrid);
           JOptionPane.showMessageDialog(null, "The computer has played\n" + gridString);
           isDone = checkForWinner(gameGrid);
           if(isDone)
            JOptionPane.showMessageDialog(null, "Sorry - you lose" );       
        }
         
     }
  }

  public static boolean checkForWinner(char [][] gameGrid)
  {
     boolean isDone = false;
     int x;
     for(x = 0; x < 3; ++x)
       if(gameGrid[x][0] == gameGrid[x][1] && gameGrid[x][0] == gameGrid[x][2])
            isDone = true;
     for(x = 0; x < 3; ++x)
       if(gameGrid[0][x] == gameGrid[1][x] && gameGrid[1][x] == gameGrid[2][x])
            isDone = true;
     if(gameGrid[0][0] == gameGrid[1][1] && gameGrid[0][0] == gameGrid[2][2])
            isDone = true;
     if(gameGrid[0][2] == gameGrid[1][1] && gameGrid[0][2] == gameGrid[2][0])
            isDone = true;
     return isDone;
  }
  public static String buildGridString(char[][] grid)
  {
      String msg = "\n";
      int x, y;
      for(x = 0; x < 3; ++x)
      {
        for(y = 0; y < 3; ++y)
        {
            msg = msg + grid[x][y] + "  ";
        }
        msg = msg + "\n";
        
      }
      return msg;
   }
   public static boolean spacesRemain(char grid[][])
   {
      int x, y;
      boolean stillDigitsLeft = false;
      for(x = 0; x < 3; ++x)
      {
        for(y = 0; y < 3; ++y)
        {
           if(Character.isDigit(grid[x][y]))
              stillDigitsLeft = true;
         }
       }
       return stillDigitsLeft;
  }
            
}
