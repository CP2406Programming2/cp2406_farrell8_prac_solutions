import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
public class JCarlysCatering extends JFrame implements ItemListener, ActionListener
{
   Container con = getContentPane();
   GridLayout mainGrid = new GridLayout(3, 1);
   GridLayout grid0 = new GridLayout(1, 2);
   GridLayout grid1 = new GridLayout(1, 3, 12, 12);
   GridLayout grid2 = new GridLayout(5, 1, 4, 4);
   JPanel introPanel = new JPanel();
   JPanel promptPanel = new JPanel();
   JPanel boxesPanel = new JPanel();
   JPanel entreePanel = new JPanel();
   JPanel sidePanel = new JPanel();
   JPanel dessertPanel = new JPanel();
   JPanel endPanel = new JPanel();
   JCarlysLogoPanel logoPanel = new JCarlysLogoPanel();
   JPanel totalPanel = new JPanel();
   JTextField guestsField = new JTextField(8);
   JLabel guestsLabel = new JLabel("Please enter number of guests");
   JCheckBox beefBox = new JCheckBox("Beef", false);
   JCheckBox chickenBox = new JCheckBox("Chicken", false);
   JCheckBox fishBox = new JCheckBox("Fish", false);
   JCheckBox pastaBox = new JCheckBox("Pasta", false);
   JCheckBox saladBox = new JCheckBox("Salad", false);
   JCheckBox vegBox = new JCheckBox("Mixed vegetables", false);
   JCheckBox potBox = new JCheckBox("Baked potato", false);
   JCheckBox breadBox = new JCheckBox("Garlic bread", false);
   JCheckBox cakeBox = new JCheckBox("Chocolate cake", false);
   JCheckBox pieBox = new JCheckBox("Apple pie", false);
   JCheckBox pudBox = new JCheckBox("Butterscotch pudding", false);
   JLabel mainLabel = new JLabel("Carly's Catering");
   Font font = new  Font("Ariel",Font.ITALIC, 30);
   JLabel label2 = new JLabel("Total");
   JLabel label1 = new JLabel("Select options");
   JLabel totPrice = new JLabel();
   double price = 0;
   String entreeString = "";
   String sideString = "";
   String dessertString = "";
   String output;
   int numSelected = 0;
   public JCarlysCatering()
   {
      super("Menu options");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      con.setLayout(mainGrid);
      ButtonGroup entreeGroup = new ButtonGroup();
      entreeGroup.add(beefBox);
      entreeGroup.add(chickenBox);
      entreeGroup.add(fishBox);
      entreeGroup.add(pastaBox);
      entreePanel.add(beefBox);
      entreePanel.add(chickenBox);
      entreePanel.add(fishBox);
      entreePanel.add(pastaBox);
      sidePanel.add(saladBox);
      sidePanel.add(vegBox);
      sidePanel.add(potBox);
      sidePanel.add(breadBox);
      ButtonGroup dessertGroup = new ButtonGroup();
      dessertPanel.add(cakeBox);
      dessertPanel.add(pieBox);
      dessertPanel.add(pudBox);
      dessertGroup.add(cakeBox);
      dessertGroup.add(pieBox);
      dessertGroup.add(pudBox);
      introPanel.add(mainLabel);
      introPanel.add(promptPanel);
      promptPanel.add(guestsLabel);
      promptPanel.add(guestsField);
      con.add(introPanel);
      con.add(boxesPanel);
      boxesPanel.add(entreePanel);
      boxesPanel.add(sidePanel);
      boxesPanel.add(dessertPanel);
      introPanel.setLayout(grid0);
      boxesPanel.setLayout(grid1);
      entreePanel.setLayout(grid2);
      sidePanel.setLayout(grid2);
      dessertPanel.setLayout(grid2);
      promptPanel.setLayout(new FlowLayout());
      endPanel.setLayout(grid0);
      mainLabel.setFont(font);
      endPanel.add(logoPanel);
      logoPanel.setBackground(Color.RED);
      endPanel.add(totalPanel);
      totalPanel.add(label2);
      totalPanel.add(totPrice);
      totPrice.setText("$0");
      con.add(endPanel);
      guestsField.addActionListener(this);
      beefBox.addItemListener(this);
      chickenBox.addItemListener(this);
      fishBox.addItemListener(this);
      pastaBox.addItemListener(this);
      saladBox.addItemListener(this);
      vegBox.addItemListener(this);
      potBox.addItemListener(this);
      breadBox.addItemListener(this);
      cakeBox.addItemListener(this);
      pieBox.addItemListener(this);
      pudBox.addItemListener(this);
      introPanel.setBackground(Color.RED);
      boxesPanel.setBackground(Color.BLUE);
      endPanel.setBackground(Color.RED);
   }
   @Override
   public void actionPerformed(ActionEvent e)
   {
      Object source = e.getSource();
      final int PRICE_PER_GUEST = 35;
      if(source == guestsField)
      {
        try
        {
          price = Integer.parseInt(guestsField.getText()) * PRICE_PER_GUEST;   
        }
        catch(Exception exc)
        {
          price = 0;
        }
        output = "$" + price + " Menu includes " + entreeString +
          sideString + dessertString;
        totPrice.setText(output);
      }
   }
   @Override
   public void itemStateChanged(ItemEvent check)
   {
      Object source = check.getItem();
      int select= check.getStateChange();
      if(select == ItemEvent.SELECTED)
         if(source == beefBox)
 	    entreeString = "- beef -";
         else
            if(source == chickenBox)
               entreeString = "- chicken -";
            else
               if(source == fishBox)
                  entreeString = "- fish -";
               else
                  if(source == pastaBox)
                     entreeString = "- pasta -";
       if(select == ItemEvent.SELECTED)
         if(source == cakeBox)
 	    dessertString = "- chocolate cake -";
         else
            if(source == pieBox)
               dessertString = "- apple pie -";
            else
               if(source == pudBox)
                  dessertString = "- butterscotch pudding -";
         if(source == saladBox || source == vegBox || source == potBox || source == breadBox)
         {
            if(select == ItemEvent.SELECTED)
               ++numSelected;
            else
               --numSelected;
            sideString = "";
            if(numSelected <= 2)
            {
               if(saladBox.isSelected())
                   sideString += "- salad -";
               if(vegBox.isSelected())
                   sideString += "- mixed vegetables -";
               if(potBox.isSelected())
                   sideString += "- baked potato -";
               if(breadBox.isSelected())
                   sideString += "- garlic bread -";
           }
           else
           {
              saladBox.setSelected(false);
              vegBox.setSelected(false);
              potBox.setSelected(false);
              breadBox.setSelected(false);
           }
        }

       output = "$" + price + " Menu includes: " + entreeString +
          sideString + dessertString;
       totPrice.setText(output);
    }
    public static void main(String[] args)
    {
      JCarlysCatering frame = new JCarlysCatering();
      frame.setSize(650, 250);
      frame.setVisible(true);
   }
}
