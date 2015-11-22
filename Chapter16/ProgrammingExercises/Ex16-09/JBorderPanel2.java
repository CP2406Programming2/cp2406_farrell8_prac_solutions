import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
public class JBorderPanel2 extends JPanel implements ActionListener
{
   String myName = new String("");
   Font serifItalic = new Font("Serif", Font.ITALIC, 20);
   int leading, ascent, descent, height, width;
   int a, x = 60, y = 100;
   int border = 10;
   final int NUM = 5;
   final int FACTOR = 10;
   Color[] colors = new Color[NUM];
   JTextField field = new JTextField(15);
   public JBorderPanel2()
   {
      colors[1] = Color.BLACK;
      colors[2] = Color.GREEN;
      colors[3] = Color.MAGENTA;
      colors[4] = Color.ORANGE;
      add(field);
      field.addActionListener(this);
   }
   @Override
   public void actionPerformed(ActionEvent e)
   {
      myName = field.getText();
      repaint();
   }
   @Override
   public void paintComponent(Graphics gr)
   {
      super.paintComponent(gr);
      for(a = 1; a < NUM; ++a)
      {
         gr.setColor(colors[a]);
         border = a * FACTOR;
         gr.setFont(serifItalic);
         gr.drawString(myName, x, y);
         leading = gr.getFontMetrics().getLeading();
         ascent = gr.getFontMetrics().getAscent();
         descent = gr.getFontMetrics().getDescent();
         height = gr.getFontMetrics().getHeight();
         width = gr.getFontMetrics().stringWidth(myName);
         gr.drawRect(x - border, y - (ascent + leading +
            border), width + 2 * border,
            height + 2 * border);
     }
   }
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.add(new JBorderPanel2());
      frame.setSize(300, 200);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

 }
