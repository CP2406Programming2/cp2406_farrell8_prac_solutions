import java.util.Scanner;
public class Division
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int numerator, denominator, result;
      System.out.print("Enter numerator >> ");
      numerator = input.nextInt();
      System.out.print("Enter denominator >> ");
      denominator = input.nextInt();
      result = numerator / denominator;
      System.out.println(numerator + " / " + denominator +
         " = " + result);
   }
}
