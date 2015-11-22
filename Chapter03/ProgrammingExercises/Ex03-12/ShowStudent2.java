// ShowStudent2.java
// Chapter 3, Exercise 12
// Client to test the Student class
class ShowStudent2
{
   public static void main (String args[])
   {
      Student pupil = new Student();
      pupil.showIDnumber();
      pupil.showPoints();
      pupil.showHours();
      System.out.println("The grade point average is " +
         pupil.getGradePoint());
   }
}


