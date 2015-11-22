import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
public class MineField2 extends JFrame implements MouseListener, ActionListener
{
   final int ROWS = 4;
   final int COLS = 5;
   final int GAP = 8;
   final int NUM = (ROWS * COLS);
   // final int NUMTOWIN = NUM / 2;
   int numToWin = 0;
   JPanel bigPane = new JPanel(new BorderLayout());
   JPanel congratsPane = new JPanel(new FlowLayout());
   JPanel mainPane = new JPanel(new BorderLayout());
   JPanel pane = new JPanel(new GridLayout(ROWS, COLS, GAP, GAP));
   JPanel[] card = new JPanel[NUM];
   JPanel introPane = new JPanel(new FlowLayout());
   JLabel introLabel = new JLabel("Select a playing level");
   JButton easyButton = new JButton("Easy");
   JButton interButton = new JButton("Intermediate");
   JButton diffButton = new JButton("Difficult");
   int number;
   JLabel congratsLabel = new JLabel("");
   Font serifItalic = new Font("Serif", Font.ITALIC, 40);
   int clicks = 0;
   public MineField2()
   {
      super("Mine Field II");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      bigPane.add(congratsPane, BorderLayout.NORTH);
      congratsPane.add(congratsLabel);
      bigPane.add(pane, BorderLayout.CENTER);
      int x;
      congratsLabel.setFont(serifItalic);
      mainPane.add(introPane, BorderLayout.NORTH);
      mainPane.add(pane, BorderLayout.CENTER);
      mainPane.add(congratsPane, BorderLayout.SOUTH);
      introPane.add(introLabel);
      introPane.add(easyButton);
      introPane.add(interButton);
      introPane.add(diffButton);
      easyButton.addActionListener(this);
      interButton.addActionListener(this);
      diffButton.addActionListener(this);
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
      setContentPane(mainPane);
   }
   public static void main(String[] arguments)
   {
      MineField2 frame = new MineField2();
      frame.setSize(450,300);
      frame.setVisible(true);
   }
   @Override
   public void mouseClicked(MouseEvent mEvent)
   {
      if(numToWin != 0)
      {
         int x;
         Object source = mEvent.getSource();
         ++clicks;
         if(clicks == numToWin)
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
   @Override
   public void actionPerformed (ActionEvent aEvent)
   {
      Object source = aEvent.getSource();
      if(source == easyButton)
         numToWin = 5;
       else
          if(source == interButton)
              numToWin = 10;
          else
              numToWin = 15;
      easyButton.setEnabled(false);
      interButton.setEnabled(false);
      diffButton.setEnabled(false);
   }

}
