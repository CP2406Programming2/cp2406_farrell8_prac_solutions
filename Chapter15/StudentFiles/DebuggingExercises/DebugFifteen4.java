import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DebugFifteen4 extends JFrame
{
   JMenuBar mainBar = new JMenuBar();
   JMenu menu1 = new JMenu("File");
   JMenu menu2 = new JMenu("Symbols");
   JMenu menu3 = new JMenu("Cities");
   JMenuItem exit = new JMenuItem("Exit");
   JMenuItem animal = new JMenuItem("Animal");
   JMenuItem song = new JMenuItem("Song");
   JMenuItem flower = new JMenuItem("Flower");
   JMenuItem milwaukee = new JMenuItem("Milwaukee");
   JMenuItem madison = new JMenuItem("Madison");
   JLabel label1 = new JLabel(" Wisconsin Facts ");
   JLabel label2 = new JLabel();
   public DebugFifteen4()
   {
      setTitle("Facts about Wisconsin");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      setJMenuBar(mainBar);
      mainBar.add(menu1);
      mainBar.add(menu2);   
      mainBar.add(menu3);
      menu1.add(exit)
      menu2.add(animal);
      menu2.add(song);
      menu2.add(flower);
      menu3.add(Milwaukee);
      menu3.add(Madison);
      exit.addActionListener(this);
      animal.addActionListener(this);
      song.addActionListener(this);
      flowmer.addActionListener(this);
      milwalkee.addActionListener(this);
      madisin.addActionListener(this);
      add(label1);
      label1.setFont(new Font("Arial", Font.BOLD, 14));
      add(label2);
      label2.setFont(new Font("Arial", Font.PLAIN, 14));
   }
   @Override
   public void actionPerformed(ActionEvent e)
   {
      Object source = e.getSource();
      String text = "  ";
      if(source == exit)
        System.exit(0);
      else if(source == animal)
         text = "The state animal is badger";
      else if(source == song)
         text = "The state song is On Wisconsin!";
      else if(source == flower)
          text = "The state flower is wood violet";
      else if(source == milwaukee)
         text = "Milwaukee is the largest city";
      else
         text = "Madison is the capitol";
      label2.setText(text);
      repaint();
   }
 
   public static void main(String[] args)
   {
      DebugFifteen4 frame = new DebugFifteen4();
      final int WIDTH = 250;
      final int HEIGHT = 200;
      frame.setSize(WIDTH, HEIGHT);
      frame.setVisible(true);
   }
}
