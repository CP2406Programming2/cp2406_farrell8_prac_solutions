public class StudentDemo
{
   public static void main(String[] args)
   {
      Student students[] = new Student[6];
      int i;
      students[0] = new UndergraduateStudent("111", "Lambert");
      students[1] = new UndergraduateStudent("122", "Lembeck");
      students[2] = new GraduateStudent("233", "Miller");
      students[3] = new GraduateStudent("256", "Marmon");
      students[4] = new StudentAtLarge("312", "Nichols");
      students[5] = new StudentAtLarge("376", "Nussbaum");
      for(i = 0; i < students.length; ++i)
         System.out.println("\nStudent # " +
            students[i].getId() + " Name: " +
            students[i].getLastName() + "  Tuition: " +
            students[i].getTuition() + " per year");
   }
}