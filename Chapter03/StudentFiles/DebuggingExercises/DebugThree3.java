// This application gets a user's name and displays a greeting
import java.util.Scanner;
public class DebugThree3
{
   public static void main(String args[])
   {
      String name;
      getName();
      displayGreeting(name);           
   }
   public static String getName()
   {
      String name;
      Scanner input = new Scanner(System.in);
      System.out.print(Enter name );
      name = input.nextInt();
      return name;
   }
   public static void displayGreeting()
   {
      System.out.println("Hello, " + name + "!");
   }
}
