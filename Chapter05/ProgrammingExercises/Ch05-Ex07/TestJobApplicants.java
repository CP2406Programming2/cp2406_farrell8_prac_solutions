import java.util.Scanner;
public class TestJobApplicants
{
   public static void main(String[] args)
   {
      JobApplicant app1 = new JobApplicant("Johnson", "312-345-9875",
            true, false, true, false);
      JobApplicant app2 = new JobApplicant("Kermit", "312-543-1275",
            true, false, false, false);
      JobApplicant app3 = new JobApplicant("Lawrence", "608-288-09125",
            true, false, true, true);
      JobApplicant app4 = new JobApplicant("Mitchell", "815-288-3881",
            true, true, true, true);
      String qualifiedMsg = "is qalified for an interview   ";
      String notQualifiedMsg = "is not qualified for an interview at this time   ";
      if(isQualified(app1))
         display(app1, qualifiedMsg);
      else
         display(app1, notQualifiedMsg);
      if(isQualified(app2))
         display(app2, qualifiedMsg);
      else
         display(app2, notQualifiedMsg);
      if(isQualified(app3))
         display(app3, qualifiedMsg);
      else
         display(app3, notQualifiedMsg);
      if(isQualified(app4))
         display(app4, qualifiedMsg);
      else
         display(app4, notQualifiedMsg);
   }
   public static boolean isQualified(JobApplicant app)
   {
      int count = 0;
      boolean isQual;
      final int MIN_SKILLS = 3;
      if(app.getHasWordSkill())
         count = count + 1;
      if(app.getHasSpreadsheetSkill())
         count = count + 1;
      if(app.getHasDatabaseSkill())
         count = count + 1;
      if(app.getHasGraphicsSkill())
         count = count + 1;
      if(count >= MIN_SKILLS)
         isQual = true;
      else
         isQual = false;
      return isQual;
   }
   public static void display(JobApplicant app, String msg)
   {
      System.out.println(app.getName() + " " + msg +
         "  Phone: " + app.getPhone());
   }
}