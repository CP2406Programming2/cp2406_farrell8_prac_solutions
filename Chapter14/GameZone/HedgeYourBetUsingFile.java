import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;
public class HedgeYourBetUsingFile extends JFrame implements ItemListener, ActionListener
{
   Path file =  Paths.get("C:\\Java\\Chapter.14\\Scores.txt");
   InputStream input = null;
   String s;
   final int QUESTIONS = 5;
   final int CHOICES = 3;
   final int CA = 0;
   final int FL = 1;
   final int NY = 2;
   FlowLayout flow = new FlowLayout();
   JLabel greeting = new JLabel("Quiz - choose 1, 2 or 3 answers");
   Font serifBold = new Font("Serif", Font.BOLD, 20);
   JCheckBox[] choice = new JCheckBox[CHOICES];
   JLabel[] label = new JLabel[CHOICES]; 
   JTextArea outArea = new JTextArea("");
   int x, y;
   String[] stateName = {"California", "Florida", "New York"};
   String[] question = 
    {"    Which state has the oldest cattle ranch in the U.S?",
      "                            Which state has a bear on its flag?",
      "                What state's state bird is the mockingbird?",
      "                   Which state's flower is the golden poppy?",
      "Which state has the highest number of \nlightening strikes per capita?"};
   int[] answers = {NY, CA, FL, CA, FL}; 
   int questionNum = 0;
   int numChosen;
   int prevScore = 0;
   JLabel scoreLabel = new JLabel("");
   JButton doneButton = new JButton("OK");
   boolean[] isChosen = new boolean[CHOICES];
   int points = 0;
   final int HIGHPOINTS = 5;
   final int MEDPOINTS = 2;
   final int LOWPOINTS = 1;
   String msg = new String("");
   final int HIGHMARK = 21;
   final int MEDMARK = 15;
   DataOutputStream ostream;
   DataInputStream istream;
   File scoreFile = new File("Scores.txt");
   public HedgeYourBetUsingFile()
   {
      super("Hedge Your Best");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JPanel pane = new JPanel();
      pane.setLayout(flow);
      pane.add(greeting);
      greeting.setFont(serifBold);
      pane.add(scoreLabel);
      outArea.setText(question[questionNum]);
      pane.add(outArea);
      for(x = 0; x < CHOICES; ++x)
      {
          choice[x] = new JCheckBox();
          label[x] = new JLabel("       " + stateName[x]);
          pane.add(label[x]);
          pane.add(choice[x]);
          choice[x].addItemListener(this);
      }
      setContentPane(pane);
      doneButton.addActionListener(this);
      pane.add(doneButton);
      try
      {
         input = Files.newInputStream(file);
         BufferedReader reader = new BufferedReader(new InputStreamReader(input));
         s = reader.readLine();
         prevScore = Integer.parseInt(s);
         input.close();
       }
       catch (IOException e)
       {
          System.out.println(e);
       }
      scoreLabel.setText("score on previous game was " + prevScore);
     
   }
   public static void main(String[] args)
   {
      HedgeYourBetUsingFile hFrame = new HedgeYourBetUsingFile();
      hFrame.setSize(340,300);
      hFrame.setVisible(true);
   }
   @Override
   public void itemStateChanged(ItemEvent check)
   {
      Object source = check.getItem();
      for(x= 0; x < CHOICES; ++x)
      {
               if(source == choice[x])
               {
	      int select = check.getStateChange();
	      if(select == ItemEvent.SELECTED)
                      isChosen[x] = true;
                  else
                      isChosen[x] = false;    
               }
      }
   }
   @Override
   public void actionPerformed(ActionEvent e)
   {
       //Object source = e.getSource();
       numChosen = 0;
       for(x = 0; x < CHOICES; ++x)
          if(isChosen[x])
                ++numChosen;
       if(isChosen[answers[questionNum]])
       {
            if(numChosen == 1)
               points += HIGHPOINTS;
            else
               if(numChosen == 2)
                   points += MEDPOINTS;
               else
                   if(numChosen == 3)
                           points += LOWPOINTS;
       }
       outArea.setText("\nPoints earned " + points);
       ++questionNum;
       if(questionNum == QUESTIONS)
       {
            outArea.append("\nGame over\n");
            doneButton.setEnabled(false);
            if(points > HIGHMARK)
                msg = "Fantastic!";
            else
                if(points >= MEDMARK)
                     msg = "Very good";
                else
                     msg = "OK";
            outArea.append(msg);
            if(points > prevScore)
               s = "" + points;
            else
               s = "" + points;
            byte data[] = s.getBytes();
            OutputStream output = null; 
            try
            {
                output = new BufferedOutputStream(Files.newOutputStream(file, WRITE, TRUNCATE_EXISTING));
                 output.write(data);
                output.flush();
                output.close();
            }
            catch(Exception ex)
            {
                 System.out.println("Message: " + ex);
            }
       }
       else
          outArea.append("\n" + question[questionNum]); 
   }
}
