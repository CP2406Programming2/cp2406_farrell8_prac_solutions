public class ThrowUsedCarException
{
   public static void main(String[] args)
   {
      UsedCar[] cars = new UsedCar[7];
      String[] vins = {"1234", "2345", "234Q", "12345", "3333", "3123", "9823"};
      String[] makes = {"Ford", "Toyota", "Chrysler", "Other", "Ford", "BMW", "Other"};
      int[] years ={2008, 1975, 2011, 2015, 2010, 2013, 2013};
      int[] mileages = {90000, 120000, 26000, 1000, -2, 20000, 35000};
      int[] prices = {12000, 8000, -200, 5000, 10000, 14000, 9000}; 
      int x;
      for(x = 0; x < cars.length; ++x)
         cars[x] = new UsedCar();
      for(x = 0; x < cars.length; ++x)
         try
         {
            cars[x] = new UsedCar(vins[x], makes[x], years[x], mileages[x], prices[x]);
         }
         catch(UsedCarException error)
         {
            System.out.println("Error: " + error.getMessage());
         }
      System.out.println("\nGood used car values");
      for(x = 0; x < cars.length; ++x)
         if(!cars[x].getVin().equals(UsedCar.DEFAULT_VIN))
            System.out.println(cars[x].toString());
   }
}