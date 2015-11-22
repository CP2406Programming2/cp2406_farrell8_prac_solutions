public abstract class NewspaperSubscription
{
   protected String name;
   protected String address;
   protected double rate;
   public String getName()
   {
      return name;
   }
   public void setName(String n)
   {
      name = n;
   }
   public String getAddress()
   {
      return address;
   }
   public double getRate()
   {
      return rate;
   }
   public abstract void setAddress(String s);
}

