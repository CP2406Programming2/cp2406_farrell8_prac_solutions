import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JEMail2 extends JFrame implements ActionListener
{
    private JLabel toLabel = new JLabel("To:");
    private JTextField toField = new JTextField(24);
    private JLabel subjectLabel = new JLabel("Subject:");
    private JTextField subjectField = new JTextField(24);
    private JLabel messageLabel = new JLabel("Message:");
    private JButton sendButton = new JButton("Send");
    private JTextArea message = new JTextArea(4, 22);
    FlowLayout flow = new FlowLayout(FlowLayout.RIGHT);
    JScrollPane scroll = new JScrollPane(message,
        JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
        JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    JButton clearButton = new JButton("Clear");
    public JEMail2()
    {
        super("WebBuy Company E-Mail");
        setSize(370, 270);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(flow);
        
        add(toLabel);
        add(toField);
               
        add(subjectLabel);
        add(subjectField);
                
        add(messageLabel);
        message.setLineWrap(true);
        message.setWrapStyleWord(true);
        add(scroll);
 
        add(sendButton);
        add(clearButton);
        sendButton.addActionListener(this);
        clearButton.addActionListener(this);
    }

    public static void main(String[] arguments)
    {
        JEMail2 email = new JEMail2();
        email.setVisible(true);
    }
   @Override
   public void actionPerformed(ActionEvent event)
   {
      Object source = event.getSource();
      if(source == sendButton)
         message.append("\nMail has been sent!");
      else
      {
          message.setText("");
          toField.setText("");
          subjectField.setText("");
      }
   }
}
