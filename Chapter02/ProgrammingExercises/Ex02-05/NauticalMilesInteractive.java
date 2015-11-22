// NauticalMilesInteractive.java

import java.util.Scanner;
class NauticalMilesInteractive
{
   public static void main(String[] args)
   {
      final double KM_IN_NAUTICAL_MILE = 1.852;
      final double MILES_IN_NAUTICAL_MILE = 1.150779;
      double nauticalMiles;
      double km;
      double miles;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number of nautical miles >> ");
      nauticalMiles = input.nextDouble();
      km = nauticalMiles * KM_IN_NAUTICAL_MILE;
      miles = nauticalMiles * MILES_IN_NAUTICAL_MILE;
      System.out.println(nauticalMiles + " nautical miles equals " +
         km + " kilometers or " + miles + " miles.");
   }
}