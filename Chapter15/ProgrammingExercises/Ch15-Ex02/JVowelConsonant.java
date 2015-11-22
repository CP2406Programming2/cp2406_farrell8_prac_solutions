import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JVowelConsonant extends JFrame implements ActionListener
{
   Container con = null;
   final int LETTERS_AT_A_TIME = 8;
   JButton[] b = new JButton[LETTERS_AT_A_TIME];
   final String[] LETTERS = {"A", "B", "C", "D","E","F", "G", 
      "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
      "S", "T", "U", "V", "W", "X", "Y", "Z"};
   String[] vowles = {"A", "E", "I", "O", "U", "Y"};
   JPanel p1 = new JPanel();
   JPanel p2 = new JPanel();
   JPanel p3 = new JPanel();
   JLabel infoLabel = new JLabel("");
   boolean alreadyUsed;
   int x;
   int ran;
   int[] rans = {-1, -1, -1, -1, -1, -1, -1, -1};
   public JVowelConsonant()
   {
      for(x = 0; x < LETTERS_AT_A_TIME; ++x)
      {
          ran = (int)(Math.random() * LETTERS.length);
          rans[x] = ran;
      }
      setLayout(new GridLayout(2, 2));
      p1.setLayout(new GridLayout(2, 2));
      p2.setLayout(new GridLayout(2, 2));
      for(x = 0; x < LETTERS_AT_A_TIME; ++x)
         b[x] = new JButton(LETTERS[rans[x]]);
      for(x = 0; x < 4; ++x)
         p1.add(b[x]);
      for(; x < LETTERS_AT_A_TIME; ++x)
         p2.add(b[x]);
      p3.add(infoLabel);
      add(p1);
      add(p2);
      add(p3);
      for(x = 0; x < LETTERS_AT_A_TIME; ++x)
         b[x].addActionListener(this);
   }
   @Override
   public void actionPerformed(ActionEvent e)
   {
      Object source = e.getSource();
      for(x = 0; x < LETTERS_AT_A_TIME; ++x)
        if (source == b[x])
        {
           if(b[x].getText() == "A" || b[x].getText() == "E" ||
              b[x].getText() == "I" || b[x].getText() == "O" ||
              b[x].getText() == "U")
                 infoLabel.setText(b[x].getText() + " is a vowel");
           else
              infoLabel.setText(b[x].getText() + " is a consonant");
           ran = (int)(Math.random() * LETTERS.length);
           b[x].setText(LETTERS[ran]);
           x = LETTERS_AT_A_TIME;
        }
   }
   public static void main(String[] ags)
   {
       JVowelConsonant f = new JVowelConsonant();
       f.setSize(500, 500);
       f.setVisible(true);
   }
}