import java.util.Scanner;
public class BarChart
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      int artPoints;
      int bobPoints;
      int calPoints;
      int danPoints;
      System.out.print("Enter points earned by Art >> ");
      artPoints = input.nextInt();
      System.out.print("Enter points earned by Bob >> ");
      bobPoints = input.nextInt();
      System.out.print("Enter points earned by Cal >> ");
      calPoints = input.nextInt();
      System.out.print("Enter points earned by Dan >> ");
      danPoints = input.nextInt();
      System.out.println("\nPoints for Game\n");
      drawChart("Art", artPoints);
      drawChart("Bob", bobPoints);
      drawChart("Cal", calPoints);
      drawChart("Dan", danPoints);
   }
   public static void drawChart(String name, int points)
   {
      System.out.print(name + "  ");
      for(int x = 0; x < points; ++x)
         System.out.print("*");
      System.out.println();
   }
}

