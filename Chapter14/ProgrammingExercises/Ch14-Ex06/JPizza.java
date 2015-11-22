import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JPizza extends JFrame implements ItemListener
{
   FlowLayout flow = new FlowLayout();
   JLabel companyName = new JLabel("Tower of Pizza");
   JComboBox<String> sizeBox = new JComboBox<String>();
   JLabel sizeList = new JLabel("Size List");
   JComboBox<String> toppingBox = new JComboBox<String>();
   JLabel toppingList = new JLabel("Topping List");
   JTextField totPrice = new JTextField(10);
   int totalPrice = 0;
   int sizeNum, toppingNum;
   int sPrice, tPrice, sumPrice;
   int[] sizePrice = {0, 7, 9, 11, 14};
   int[] toppingPrice = {0, 0, 1, 1, 1, 1};
   String output;
   public JPizza()
   {
      super("Tower of Pizza");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
      setLayout(flow);
      add(companyName);
      companyName.setFont(new Font("Ariel", Font.BOLD, 20));
      sizeBox.addItem("None");
      sizeBox.addItem("Small");
      sizeBox.addItem("Medium");
      sizeBox.addItem("Large");
      sizeBox.addItem("Extra large");
      toppingBox.addItem("None");
      toppingBox.addItem("Cheese");
      toppingBox.addItem("Sausage");
      toppingBox.addItem("Pepperoni");
      toppingBox.addItem("Green pepper");
      toppingBox.addItem("Onion");
      add(sizeList);
      add(sizeBox);
      sizeBox.addItemListener(this);
      add(toppingList);
	add(toppingBox);
      toppingBox.addItemListener(this);
      add(totPrice);
   }
   public static void main(String[] arguments)
   {
      JPizza pframe = new JPizza();
      pframe.setSize(180,200);
      pframe.setVisible(true);
   }

   @Override
   public void itemStateChanged(ItemEvent list)
   {
       Object source = list.getSource();
       if (source == sizeBox)
       {
          sizeNum = sizeBox.getSelectedIndex();
          sPrice = sizePrice[sizeNum];
          sumPrice = sPrice + tPrice;
          output = "Total Price $" + sumPrice;
          totPrice.setText(output);
       }
       else if (source == toppingBox)
       {
          toppingNum = toppingBox.getSelectedIndex();
          tPrice = toppingPrice[toppingNum];
          sumPrice = sPrice + tPrice;
          output = "Total Price $" + sumPrice;
          totPrice.setText(output);
       }
   }
}