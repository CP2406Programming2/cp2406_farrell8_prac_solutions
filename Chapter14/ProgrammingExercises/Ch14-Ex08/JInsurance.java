import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JInsurance extends JFrame implements ItemListener
{
   FlowLayout flow = new FlowLayout();
   ButtonGroup insGrp = new ButtonGroup();
   JCheckBox hmo = new JCheckBox("HMO", false);
   JCheckBox ppo = new JCheckBox("PPO", false);
   JCheckBox dental = new JCheckBox("Dental", false);
   JCheckBox vision = new JCheckBox("Vision", false);
   JTextField insChoice = new JTextField(20);
   String output, insChosen;
   public JInsurance()
   {
      super("Check Box");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(flow);
      insGrp.add(hmo);
      insGrp.add(ppo);
      hmo.addItemListener(this);
      ppo.addItemListener(this);
      dental.addItemListener(this);
      vision.addItemListener(this);
      add(hmo);
      add(ppo);
      add(dental);
      add(vision);
      add(insChoice);
    }
    public static void main(String[] arguments)
    {
      JInsurance iFrame = new JInsurance();
      iFrame.setSize(400,100);
      iFrame.setVisible(true);
    }
   @Override
   public void itemStateChanged(ItemEvent check)
   {
      int HMOPRICE = 200;
      int PPOPRICE = 600;
      int DENTALPRICE = 75;
      int VISIONPRICE = 20;
      Object source = check.getItem();
      if(source == hmo)
      {
   	 int select = check.getStateChange();
   	 if(select == ItemEvent.SELECTED)
   	      insChosen = "hmo $" + HMOPRICE;
   	 else
            if(select == ItemEvent.DESELECTED)
      	       insChosen = "";
         output = " " + insChosen;
   	 insChoice.setText(output);
      }
      if(source == ppo)
      {
   	  int select = check.getStateChange();
   	  if(select == ItemEvent.SELECTED)
   	     insChosen = "ppo $" + PPOPRICE;
   	  else
             if(select == ItemEvent.DESELECTED)
   		insChosen = "";
   	  output = " " + insChosen;
   	  insChoice.setText(output);
      }
      if(source == dental)
      {
   	  int select = check.getStateChange();
   	  if(select == ItemEvent.SELECTED)
   	      insChosen = "dental $" + DENTALPRICE +
                 " additional";
   	   else
              if(select == ItemEvent.DESELECTED)
      	   insChosen = "";
           output = " " + insChosen;
   	   insChoice.setText(output);
      }
      if(source == vision)
      {
   	  int select = check.getStateChange();
   	  if(select == ItemEvent.SELECTED)
   	     insChosen = "vision $" + VISIONPRICE +
                " additional";
   	  else
             if(select == ItemEvent.DESELECTED)
      	        insChosen = "";
          output = " " + insChosen;
   	  insChoice.setText(output);
      }
   }
}
