public class TestSandwich
{
   public static void main(String[] args)
   {
      Sandwich s1 = new Sandwich("pumpernickel", 180, "egg salad", 220);
      Sandwich s2 = new Sandwich("multigrain", 200, "bologna", 260);
      Sandwich s3 = new Sandwich("whole wheat", 150, "grape jelly", 180);
      display(s1);
      display(s2);
      display(s3);
   }
   public static void display(Sandwich s)
   {
      final int SLICES = 2;
      Bread b = s.getBread();
      SandwichFilling sf = s.getSandwichFilling();
      System.out.println("The " + b.getBreadType() + " bread has " +
         b.getCaloriesPerSlice() + " calories per slice");
      System.out.println("  The " + sf.getSandwichFilling() + " filling has " +
         sf.getCalories() + " calories");
      int total = b.getCaloriesPerSlice() * SLICES + sf.getCalories();
      System.out.println("   The sandwich, with " + SLICES +
         " two slices of bread, has " +
         total + " calories");
   }
}
