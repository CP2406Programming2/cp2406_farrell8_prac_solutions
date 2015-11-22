import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
public class JSammysSeashore extends JFrame implements ItemListener, ActionListener
{
   FlowLayout flow = new FlowLayout();
   GridLayout grid3 = new GridLayout(3, 1);
   GridLayout grid2c = new GridLayout(1, 2);
   GridLayout grid8 = new GridLayout(8, 1);
   GridLayout grid2r = new GridLayout(2, 1);
   Container con = getContentPane();
   JPanel mainPanel = new JPanel();
   JPanel topPanel = new JPanel();
   JPanel midPanel = new JPanel();
   JPanel bottomPanel = new JPanel();
   JPanel equipPanel = new JPanel();
   JPanel lessonPanel = new JPanel();
   JPanel lessonPanel2 = new JPanel();
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
      con.setLayout(grid3);
      con.add(topPanel);
      con.add(midPanel);
      con.add(bottomPanel);
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
      topPanel.add(mainLabel);
      topPanel.add(hoursLabel);
      topPanel.add(hoursField);
      topPanel.setLayout(flow);
      equipPanel.add(label1);
      equipPanel.add(jetSkiBox);
      equipPanel.add(pontoonBox);
      equipPanel.add(rowBoatBox);
      equipPanel.add(canoeBox);
      equipPanel.add(kayakBox);
      equipPanel.add(beachChairBox);
      equipPanel.add(umbrellaBox);
      equipPanel.setLayout(grid8);
      midPanel.add(equipPanel);
      midPanel.add(lessonPanel2);
      lessonPanel2.setLayout(grid2r);
      lessonPanel2.add(lessonPanel);
      midPanel.setLayout(grid2c);
      mainLabel.setFont(font);
      label1.setFont(font2);
      label2.setFont(font2);
      totPrice.setFont(font2);
      lessonPanel.add(label2);
      lessonPanel.add(lessonBox);
      lessonPanel.add(noLessonBox);
      lessonPanel.setLayout(grid3);
      bottomPanel.add(labelTotal);
      bottomPanel.add(totPrice);
      totPrice.setText("$0");
      bottomPanel.add(explainLabel);
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
      topPanel.setBackground(Color.PINK);
      bottomPanel.setBackground(Color.WHITE);
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
        frame.setSize(500, 500);
        frame.setVisible(true);
     }
}
