public class School
{
   private NameAndAddress nameAdd;
   private int enrollment;
   public School(String name, String add, int zip, int enrolled)
   {
      nameAdd = new NameAndAddress(name, add, zip);
      enrollment = enrolled;
   }
   public void display()
   {
      System.out.println("The school information:");
      nameAdd.display();
      System.out.println("Enrollment is " + enrollment);
   }
}
