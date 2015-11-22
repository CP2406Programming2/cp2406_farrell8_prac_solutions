public class GraduateStudent extends Student
{
   public static final double GRAD_TUITION = 6000;
   public GraduateStudent(String id, String name)
   {
      super(id, name);
      setTuition();  
   }
   public void setTuition()
   {
      tuition = GRAD_TUITION;
   }
}
