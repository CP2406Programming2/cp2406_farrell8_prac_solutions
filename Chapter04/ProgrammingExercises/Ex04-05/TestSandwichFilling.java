public class TestSandwichFilling
{
   public static void main(String[] args)
   {
      SandwichFilling sf1 = new SandwichFilling("egg salad", 220);
      SandwichFilling sf2 = new SandwichFilling("ham", 240);
      SandwichFilling sf3 = new SandwichFilling("peanut butter", 280);
      display(sf1);
      display(sf2);
      display(sf3);
   }
   public static void display(SandwichFilling s)
   {
      System.out.println("The " + s.getSandwichFilling() + " filling has " +
         s.getCalories() + " calories");
   }
}
