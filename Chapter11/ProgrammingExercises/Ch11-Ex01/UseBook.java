public class UseBook
{
   public static void main(String[] args)
   {
      Fiction aNovel = new Fiction("Huckelberry Finn");
      NonFiction aManual = new
         NonFiction("Elements of Style");
      System.out.println("Fiction " +
        aNovel.getTitle() + " costs $" +
        aNovel.getPrice());
      System.out.println("Non-Fiction " +
        aManual.getTitle() + " costs $" +
        aManual.getPrice());
   }
}
