import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JDorm2 extends JFrame implements ItemListener
{
   FlowLayout flow = new FlowLayout();
   JCheckBox privateRm = new JCheckBox("Private");
   JCheckBox internet = new JCheckBox("Internet");
   JCheckBox cable = new JCheckBox("Cable TV");
   JCheckBox microwave = new JCheckBox("Microwave");
   JCheckBox refrigerator = new JCheckBox("Refrigerator");
   JTextArea outArea = new JTextArea(5, 10);
   String[] dormOption = {"\nShared room",
       "\nNo Cable", "\nNo Internet", "\nNo microwave",
       "\nNo refrigerator"};      
   String output;
   int x;
   public JDorm2()
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
      for(x = 0; x < dormOption.length; ++x)
         outArea.append(dormOption[x]);
      add(outArea);
   }
   public static void main(String[] arguments)
   {
      JDorm2 dFrame = new JDorm2();
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
             dormOption[0] = "\nPrivate room";
         else
             dormOption[0] = "\nShared room";      
      }
      if(source == cable)
      {
	int select = check.getStateChange();
	if(select == ItemEvent.SELECTED)
	      dormOption[1] = "\nCable TV";
   	else
                   dormOption[1] = "\nNo cable";
      }
      if(source == internet)
      {
        int select = check.getStateChange();
    	if(select == ItemEvent.SELECTED)
           dormOption[2] = "\nInternet Connection";
    	else
           dormOption[2] = "\nNo internet";
      }
      if(source == microwave)
      {
         int select = check.getStateChange();
    	 if(select == ItemEvent.SELECTED)
    	    dormOption[3] = "\nMicrowave";
    	 else
	    dormOption[3] = "\nNo micowave";
      }
      if(source == refrigerator)
      {
         int select = check.getStateChange();
	 if(select == ItemEvent.SELECTED)
            dormOption[4] = "\nRefrigerator";
	 else
            dormOption[4] = "\nNo refrigerator";
      }
 //   for(x = 0; x < dormOption.length; ++x)
 //       outArea.remove(dormOption[x]);
      outArea.setText(dormOption[0]);
      for(x = 1; x < dormOption.length; ++x)
         outArea.append(dormOption[x]);
   }
}
