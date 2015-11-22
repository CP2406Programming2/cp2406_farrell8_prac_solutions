import java.time.*;
public class LocalDateDemo
{
   public static void main(String[] args)
   {
      LocalDate today = LocalDate.now();
      LocalDate graduationDate = LocalDate.of(2018, 5, 29);
      System.out.println("Today is " + today);
      System.out.println("Graduation is " + graduationDate);
   }
}
