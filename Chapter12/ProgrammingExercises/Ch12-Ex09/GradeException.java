public class GradeException extends Exception
{
   public static final char[] VALID_GRADES = 
      {'A', 'B', 'C', 'D', 'F', 'I'};
   public GradeException(String string)
   {
      super(string);
   }
}