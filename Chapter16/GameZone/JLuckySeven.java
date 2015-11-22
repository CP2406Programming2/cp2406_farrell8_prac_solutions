import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JLuckySeven extends JPanel implements ActionListener
{
    final int NUM = 7;
    JLabel greeting = new JLabel("Lucky Seven Game");
    JLabel promptLabel = new JLabel("  Choose one button     ");
    Font headlineFont = new Font("Arial", Font.BOLD, 30);
    Font mediumFont = new Font("Arial", Font.BOLD, 18);
    JButton[] button = new JButton[NUM];
    String[] label = new String[NUM];
    int[] value = {1, 2, 3, 4, 5, 6, 7};
    int[] randomVal = new int[NUM];
    JLabel result1 = new JLabel("");
    JLabel result2 = new JLabel("");
    int random;
    int x, pos;
    int buttonVal;
    int nextButtonPosition;
    int hiddenVal;
    int count = 1;
    boolean[] isUsed = new boolean[NUM];
    public JLuckySeven()
    {
       greeting.setFont(headlineFont);
       promptLabel.setFont(mediumFont);
       result1.setFont(mediumFont);
       result2.setFont(mediumFont);
       add(greeting);
       add(promptLabel);
       for(x = 0; x < NUM; ++x)
       {
          button[x] = new JButton("" + value[x]);
          add(button[x]);
          button[x].addActionListener(this);
       }
             
       add(result1);
       add(result2);
       int y = 0;
       int numbersLeft = NUM;  
       boolean found = false;  
       for(x = 0; x < NUM; ++x)
       {
          found = false;
          while(!found)
          {
             random = (int) ((Math.random() * 100) % NUM) + 1;
             for(y = 0; y < numbersLeft; ++y)
             {
                if(random == value[y])
                {
                   randomVal[x] = random;
                   pos = y;
                   found = true;
                   y = numbersLeft;
                }
             }
          }
          for(y = pos; y < numbersLeft - 1; ++y)
          {
             value[y] = value[y + 1];
          }
          --numbersLeft;
        }  
                                      
    }
   @Override
   public void actionPerformed(ActionEvent e)
   {
      int pos;
      JButton temp = temp = (JButton)e.getSource();
      buttonVal = Integer.parseInt(temp.getText());
      pos = buttonVal - 1;
   
      if(count == 1)
      {
         nextButtonPosition = pos;
      }
      if(pos == nextButtonPosition)
      {
          hiddenVal = randomVal[pos];
          result1.setText("The hidden number is " + hiddenVal + ".");
          
          if(buttonVal == hiddenVal || isUsed[hiddenVal - 1])
          {
             result2.setText("Sorry, you lose.");
             remove(promptLabel);
             for(x = 0; x < NUM; ++x)
             {
               isUsed[x] = true;
               button[x].setEnabled(false);
               remove(button[x]);
             }
          }
          else
          {          
            remove(button[pos]);
            isUsed[pos] = true;
            nextButtonPosition = hiddenVal - 1;
            ++count;
          }
      }
      if(count == NUM)
      {
         result2.setText("Congratulations - you got them all!");  
         remove(button[pos]);
         remove(promptLabel);
         for(x = 0; x < NUM; ++x)
         {
             isUsed[x] = true;
             button[x].setEnabled(false);
         }
      }
      repaint();
    }
    public static void main(String[] args)
    {
      JFrame frame = new JFrame();
      frame.add(new JLuckySeven());
      frame.setSize(400, 200);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
