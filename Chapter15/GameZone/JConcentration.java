import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
public class JConcentration extends JFrame implements MouseListener
{
   final int ROWS = 4;
   final int COLS = 5;
   final int GAP = 8;
   final int NUM = (ROWS * COLS);
   final int PAIRS = NUM / 2;
   final int DUMMY = 999;
   int pick;
   int number, number2;
   JPanel pane = new JPanel(new GridLayout(ROWS, COLS, GAP, GAP));
   JPanel[] card = new JPanel[NUM];
   JPanel firstCard = new JPanel();
   JPanel mostRecentlyClicked = new JPanel();
   JLabel congratsLabel = new JLabel("Congratulations!");
   Font serifItalic = new Font("Serif", Font.ITALIC, 40);
   JLabel[] label = new JLabel[NUM];
   int firstPick, secondPick;
   int firstNum, secondNum;
   int vals[] = new int[NUM];
   int clicks = 0;
   int matchesMade = 0;
   final int BIGNUM = 9999999;
   public JConcentration()
   {
      super("Concentration");
      int x, temp;
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      congratsLabel.setFont(serifItalic);
      for(x = 0, temp = 0; x < NUM; ++x, ++ temp)
      {
         vals[x] = temp;
         ++x;
         vals[x] = temp;
      }
      
      for(x = 0; x < NUM; ++x)
      {
         number = ((int)(Math.random() * 100) % (NUM));
         number2 = ((int)(Math.random() * 100) % (NUM));
         temp = vals[number];
         vals[number] = vals[number2];
         vals[number2] = temp;
      }   
      for(x = 0; x < NUM; ++x)
      {
         card[x] = new JPanel();
         label[x] = new JLabel();
         label[x].setFont(serifItalic);
         card[x].setLayout(new FlowLayout());
         label[x].setText("" + vals[x]);
         pane.add(card[x]);
         card[x].setBackground(Color.BLUE);
         card[x].addMouseListener(this);
      }
      setContentPane(pane);
   }
   public static void main(String[] arguments)
   {
      JConcentration frame = new JConcentration();
      frame.setSize(350,300);
      frame.setVisible(true);
   }
   @Override
   public void mouseClicked(MouseEvent mEvent)
   {
      ++clicks;
      Object source = mEvent.getSource();
      for(int x = 0; x < NUM; ++x)
      {
         if(source == card[x])
         {
            card[x].add(label[x]);
            card[x].setBackground(Color.YELLOW); 
            card[x].validate();
            if(clicks == 1)
            {
               firstPick = x;
               firstNum = vals[x];
            }
            else
            {
               secondPick = x;
               secondNum = vals[x];
            }
            mostRecentlyClicked = card[x];
            x = NUM;
         }
      }

      if(clicks == 2)
      {
          clicks = 0;    
      }
      if(matchesMade == PAIRS)
      {
          for(int a = 0; a < NUM; ++a)
             pane.remove(card[a]);
          pane.setLayout(new FlowLayout());
          pane.add(congratsLabel);
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
      Object source = mEvent.getSource();
      if(source == mostRecentlyClicked && source == card[secondPick])
      {
          if(clicks == 0 && firstNum == secondNum)
          {
             card[firstPick].setBackground(Color.WHITE);
             card[secondPick].setBackground(Color.WHITE);
             matchesMade++;
          }
          else
          {
             card[firstPick].setBackground(Color.BLUE);
             card[secondPick].setBackground(Color.BLUE);
          }
           card[firstPick].remove(label[firstPick]);
           card[secondPick].remove(label[secondPick]);
       }
      validate();
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
