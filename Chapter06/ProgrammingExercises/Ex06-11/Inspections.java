public class Inspections
{
   public static void main(String[] args)
   {
      int  factory;
      int week;
      final int WEEKS = 52;
      final int FACTORIES = 4;
      int count1 = 0;
      int count2 = 0;
      int count3 = 0;
      int count4 = 0;
      double pct1;
      double pct2;
      double pct3;
      double pct4;
      for(week = 1; week <= WEEKS; ++week)
      {
         factory = 1 + (int) (Math.random() * FACTORIES);
         if(factory  == 1)
         {
            display(factory);
            ++count1;
         }
         else
         {
            if(factory == 2)
            {
               display(factory);
               ++count2;
            }
            else
            {
               if(factory == 3)
               {
                  display(factory);
                  ++count3;
               }
               else
               {
                  display(factory);
                  ++count4;
               }
            }
         }
      }
      pct1 = count1 * 100.0 / WEEKS;
      pct2 = count2 * 100.0 / WEEKS;
      pct3 = count3 * 100.0 / WEEKS;
      pct4 = count4 * 100.0 / WEEKS;  
      System.out.println("\nFactory 1: " + pct1 + "%");
      System.out.println("Factory 2: " + pct2 + "%");
      System.out.println("Factory 3: " + pct3 + "%");
      System.out.println("Factory 4: " + pct4 + "%");
   }
   public static void display(int f)
   {
       System.out.print(f + "  ");
   }
}