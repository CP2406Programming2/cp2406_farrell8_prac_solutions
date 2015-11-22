import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JDorm extends JFrame implements ItemListener
{
   FlowLayout flow = new FlowLayout();
   JCheckBox privateRm = new JCheckBox("Private");
   JCheckBox internet = new JCheckBox("Internet");
   JCheckBox cable = new JCheckBox("Cable TV");
   JCheckBox microwave = new JCheckBox("Microwave");
   JCheckBox refrigerator = new JCheckBox("Refrigerator");
   JTextArea outArea = new JTextArea(5, 10);
   String dormOption;
   String output;
   public JDorm()
   {
      super("Dorm Room Options");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      setLayout(flow);
      add(privateRm);
      privateRm.addItemListener(this);
      add(internet);
      internet.addItemListener(this);
      add(cable);
      cable.addItemListener(this);
      add(microwave);
      microwave.addItemListener(this);
      add(refrigerator);
      refrigerator.addItemListener(this);
      outArea.append("Shared room\nNo cable\nNo Internet");
      outArea.append("\nNo microwave\nNo refrigerator"); 
      add(outArea);
   }
   public static void main(String[] arguments)
   {
      JDorm dFrame = new JDorm();
      dFrame.setSize(450,300);
      dFrame.setVisible(true);
   }
   @Override
   public void itemStateChanged(ItemEvent check)
   {
      Object source = check.getItem();
      if(source == privateRm)
      {
	int select = check.getStateChange();
	if(select == ItemEvent.SELECTED)
	    dormOption = "\nPrivate Room";
	else
	    dormOption = "\nShared room";      
      }
      if(source == cable)
      {
	int select = check.getStateChange();
	if(select == ItemEvent.SELECTED)
	   dormOption = "\nCable TV";
   	else
           dormOption = "\nNo cable";
      }
      if(source == internet)
      {
          int select = check.getStateChange();
    	  if(select == ItemEvent.SELECTED)
             dormOption = "\nInternet Connection";
          else
	     dormOption = "\nNo internet";
      }
      if(source == microwave)
      {
         int select = check.getStateChange();
    	 if(select == ItemEvent.SELECTED)
            dormOption = "\nMicrowave";
    	 else
	    dormOption = "\nNo micowave";
      }
      if(source == refrigerator)
      {
         int select = check.getStateChange();
	 if(select == ItemEvent.SELECTED)
	    dormOption = "\nRefrigerator";
	 else
	    dormOption = "\nNo refrigerator";
      }
      output = " " + dormOption;
      outArea.append(output);
   }
}
