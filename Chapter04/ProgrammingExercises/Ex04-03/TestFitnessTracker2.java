import java.time.*;
public class TestFitnessTracker2
{
   public static void main(String[] args)
   { 
      FitnessTracker2 exercise = new FitnessTracker2();

      System.out.println(exercise.getActivity() + " " + exercise.getMinutes() +
         " minutes on " + exercise.getDate());

      // code to test constructor added for exercise 3b
 
      LocalDate date = LocalDate.of(2015, 8, 20);
      FitnessTracker2 exercise2 = new FitnessTracker2("bicycling", 35, date);

      System.out.println(exercise2.getActivity() + " " + exercise2.getMinutes() +
         " minutes on " + exercise2.getDate());
   }
}