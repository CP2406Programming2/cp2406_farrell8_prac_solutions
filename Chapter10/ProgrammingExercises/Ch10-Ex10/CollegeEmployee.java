import javax.swing.*;
public class CollegeEmployee extends Person
{
   private String ssn;
   private double annualSalary;
   private String dept;
   @Override
   public void setData()
   {
      String temp;
      super.setData();
      ssn = JOptionPane.showInputDialog(null,
         "Please enter Social Security number");
      temp = JOptionPane.showInputDialog(null,
         "Please enter annual salary");
      annualSalary = Double.parseDouble(temp);
      dept = JOptionPane.showInputDialog(null,
         "Please enter employee's department");
   }
   @Override
   public void display()
   {
      super.display();
      System.out.println("SSN: " + ssn + " Salary $" +
         annualSalary + " Department: " + dept);
   }
}
