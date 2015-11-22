public class Sandwich
{
   private Bread bread;
   private SandwichFilling filling;
   public Sandwich(String bread, int breadCal, String filling, int fillingCal)
   {
      this.bread = new Bread(bread, breadCal);
      this.filling = new SandwichFilling(filling, fillingCal);
   }
   public Bread getBread()
   {
      return bread;
   }
   public SandwichFilling getSandwichFilling()
   {
      return filling;
   }
}