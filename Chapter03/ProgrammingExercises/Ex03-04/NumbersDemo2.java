// NumbersDemo2.java
// Chapter 3, Exercise 4
// Demonstrates methods
import java.util.Scanner;
public class NumbersDemo2
{
   public static void main (String args[])
   {
      Scanner kb = new Scanner(System.in);
      int num1, num2;
            System.out.print("Enter an integer >> ");
      num1 = kb.nextInt();
      System.out.print("Enter another integer >> ");
      num2 = kb.nextInt();
      displayTwiceTheNumber(num1);
      displayNumberPlusFive(num1);
      displayNumberSquared(num1);
      displayTwiceTheNumber(num2);
      displayNumberPlusFive(num2);
      displayNumberSquared(num2);
   }
   public static void displayTwiceTheNumber(int n)
   {
      final int FACTOR = 2;
      System.out.println(n + " times " + FACTOR + " is " + (n * FACTOR));
   }
   public static void displayNumberPlusFive(int n)
   {
      final int FACTOR = 5;
      System.out.println(n + " plus " + FACTOR + " is " + (n + FACTOR));
   }
   public static void displayNumberSquared(int n)
   {
      System.out.println(n + " squared is " + (n * n)); 
   }
}
