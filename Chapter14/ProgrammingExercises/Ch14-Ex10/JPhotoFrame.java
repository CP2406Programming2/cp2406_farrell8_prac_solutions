import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JPhotoFrame extends JFrame implements ItemListener
{
   FlowLayout flow = new FlowLayout();
   JCheckBox locBox = new JCheckBox("On location",false);
   JCheckBox studioBox = new JCheckBox("In studio", false);
   JCheckBox oneBox = new JCheckBox("One human subject          ", false);
   JCheckBox moreBox = new JCheckBox("Two or more human subjects", false);
   JCheckBox petBox = new JCheckBox("Pet subjet                 ", false);
   JLabel mainLabel = new JLabel("Paula's Portaits");
   Font font = new  Font("Ariel",Font.ITALIC, 30);
   JLabel label2 = new JLabel("Portait fee");
   JLabel label1 = new JLabel("Select options");
   JTextField totPrice = new JTextField(10);
   String output;
   final double LOC_PRICE = 90.00;
   double ONE_HUMAN_SUBJECT_PRICE = 40.00, MORE_HUMAN_SUBJECTS_PRICE = 75.00;
   double PET_SUBJECT_PRICE = 95.00;
   double locPrice = 0.00;
   double subPrice = 0.0;
   public JPhotoFrame()
   {
      super("Portait options selection");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(flow);
      ButtonGroup subjectsGroup = new ButtonGroup();
      subjectsGroup.add(oneBox);
      subjectsGroup.add(moreBox);
      subjectsGroup.add(petBox);
      add(label1);
      add(oneBox);
      add(moreBox);
      add(petBox);
      ButtonGroup locGroup = new ButtonGroup();
      locGroup.add(locBox);
      locGroup.add(studioBox);
      add(locBox);
      add(studioBox);
      mainLabel.setFont(font);
      add(mainLabel);
      add(label2);
      add(totPrice);
      totPrice.setText("$0");
      oneBox.addItemListener(this);
      moreBox.addItemListener(this);
      petBox.addItemListener(this);
      locBox.addItemListener(this);
      studioBox.addItemListener(this);
   }
   @Override
   public void itemStateChanged(ItemEvent check)
   {
      Object source = check.getItem();
      int select;
      select = check.getStateChange();
      if(source == locBox)
      {
         if(select == ItemEvent.SELECTED)
            locPrice = locPrice + LOC_PRICE;
         else
            locPrice = locPrice - LOC_PRICE;
      }
      else
        if(source == oneBox)
        {
           if(select == ItemEvent.SELECTED)
              subPrice = subPrice + ONE_HUMAN_SUBJECT_PRICE;
           else
              subPrice = subPrice - ONE_HUMAN_SUBJECT_PRICE;
        }
        else
           if(source == moreBox)
           {
	      if(select == ItemEvent.SELECTED)
                 subPrice = subPrice + MORE_HUMAN_SUBJECTS_PRICE;
   	      else
	         subPrice = subPrice - MORE_HUMAN_SUBJECTS_PRICE;
           }
           else
           {
              if(source == petBox)
              {
                 if(select == ItemEvent.SELECTED)
	            subPrice = subPrice + PET_SUBJECT_PRICE;
                 else
	            subPrice = subPrice - PET_SUBJECT_PRICE;
              }
           }
        output = " " + (subPrice + locPrice);
        totPrice.setText(output);
    }
    public static void main(String[] args)
    {
      JPhotoFrame frame = new JPhotoFrame();
      frame.setSize(320, 250);
      frame.setVisible(true);
   }
}
