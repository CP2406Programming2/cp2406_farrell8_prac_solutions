import java.util.*;
public class DemoRocks
{
   public static void main(String[] args)
   {
      Rock r1 = new Rock(123, 4.5);
      IgneousRock r2 = new IgneousRock(234, 14.9);
      SedimentaryRock r3 = new SedimentaryRock(345, 18.3);
      MetamorphicRock r4 = new MetamorphicRock(456, 7.0);
      display(r1);
      display(r2);
      display(r3);
      display(r4);
}
   public static void display(Rock r)
   {
      System.out.println("\nSample # " + r.getSampleNumber() + " weighs "+
         r.getWeight());
      System.out.println("Description:   " + r.getDescription());
   }
}