import java.util.Scanner;
import java.util.ArrayList;
public class Majors
{
   enum Major {ACC, CHEM, CIS, ENG, HIS, PHYS};
   public static void main(String[] args)
   {
      Major studentMajor;
      String userEntry;
      int position;
      int comparison;
      Scanner input = new Scanner(System.in);
      System.out.println("The majors we offer are:");
      for(Major m : Major.values())
         System.out.print(m + " ");
      System.out.print("\n\nEnter your major >> ");
      userEntry = input.nextLine().toUpperCase();
      studentMajor = Major.valueOf(userEntry);
      System.out.println("You entered " + studentMajor);
      switch(studentMajor)
      {
         case ACC:
         case CIS:
            System.out.println("Your major is in the Business Division");
            break;
         case CHEM:
         case PHYS:
            System.out.println("Your major in in the Science Division");
            break;
         case ENG:
         case HIS:
            System.out.println("Your major is in the Humanities Division");
      }

   }
}
