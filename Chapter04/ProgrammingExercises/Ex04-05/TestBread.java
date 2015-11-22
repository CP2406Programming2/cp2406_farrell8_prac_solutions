public class TestBread
{
   public static void main(String[] args)
   {
      Bread bread1 = new Bread("rye", 120);
      Bread bread2 = new Bread("wheat", 95);
      Bread bread3 = new Bread("white", 100);
      display(bread1);
      display(bread2);
      display(bread3);
   }
   public static void display(Bread b)
   {
      System.out.println("The " + b.getBreadType() + " bread has " +
         b.getCaloriesPerSlice() + " calories per slice");
      System.out.println("   The bread motto is " + b.MOTTO);
   }
}
