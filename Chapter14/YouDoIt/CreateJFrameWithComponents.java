import  javax.swing.*;
public class CreateJFrameWithComponents
{
   public static void main(String[] arguments)
   {
      JFrameWithComponents aFrame =
         new JFrameWithComponents();
      final int WIDTH = 350;
      final int HEIGHT = 100;
      aFrame.setSize(WIDTH, HEIGHT);
      aFrame.setVisible(true);
   }
}
