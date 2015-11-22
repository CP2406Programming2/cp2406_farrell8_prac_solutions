public class ThrowApartmentException
{
   public static void main(String[] args)
   {
      Apartment[] apts = new Apartment[6];
      String[] addresses = {"123 Elm", "123 Oak", "223 Elm", "223 Oak", "333 Elm", "333 Oak"};
      String[] aptNums = {"324", "2121", "A23", "212", "103", "912"};
      int[] bdrms ={3, 2, 1, 0, 5, 2};
      int[] rents = {900, 1200, 2600, 1000, 20000, 40};
      int x;
      for(x = 0; x < apts.length; ++x)
         apts[x] = new Apartment();
      for(x = 0; x < apts.length; ++x)
         try
         {
            apts[x] = new Apartment(addresses[x], aptNums[x], bdrms[x], rents[x]);
         }
         catch(ApartmentException error)
         {
            System.out.println("Error: " + error.getMessage());
         }
      System.out.println("\nApartment values");
      for(x = 0; x < apts.length; ++x)
         System.out.println(apts[x].toString());
   }
}