// User selects pizza topping and sees price
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FixDebugFourteen3 extends JFrame implements ItemListener
{
   FlowLayout flow = new FlowLayout();
   JComboBox<String> pizzaBox = new JComboBox<String>();
   JLabel toppingList = new JLabel("Topping List");
   JLabel aLabel = new JLabel("Paulos's American Pie");
   JTextField totPrice = new JTextField(10);
   int[] pizzaPrice = {7, 10, 10, 8, 8, 8, 8};
   int totalPrice = 0;
   String output;
   int pizzaNum;
   public FixDebugFourteen3()
   {
      super("Pizza List");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(flow);
      pizzaBox.addItemListener(this);
      add(toppingList);
      pizzaBox.addItem("cheese");
      pizzaBox.addItem("sausage");
      pizzaBox.addItem("pepperoni");
      pizzaBox.addItem("onion");
      pizzaBox.addItem("green pepper");
      pizzaBox.addItem("green olive");
      pizzaBox.addItem("black olive");
      add(pizzaBox);
      add(aLabel);
      add(totPrice);
   }
   public static void main(String[] arguments)
   {
      JFrame frame = new FixDebugFourteen3();
      frame.setSize(200, 150);
      frame.setVisible(true);
   }

   @Override
   public void itemStateChanged(ItemEvent list)
   {
     Object source = list.getSource();
     if(source == pizzaBox)
     {
        int pizzaNum = pizzaBox.getSelectedIndex();
        totalPrice = pizzaPrice[pizzaNum];
        output = "Pizza Price $" + totalPrice;
        totPrice.setText(output);
     }
   }
}