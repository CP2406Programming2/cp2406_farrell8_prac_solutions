import javax.swing.*;
class Departments
{
   public static void main(String[] args)
   {
      String[][] depts = new String[5][2]; 
      depts[0][0] = "Marketing";
      depts[0][1] = "Martinez";
      depts[1][0] = "Accounting";
      depts[1][1] = "Patel";
      depts[2][0] = "Human Resources";
      depts[2][1] = "Wong";
      depts[3][0] = "Information Services";
      depts[3][1] = "Deitrich";
      depts[4][0] = "Sales";
      depts[4][1] = "Lennon";

      String entry,  message ="Enter a department";
      int num, x;
      boolean isFound = false;
      while (!isFound)
      {
         entry = JOptionPane.showInputDialog(null, message);
         for(x = 0; x < depts.length; ++ x)
            if(entry.equals(depts[x][0]))
            {
               isFound = true;
               JOptionPane.showMessageDialog(null,
                  "Dept: " + entry + " Supervisor: " + depts[x][1]);
             x = depts.length;
            }
         if(!isFound)
            JOptionPane.showMessageDialog(null, "Sorry - no such department");
      }
   }
}
   