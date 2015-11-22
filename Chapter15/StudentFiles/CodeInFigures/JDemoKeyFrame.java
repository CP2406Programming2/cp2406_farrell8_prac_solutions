import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JDemoKeyFrame extends JFrame
 implements KeyListener
{
   private JLabel prompt = new JLabel("Type keys below:");
   private JLabel outputLabel = new JLabel();
   private JTextField textField = new JTextField(10);
   public JDemoKeyFrame()
   {
      setLayout(new BorderLayout());
      add(prompt, BorderLayout.NORTH);
      add(textField, BorderLayout.CENTER);
      add(outputLabel, BorderLayout.SOUTH);
      addKeyListener(this);
      textField.addKeyListener(this);
   }
   @Override
   public void keyTyped(KeyEvent e)
   {
      char c = e.getKeyChar();
      outputLabel.setText("Last key typed: " + c);
   }
   @Override
   public void keyPressed(KeyEvent e)
   {
   }
   @Override
   public void keyReleased(KeyEvent e)
   {
   }
   public static void main(String[] args)
   {
      JDemoKeyFrame keyFrame = new JDemoKeyFrame();
      final int WIDTH = 250;
      final int HEIGHT = 100;
      keyFrame.setSize(WIDTH, HEIGHT);
      keyFrame.setVisible(true);
   }
}
