import javax.swing.*;
public class UsedCar
{
   String vin;
   String make;
   int year;
   int mileage;
   int price;
   public final static String DEFAULT_VIN = "999";
   final int VIN_NUM_LENGTH = 4;
   final int LOW_YEAR = 1990;
   final int HIGH_YEAR = 2014;
   final String[] MAKES = {"Ford", "Honda", "Toyota", "Chrysler", "Other"};
   public UsedCar(String num, String carMake,
      int carYear, int miles, int pr) throws UsedCarException
   {
      boolean isBad = false;
      boolean isGoodMake = false;
      int x;
      if(num.length() != VIN_NUM_LENGTH)
         isBad = true;
      for(x = 0; x < num.length(); ++x)
         if(!Character.isDigit(num.charAt(x)))
            isBad = true;
      for(x = 0; x < MAKES.length; ++x)
         if(carMake.equals(MAKES[x]))
            isGoodMake = true;
      if(!isGoodMake)
         isBad = true;
      if(carYear < LOW_YEAR || carYear > HIGH_YEAR ||
         miles < 0 || pr < 0)
            isBad = true;
      if(isBad)
         throw(new UsedCarException("Error in used car #" + num));
      vin = num;
      make = carMake;
      year = carYear;
      mileage = miles;
      price = pr;
   }
   public UsedCar()
   {
      vin = DEFAULT_VIN;
      make = "XXX";
   }
   public String getVin()
   {
      return vin;
   }
   public String toString()
   {
      return "VIN " + vin + "  Make: " + make +
         "\n   Year: " + year + "  " + mileage + " miles   $" +
         price;
   } 
}