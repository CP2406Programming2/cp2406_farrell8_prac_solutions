import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JCarlysCatering extends JFrame implements ItemListener, ActionListener
{
   FlowLayout flow = new FlowLayout();
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
      setLayout(flow);
      ButtonGroup entreeGroup = new ButtonGroup();
      entreeGroup.add(beefBox);
      entreeGroup.add(chickenBox);
      entreeGroup.add(fishBox);
      entreeGroup.add(pastaBox);
      //ButtonGroup sideGroup = new ButtonGroup();
      //sideGroup.add(saladBox);
      //sideGroup.add(vegBox);
      //sideGroup.add(potBox);
      //sideGroup.add(breadBox);
      ButtonGroup dessertGroup = new ButtonGroup();
      dessertGroup.add(cakeBox);
      dessertGroup.add(pieBox);
      dessertGroup.add(pudBox);
      add(mainLabel);
      add(guestsLabel);
      add(guestsField);
      add(label1);
      add(beefBox);
      add(chickenBox);
      add(fishBox);
      add(pastaBox);
      add(saladBox);
      add(vegBox);
      add(potBox);
      add(breadBox);
      add(cakeBox);
      add(pieBox);
      add(pudBox);
      mainLabel.setFont(font);

      add(label2);
      add(totPrice);
      totPrice.setText("$0");
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
      select = check.getStateChange();
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
      frame.setSize(550, 250);
      frame.setVisible(true);
   }
}
