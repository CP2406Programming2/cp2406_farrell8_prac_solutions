public class CollegeCourse
{
   private String courseID;
   private int credits;  
   private char grade;
   public String getID()
   {
      return courseID;
   }
   public int getCredits()
   {
      return credits;
   }
   public char getGrade()
   {
      return grade;
   }
   public void setID(String idNum)
   {
      courseID = idNum;
   }
   public void setCredits(int cr)
   {
      credits = cr;
   }
   public void setGrade(char gr)
   {
      grade = gr;
   }
}