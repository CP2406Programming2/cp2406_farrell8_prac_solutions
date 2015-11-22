// ShowStudent.java
// Chapter 3, Exercise 12
// client to test the Student class
class ShowStudent
{
   public static void main (String args[])
   {
      Student pupil = new Student();
      pupil.setIDnumber(234);
      pupil.setPoints(47);
      pupil.setHours(15);

      pupil.showIDnumber();
      pupil.showPoints();
      pupil.showHours();
      System.out.println("The grade point average is " +
         pupil.getGradePoint());
   }
}


