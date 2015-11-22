public class Apartment
{
   int aptNumber;
   int bedrooms;
   double baths;
   double rent;
   public Apartment(int num, int bdrms, double bths, double rent)
   {
     aptNumber = num;
     bedrooms = bdrms;
     baths = bths;
     this.rent = rent;
   }
   public int getAptNumber()
   {
      return aptNumber;
   }
   public int getBedrooms()
   {
      return bedrooms;
   }
   public double getBaths()
   {
      return baths;
   }
   public double getRent()
   {
      return rent;
   }

}