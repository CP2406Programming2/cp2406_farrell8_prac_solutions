import javax.swing.*;
public class CollegeCourse
{
   protected String dept;
   protected int id;
   protected double credits;
   protected double price;
   public CollegeCourse(String dep, int num, double cr)
   {
      final int FEEPERCREDIT = 120;
      dept = dep;
      id = num;
      credits = cr;
      price = cr * FEEPERCREDIT;
   }
   public void display()
   {
      JOptionPane.showMessageDialog(null,
         dept + id + "\nNon-lab course\n" +  credits +
         " credits\nTotal fee is $" + price);
   }
}