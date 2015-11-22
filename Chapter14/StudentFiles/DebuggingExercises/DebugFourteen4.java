// Beverage selector
// Milk and cola are $3
// all other drinks are $2
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DebugFourteen4 extends JFrame implements ItemListener
{
   FlowLayout flow = new FlowLayout();
   String title = new String("Beverage Selector");
   Font bigFont = new Font("Arial", Font.PLAIN, 24);
   ButtonGroup drinkGrp = new ButtonGroup();
   JCheckBox cola = new JCheckBox("Cola",false);
   JCheckBox lemon = new JCheckBox("Lemonade",false);
   JCheckBox tea = new JCheckBox("Iced tea");
   JCheckBox milk = new JCheckBox("Milk");
   JCheckBox coffee = new JCheckBox("Coffee");
   JTextField totPrice = new JTextField(10);
   String output;
   int totalPrice = 0;
   final int HIGH_PRICE = 3;
   final int LOW_PRICE = 2;
   public FixDebugFourteen4()
   {
      super("Beverage Selector");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(flow);
      add(cola);
      cola.addItemListener(this);
      add(lemon);
      add(tea);
      tea.addItemListener(this);
      add(milk);
      milk.addItemListener(this);
      add(totPrice);

      drinkGrp.add(cola);
      drinkGrp.add(lemon);
      drinkGrp.add(milk);
      drinkGrp.add(coffee);
      totPrice.setText("0");
   }
   public static void main(String[] arguments)
   {
      JFrame bFrame = new DebugFourteen4();
      bFrame.setSize(350, 100);
      bFrame.setVisible(true);
   } 
   @Override
   public void itemStateChanged(ItemEvent check)
   {
      Object source = check.getItem();
      if(source == cola && source == milk)
      {
         totPrice.setText("$" + HIGH_PRICE);
      }
      else
      {
         totPrice.setText("$" + LOW_PRICE);
      }
   }
}