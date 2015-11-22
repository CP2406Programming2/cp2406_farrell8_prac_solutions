public abstract class Insurance
{
   protected String type;
   protected double cost;
   public Insurance(String lh)
   {
      type = lh;
   }
   public String getType()
   {
      return type;
   }
   public double getCost()
   {
      return cost;
   }
   public abstract void setCost();
   public abstract void display();
}
