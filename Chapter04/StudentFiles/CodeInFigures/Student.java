public class Student
{
   private static final int SCHOOL_ID = 12345;
   private int stuNum;
   private double gpa;

   public Student(int stuNum, double gpa)
   {
     stuNum = stuNum;
     gpa = gpa;
   }
   public void showStudent()
   {
     System.out.println("Student #" + stuNum +
         " gpa is " + gpa);
   }
}
