import java.util.Scanner;
import java.io.IOException;
public class ImprovedCalculatorDemo
{
    public static void main(String[] args) throws IOException
    {
       Scanner input = new Scanner(System.in);
       Process proc = Runtime.getRuntime().exec
          ("cmd /c C:\\Windows\\System32\\calc.exe");
       final int MAX = 10000;
       final int TIMES = 5;
       int num1;
       int num2;
       int answer;
       int usersAnswer;
       for(int count = 0; count < TIMES; ++ count)
       {
           try
           {
              num1 = 1 + (int)(Math.random() * MAX);
              num2 = 1 + (int)(Math.random() * MAX);
              answer = num1 + num2;
              System.out.print("What is the sum of " + num1 +
                 " and " + num2 + "? >> ");
              usersAnswer = input.nextInt();
              if(usersAnswer == answer)
                 System.out.println("Correct!");
              else
              System.out.println("Sorry - the answer is " + answer);
           }
           catch (Exception e)
           {
              System.out.print("Invalid answer.");
              if(count < TIMES - 1)
                 System.out.println(" Try again.");input.nextLine();
           }
      }
   }
}