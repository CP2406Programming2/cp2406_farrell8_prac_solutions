// BookstoreCredit.java
// Chapter 3,Exercise 6
import java.util.Scanner;
public class BookstoreCredit
{
  public static void main (String args[])
  {
     String name;
     double gpa;
     Scanner input = new Scanner(System.in);
     System.out.print("Enter your name >> ");
     name = input.nextLine();
     System.out.print("Enter your gpa >>");
     gpa = input.nextDouble();
     computeDiscount(name, gpa);
  }

  public static void computeDiscount(String name, double gpa)
  {
     double discount;
     final double FACTOR = 10;
     discount = gpa * FACTOR;
     System.out.println(name + ", your  GPA is " + gpa +
        ", so your discount is $" + discount);
  }

  public static void convertToLiters(int gallons)
  {
     double liters;
     final double LITER_FACTOR = 3.7854;
     liters = gallons * LITER_FACTOR;
     System.out.println(gallons + " gallons is " + liters + " liters");
  }

}
