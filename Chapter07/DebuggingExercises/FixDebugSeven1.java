// Makes String comparisons
public class FixDebugSeven1
{
   public static void main(String[] args)
   {
      String name1 = "Roger";
      String name2 = "Roger";
      String name3 = "Stacy";

      if(name1.equals(name2))
        System.out.println(name1 + " and " + name2 +
          " are the same");
      if(name1.equals(name3))
        System.out.println(name1 + " and " + name3 +
          " are the same");
      if(name1.equals("roger"))
        System.out.println(name1 + " and 'roger' are the same");
      if(name1.equals("Roger"))
        System.out.println(name1 + " and 'Roger' are the same");
   }
}
