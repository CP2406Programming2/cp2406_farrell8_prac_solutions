import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JVacationRental extends JFrame implements ItemListener
{
   FlowLayout flow = new FlowLayout();
   String companyName = new String("Lambert's Vacation Rentals");
   Font bigFont = new Font("Arial", Font.PLAIN, 24);
   final int PARKPRICE = 600, POOLPRICE = 750, LAKEPRICE = 825;
   int totalPrice = 0;
   ButtonGroup locationGrp = new ButtonGroup();
   JCheckBox parkBox = new JCheckBox("Parkside",false);
   JCheckBox poolBox = new JCheckBox("Poolside", false);
   JCheckBox lakeBox = new JCheckBox("Lakeside", false);
   final int ONEPRICE = 0, TWOPRICE = 75, THREEPRICE = 150;
   ButtonGroup bdrmGrp = new ButtonGroup();
   JCheckBox oneBox = new JCheckBox("1 bedroom", false);
   JCheckBox twoBox = new JCheckBox("2 bedrooms", false);
   JCheckBox threeBox = new JCheckBox("3 bedrooms", false);
   final int NOMEALSPRICE = 0, MEALSPRICE = 200;
   ButtonGroup mealGrp = new ButtonGroup();
   JCheckBox noMealsBox = new JCheckBox("No meals",false);
   JCheckBox mealsBox = new JCheckBox("Meals included",false);
   JTextField totPrice = new JTextField(10);
   String output;
   public JVacationRental()
   {
      super("Vacation rentals");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(flow);
      locationGrp.add(parkBox);
      parkBox.addItemListener(this);
      locationGrp.add(poolBox);
      poolBox.addItemListener(this);
      locationGrp.add(lakeBox);
      lakeBox.addItemListener(this);
      bdrmGrp.add(oneBox);
      twoBox.addItemListener(this);
      bdrmGrp.add(twoBox);
      threeBox.addItemListener(this);
      bdrmGrp.add(threeBox);
      mealGrp.add(noMealsBox);
      noMealsBox.addItemListener(this);
      mealGrp.add(mealsBox);
      mealsBox.addItemListener(this);
      add(parkBox);
      add(poolBox);
      add(lakeBox);
      add(oneBox);
      add(twoBox);
      add(threeBox);
      add(noMealsBox);
      add(mealsBox);
      totPrice.setText("0");
      add(totPrice);
   }
   public static void main(String[] arguments)
   {
      JVacationRental aFrame = new JVacationRental();
      aFrame.setSize(320,200);
      aFrame.setVisible(true);
   }
   @Override
   public void itemStateChanged(ItemEvent check)
   {
    Object source = check.getItem();
    if(source == parkBox)
    {
       int select = check.getStateChange();
       if(select == ItemEvent.SELECTED)
          totalPrice += PARKPRICE;
       else if(select == ItemEvent.DESELECTED)
          totalPrice -= PARKPRICE;
       output = " " + totalPrice;
       totPrice.setText(output);
      }
      else if(source == poolBox)
      {
	int select = check.getStateChange();
	if(select == ItemEvent.SELECTED)
	      totalPrice += POOLPRICE;
	else if(select == ItemEvent.DESELECTED)
	      totalPrice -= POOLPRICE;
	output = " " + totalPrice;
	totPrice.setText(output);
      }
      else if(source == lakeBox)
      {
	 int select = check.getStateChange();
	 if(select == ItemEvent.SELECTED)
	    totalPrice += LAKEPRICE;
	 else if(select == ItemEvent.DESELECTED)
   	    totalPrice -= LAKEPRICE;
   	 output = " " + totalPrice;
	 totPrice.setText(output);
      }
      else if(source == oneBox)
      {
	 int select = check.getStateChange();
	 if(select == ItemEvent.SELECTED)
	      totalPrice += ONEPRICE;
	 else if(select == ItemEvent.DESELECTED)
   	      totalPrice -= ONEPRICE;
   	 output = " " + totalPrice;
	 totPrice.setText(output);
      }
      else if(source == twoBox)
      {
	int select = check.getStateChange();
	if(select == ItemEvent.SELECTED)
	    totalPrice += TWOPRICE;
	else if(select == ItemEvent.DESELECTED)
   	      totalPrice -= TWOPRICE;
   	output = " " + totalPrice;
	totPrice.setText(output);
      }
      else if(source == threeBox)
      {
	int select = check.getStateChange();
	if(select == ItemEvent.SELECTED)
	    totalPrice += THREEPRICE;
	else if(select == ItemEvent.DESELECTED)
	    totalPrice -= THREEPRICE;
	output = " " + totalPrice;
	totPrice.setText(output);
      }
      else if(source == noMealsBox)
      {
	int select = check.getStateChange();
	if(select == ItemEvent.SELECTED)
	      totalPrice += NOMEALSPRICE;
	else if(select == ItemEvent.DESELECTED)
   	    totalPrice -= NOMEALSPRICE;
   	output = " " + totalPrice;
	    totPrice.setText(output);
      }
      else if(source == mealsBox)
      {
	 int select = check.getStateChange();
	 if(select == ItemEvent.SELECTED)
	      totalPrice += MEALSPRICE;
	 else if(select == ItemEvent.DESELECTED)
	      totalPrice -= MEALSPRICE;
	 output = " " + totalPrice;
	 totPrice.setText(output);
      }
   }
}