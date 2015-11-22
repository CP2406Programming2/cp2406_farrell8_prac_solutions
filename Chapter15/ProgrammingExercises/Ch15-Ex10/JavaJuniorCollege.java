import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JavaJuniorCollege extends JFrame implements ActionListener
{
   JMenuBar mainBar = new JMenuBar();
   JMenu menu1 = new JMenu("File");
   JMenu menu2 = new JMenu("Campuses");
   JMenu menu3 = new JMenu("Degrees");
   JMenu menu4 = new JMenu("Majors");
   JMenuItem exit = new JMenuItem("Exit");
   JMenuItem east = new JMenuItem("East");
   JMenuItem south = new JMenuItem("South");
   JMenuItem acctng = new JMenuItem("Accounting");
   JMenuItem cis = new JMenuItem("Computer Information Systems");
   JMenuItem mktg = new JMenuItem("Marketing");
   JMenuItem bsbl = new JMenuItem("Baseball team");
   JMenuItem debate = new JMenuItem("Debate club");
   JMenuItem yp = new JMenuItem("Young Politicians");
   JLabel label1 = new JLabel("    Java Junior College    ");
   JLabel lineLabel = new JLabel("------------------------------");
   JLabel label2 = new JLabel();
   public JavaJuniorCollege()
   {
      setTitle("Summervale Resort");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      setJMenuBar(mainBar);
      mainBar.add(menu1);
      mainBar.add(menu2);   
      mainBar.add(menu3);
      mainBar.add(menu4);
      menu1.add(exit);
      menu2.add(east);
      menu2.add(south);
      menu3.add(acctng);
      menu3.add(cis);
      menu3.add(mktg);
      menu4.add(bsbl);
      menu4.add(debate);
      menu4.add(yp);
      exit.addActionListener(this);
      east.addActionListener(this);
      south.addActionListener(this);
      acctng.addActionListener(this);
      cis.addActionListener(this);
      mktg.addActionListener(this);
      bsbl.addActionListener(this);
      debate.addActionListener(this);
      yp.addActionListener(this);
      add(label1);
      label1.setFont(new Font("Arial", Font.BOLD, 16));
      lineLabel.setFont(new Font("Arial", Font.BOLD, 20));
      add(lineLabel);
      add(label2);
      label2.setFont(new Font("Arial", Font.ITALIC, 16));
   }
   @Override
   public void actionPerformed(ActionEvent e)
   {
       Object source = e.getSource();
       String text = "  ";
       if(source == exit)
         System.exit(0);
       else if(source == south)
          text = "South campus on the banks of a beautiful river";
       else if(source == east)
          text = "East campus convenient to downtown";
       else if(source == acctng)
           text = "Accounting classes taught by CPAs";
       else if(source == cis)
          text = "CIS classes include Java and C#";
       else  if(source == mktg)
          text = "Marketing classes with real-world experience";
       else  if(source == bsbl)
          text = "Our baseball tam is the division champ";
       else  if(source == debate)
          text = "Debate team hones your speaking skills";
       else  
          text = "Young politicians are active in local issues";
       label2.setText(text);
   }
 
  public static void main(String[] args)
  {
    JavaJuniorCollege frame = new JavaJuniorCollege();
    final int WIDTH = 400;
    final int HEIGHT = 150;
    frame.setSize(WIDTH, HEIGHT);
    frame.setVisible(true);
  }
}
