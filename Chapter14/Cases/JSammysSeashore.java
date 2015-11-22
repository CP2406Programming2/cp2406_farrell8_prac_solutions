import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JSammysSeashore extends JFrame implements ItemListener, ActionListener
{
   FlowLayout flow = new FlowLayout();
   JTextField hoursField = new JTextField(8);
   JLabel hoursLabel = new JLabel("      Please enter hours for rental");
   JCheckBox jetSkiBox = new JCheckBox("Jet ski", false);
   JCheckBox pontoonBox = new JCheckBox("Pontoon boat", false);
   JCheckBox rowBoatBox = new JCheckBox("Row boat", false);
   JCheckBox canoeBox = new JCheckBox("Canoe", false);
   JCheckBox kayakBox = new JCheckBox("Kayak", false);
   JCheckBox beachChairBox = new JCheckBox("Beach chair", false);
   JCheckBox umbrellaBox = new JCheckBox("Umbrella", false);
   JCheckBox lessonBox = new JCheckBox("Lesson", false);
   JCheckBox noLessonBox = new JCheckBox("No lesson", true);
   JLabel mainLabel = new JLabel("Sammy's Seashore Rentals");
   Font font = new  Font("Ariel",Font.ITALIC, 30);
   Font font2 = new  Font("Ariel",Font.PLAIN, 20);
   JLabel labelTotal = new JLabel("Total");
   JLabel label1 = new JLabel("Select rental equipment");
   JLabel label2 = new JLabel("Lessons?");
   JLabel totPrice = new JLabel();
   JLabel explainLabel = new JLabel();
   int hourPrice = 0;
   int lessonPrice = 0;
   int equipPrice = 0;
   int price = 0;
   int hours;
   String output = "";
   String equipString = "";
   String timeString = "";
   String lessonString = "";
   public JSammysSeashore()
   {
      super("Menu options");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(flow);
      ButtonGroup equipmentGroup = new ButtonGroup();
      equipmentGroup.add(jetSkiBox);
      equipmentGroup.add(pontoonBox);
      equipmentGroup.add(rowBoatBox);
      equipmentGroup.add(canoeBox);
      equipmentGroup.add(kayakBox);
      equipmentGroup.add(beachChairBox);
      equipmentGroup.add(umbrellaBox);
      ButtonGroup lessonGroup = new ButtonGroup();
      lessonGroup.add(lessonBox);
      lessonGroup.add(noLessonBox);
      add(mainLabel);
      add(hoursLabel);
      add(hoursField);
      add(label1);
      add(jetSkiBox);
      add(pontoonBox);
      add(rowBoatBox);
      add(canoeBox);
      add(kayakBox);
      add(beachChairBox);
      add(umbrellaBox);
      mainLabel.setFont(font);
      label1.setFont(font2);
      label2.setFont(font2);
      totPrice.setFont(font2);
      add(label2);
      add(lessonBox);
      add(noLessonBox);

      add(labelTotal);
      add(totPrice);
      totPrice.setText("$0");
      add(explainLabel);
      hoursField.addActionListener(this);
      jetSkiBox.addItemListener(this);
      pontoonBox.addItemListener(this);
      rowBoatBox.addItemListener(this);
      kayakBox.addItemListener(this);
      canoeBox.addItemListener(this);
      beachChairBox.addItemListener(this);
      umbrellaBox.addItemListener(this);
      lessonBox.addItemListener(this);
      noLessonBox.addItemListener(this);
   }
   @Override
   public void actionPerformed(ActionEvent e)
   {
      Object source = e.getSource();
      if(source == hoursField)
      {
        try
        {
           hours = Integer.parseInt(hoursField.getText());
        }
        catch(Exception exc)
        {
           hours = 0;
           hoursField.setText("invalid entry");
        }
        hourPrice = hours * equipPrice;
        price = hourPrice + lessonPrice;
        timeString = "- for " + hours + " hours - ";
        output = "$" + price; 
        totPrice.setText(output);
        output = "Rental details: " + equipString + timeString + lessonString;
        explainLabel.setText(output);
      }
   }
   @Override
   public void itemStateChanged(ItemEvent check)
   {
      Object source = check.getItem();
      int select = check.getStateChange();
      final int HIGH_PRICE = 40;
      final int MED_PRICE = 20;
      final int LOW_PRICE = 7;
      final int LESSON_PRICE = 5;
      if(select == ItemEvent.SELECTED)
      {
         if(source == jetSkiBox)
         {
 	    equipString = "- jet ski @ $" + HIGH_PRICE + " per hour - " ;
            equipPrice = HIGH_PRICE;
         }
         else
            if(source == pontoonBox)
            {
               equipString = "- pontoon boat @ $" + HIGH_PRICE + " per hour - " ;
               equipPrice = HIGH_PRICE;
            }
            else
               if(source == rowBoatBox)
               {
                  equipString = " - row boat @ $" + MED_PRICE + " per hour - " ;
                  equipPrice = MED_PRICE;
               }
               else
                  if(source == canoeBox)
                  {
                     equipString = "- row boat @ $" + MED_PRICE + " per hour - " ;
                     equipPrice = MED_PRICE;
                  }
                  else
                     if(source == kayakBox)
                     {
                         equipString = " - kayak @ $" + MED_PRICE + " per hour - " ;;
                         equipPrice = MED_PRICE;
                     }
                     else
                        if(source == beachChairBox)
                        {
                           equipString = " - beach chair @ $" + LOW_PRICE + " per hour - " ;
                           equipPrice = LOW_PRICE;
                        }
                        else
                           if(source == umbrellaBox)
                           {
                              equipString = " - umbrella @ $" + LOW_PRICE + " per hour - " ;
                              equipPrice = LOW_PRICE;
                           }
                           else
                              if(source == lessonBox)
                              {
                                 lessonString = " - lesson @ $" + LESSON_PRICE;
                                 lessonPrice = LESSON_PRICE;
                              }
                              else
                              {
                                 lessonString = " - no lesson";
                                 lessonPrice = 0;
                              }
            hourPrice = hours * equipPrice;
            price = hourPrice + lessonPrice;
            output = "$" + price; 
            totPrice.setText(output);
            output = "Rental details: " + equipString + timeString + lessonString;
            explainLabel.setText(output);
        }
     }
     
     public static void main(String[] args)
     {
        JSammysSeashore frame = new JSammysSeashore();
        frame.setSize(450, 250);
        frame.setVisible(true);
     }
}
