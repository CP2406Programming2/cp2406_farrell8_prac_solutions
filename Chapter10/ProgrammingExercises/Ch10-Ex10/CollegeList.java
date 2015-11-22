import javax.swing.*;
public class CollegeList
{
   public static void main(String[] args)
   {
      CollegeEmployee[] emp = new CollegeEmployee[4];
      Faculty[] fac = new Faculty[3];
      Student[] stu = new Student[7];
      int empCount = 0, facCount = 0, stuCount = 0;
      char letter;
      String input;
      int x;
      input = JOptionPane.showInputDialog(null, 
        "Type C, F or S to enter data for" +
        "\n(C)ollege employee\n(F)aculty\n(S)tudent" +
        "\nor type Q to quit");
      letter = input.charAt(0);
      while (letter != 'Q')
      {
         if(letter == 'C')
         {
            if(empCount < emp.length)
            { 
              CollegeEmployee c = new CollegeEmployee();
              c.setData();
              emp[empCount] = c;
              ++empCount;
            }
            else
              JOptionPane.showMessageDialog(null,
                "Sorry - too many employee records have been entered");
         }
         else if(letter == 'F')
         {
            if(facCount < fac.length)
            { 
              Faculty f = new Faculty();
              f.setData();
              fac[facCount] = f;
              ++facCount;
            }
            else
              JOptionPane.showMessageDialog(null,
                "Sorry - too many faculty records have been entered");
          }
          else if(letter == 'S')
          {
            if(stuCount < stu.length)
            { 
              Student s = new Student();
              s.setData();
              stu[stuCount] = s;
              ++stuCount;
            }
            else
              JOptionPane.showMessageDialog(null,
                "Sorry - too many student records have been entered");
          }
      input = JOptionPane.showInputDialog(null, 
        "Type C, F or S to enter data for" +
        "\n(C)ollege employee\n(F)aculty\n(S)tudent" +
        "\nor type Q to quit");
      letter = input.charAt(0);
    }
    System.out.println("\nCollege Employees:");
    if(empCount == 0)
      System.out.println("No employees entered");
    else
      for(x = 0; x < empCount; ++x)
        emp[x].display();
    System.out.println("\nFaculty:");
    if(facCount == 0)
      System.out.println("No faculty entered");
    else
      for(x = 0; x < facCount; ++x)
         fac[x].display();
    System.out.println("\nStudents:");
    if(stuCount == 0)
      System.out.println("No students entered");
    else
      for(x = 0; x < stuCount; ++x)
         stu[x].display();
   }    
}

