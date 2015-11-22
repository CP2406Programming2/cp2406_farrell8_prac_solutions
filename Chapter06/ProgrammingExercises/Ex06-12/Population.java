public class Population
{
   public static void main(String[] args)
   {
      double mexicoPop = 121;
      double usPop = 315;
      final double MEXICO_RATE = .0101;
      final double US_RATE = .0015;
      int year = 0;
      System.out.println("   " + "Mexico population         U.S. Population");
      while(usPop > mexicoPop)
      {
          mexicoPop = mexicoPop + mexicoPop * MEXICO_RATE;
          usPop = usPop - usPop * US_RATE;
          ++year;
         System.out.println(year + " " + mexicoPop + " million   " + usPop + " million");
      }
      System.out.println("The population of Mexico will exceed the U.S. population in " + year + " years");
      System.out.println("The population of Mexico will be " + mexicoPop + " million");
      System.out.println("and the population of the U.S. will be " + usPop + " million");
   }
}