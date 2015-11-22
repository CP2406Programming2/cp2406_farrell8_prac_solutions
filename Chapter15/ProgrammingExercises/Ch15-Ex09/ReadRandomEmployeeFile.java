import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ReadRandomEmployeeFile extends JFrame
  implements ActionListener
{
   private JLabel title =  
     new JLabel("Employee data");
   Font bigFont = new Font("Helvetica", Font.ITALIC, 24);
   private JLabel prompt = 
      new JLabel("    Enter empployee data    ");
   private JTextField idField = new JTextField(4);
   private JTextField firstField = new JTextField(14);
   private JTextField lastField = new JTextField(14);
   private JTextField payField = new JTextField(8);
   private JLabel idLabel = new JLabel("ID");
   private JLabel fnLabel = new JLabel("First name");
   private JLabel lnLabel = new JLabel("Last name");
   private JLabel payLabel = new JLabel("Pay rate");
   private JButton enterDataButton =   
      new JButton("Enter data");
   private Container con = getContentPane();
   DataOutputStream ostream;
   RandomAccessFile empFile;
   final int RECORD_SIZE = 32;
   final int NUM_RECORDS = 100;
   StringBuffer blankName = new StringBuffer(10);
   public ReadRandomEmployeeFile()
   {
     try
     {
       empFile = 
          new RandomAccessFile("Employees.dat","rw"); 
     }
     catch(IOException e)
     {
        System.err.println("File not opened");
        System.exit(1);
     }
     setSize(280, 200);
     con.setLayout(new FlowLayout());
     title.setFont(bigFont);
     con.add(title);
     con.add(idLabel);
     con.add(idField);
     con.add(enterDataButton);
     enterDataButton.addActionListener(this);
     con.add(fnLabel);
     con.add(firstField);
     con.add(lnLabel);
     con.add(lastField);
     con.add(payLabel);
     con.add(payField);
     setVisible(true);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   @Override
   public void actionPerformed(ActionEvent e1)
   {
      String firstName;
      String lastName;
      int num;
      double pay;
      try
      {
         num = Integer.parseInt(idField.getText());
         empFile.seek((num - 1) * RECORD_SIZE);
         num = empFile.readInt();
         firstName = empFile.readUTF();
         lastName = empFile.readUTF();        
         pay = empFile.readDouble();
         idField.setText("" + num);
         firstField.setText(firstName);
         lastField.setText(lastName);
         payField.setText("" + pay);
      }
      catch(NumberFormatException e2)
      {
         System.err.println("Invalid employee number");
      }
      catch(IOException e3)
      {
          System.err.println("Error reading file");
          System.exit(1);
      }
   }
   public static void main(String[] args)
   {
      ReadRandomEmployeeFile file = new ReadRandomEmployeeFile(); 
   }
}