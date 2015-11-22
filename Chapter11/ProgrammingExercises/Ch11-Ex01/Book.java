public abstract class Book
{
   String title = new String();
   double price;
   public Book(String t)
   {
      title = t;
   }
   public String getTitle()
   {
      return title;
   }
   public double getPrice()
   {
      return price;
   }
   public abstract void setPrice();
}
