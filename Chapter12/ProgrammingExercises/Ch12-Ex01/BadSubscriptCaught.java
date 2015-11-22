import java.util.*;
public class BadSubscriptCaught
{
   public static void main(String[] args)
   {
      String[] names = {"Ariel", "Brad", "Carla", "Donald", "Emily",
        "Fred", "Gina", "Henry", "Iris", "Joe"};
      Scanner keyboard = new Scanner(System.in);
      int number;
      try
      {
         System.out.println("Enter a number, and I will display a name ");
         number = Integer.parseInt(keyboard.nextLine());
         System.out.println("Name is " + names[number]);
      }
      catch(ArrayIndexOutOfBoundsException error)
      {
         System.out.println("Subscript out of range.");
      }
   }
}