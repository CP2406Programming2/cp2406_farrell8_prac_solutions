import javax.swing.*;
public class Faculty extends CollegeEmployee
{
   private boolean isTenured = false;
   @Override
   public void setData()
   {
      String temp;
      super.setData();
      temp = JOptionPane.showInputDialog(null,
         "Is this faculty member tenured - Y or N?");
      if(temp.charAt(0) == 'Y' || temp.charAt(0) == 'y')
         isTenured = true;
   }
   @Override
   public void display()
   {
      super.display();
      if(isTenured)
        System.out.println("Faculty member is tenured");
      else
        System.out.println("Faculty member is not tenured");
   }
}
