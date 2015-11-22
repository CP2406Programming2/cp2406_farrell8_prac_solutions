import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
public class JFlexiblePanel extends JPanel
{
   Color back;
   Color fore;
   Font font;
   String str;
   JLabel label = new JLabel();
   public JFlexiblePanel(Color bkgd, Color frgd, Font fnt, String st)
   {
      str = st;
      font = fnt;
      back = bkgd;
      fore = frgd;
      this.add(label);
      label.setText(str);
      label.setFont(font);
      this.setBackground(back);
      label.setForeground(fore);
   }
}