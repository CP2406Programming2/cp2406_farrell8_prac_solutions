// CommentsDialog.java
// Chapter 1, Exercise #11
// Displays comments in dialog box
import javax.swing.JOptionPane;
class CommentsDialog
{
   public static void main(String[] args)
   {
      JOptionPane.showMessageDialog
         (null, "Program comments are nonexecuting statements you add" +
         "\nto a program for the purpose of documentation.");
       // line comments
       // Program comments are nonexecuting statements you add
       // to a program for the purpose of documentation.
       // block comment
       /* Program comments are non-executing statements you add
          to a program for the purpose of documentation. */
       // javadoc comment
       /** Programming comments are non-executing statements you add
        to a program for the purpose of documentation  */
    }
}