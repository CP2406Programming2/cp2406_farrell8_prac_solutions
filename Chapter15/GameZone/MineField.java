import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
public class MineField extends JFrame implements MouseListener
{
   final int ROWS = 4;
   final int COLS = 5;
   final int GAP = 8;
   final int NUM = (ROWS * COLS);
   final int NUMTOWIN = NUM / 2;
   JPanel bigPane = new JPanel(new BorderLayout());
   JPanel congratsPane = new JPanel(new FlowLayout());
   JPanel pane = new JPanel(new GridLayout(ROWS, COLS, GAP, GAP));
   JPanel[] card = new JPanel[NUM];
   int number;
   JLabel congratsLabel = new JLabel("");
   Font serifItalic = new Font("Serif", Font.ITALIC, 40);
   int clicks = 0;
   public MineField()
   {
      super("Mine Field");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      bigPane.add(congratsPane, BorderLayout.NORTH);
      congratsPane.add(congratsLabel);
      bigPane.add(pane, BorderLayout.CENTER);
      int x;
      congratsLabel.setFont(serifItalic);
    
      for(x = 0; x < NUM; ++x)
      {
         card[x] = new JPanel();
         card[x].setBackground(Color.WHITE);
         card[x].setLayout(new FlowLayout());
         pane.add(card[x]);
         card[x].setBackground(Color.BLUE);
         card[x].addMouseListener(this);
      }
      number = ((int)(Math.random() * 100) % (NUM));
      setContentPane(bigPane);
   }
   public static void main(String[] arguments)
   {
      MineField frame = new MineField();
      frame.setSize(350,300);
      frame.setVisible(true);
   }
   @Override
   public void mouseClicked(MouseEvent mEvent)
   {
      int x;
      Object source = mEvent.getSource();
      ++clicks;
      if(clicks == NUMTOWIN)
      {
         for(x = 0; x < NUM; ++x)
            pane.remove(card[x]);
         congratsLabel.setText("Congratulations!");
      }
      else
      {
         for(x = 0; x < NUM; ++x)
         {
            if(source == card[x])
            {
                card[x].setBackground(Color.WHITE);
                if(x == number)
                {
                   card[x].setBackground(Color.RED);
                   for(int a = 0; a < NUM; ++a)
                      if(a != number)
                         card[a].setBackground(Color.WHITE);
             
                }
                x = NUM;
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
}
