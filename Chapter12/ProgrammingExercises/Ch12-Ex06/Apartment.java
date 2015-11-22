public class Apartment
{
   String address;
   String aptNum;
   int bedrooms;
   int rent;
   final int APT_NUM_LENGTH = 3;
   final int LOW_BDRMS = 1;
   final int HIGH_BDRMS = 4;
   final int LOW_RENT = 500;
   final int HIGH_RENT = 2500;
   public Apartment()
   {
      address = "";
      aptNum = "";
      bedrooms = 0;
      rent = 0;
   }
   public Apartment(String add, String num, int bdrms, int rentAmt) throws ApartmentException
   {
      boolean isBad = false;
      String msg = "";
      if(num.length() != APT_NUM_LENGTH)
         msg += "\nApt number must be three digits ";
      if(bdrms < LOW_BDRMS || bdrms > HIGH_BDRMS)
         msg += "\nBedrooms out of range ";
      if(rentAmt < LOW_RENT || rentAmt > HIGH_RENT)
         msg += "\nRent out of range ";
      for(int x = 0; x < num.length(); ++x)
         if(!Character.isDigit(num.charAt(x)))
            isBad = true;
      if(isBad)
         msg += "\nNon didgit in apartment number ";
      if(!msg.equals(""))
         throw(new ApartmentException(msg + "\n   " + add + " Apt #" + num +
            "  " + bdrms + " bedrooms. Rent $" + rentAmt));
      address = add;
      aptNum = num;
      bedrooms = bdrms;
      rent = rentAmt;
   }
   public String toString()
   {
      return address + " #" + aptNum + "  " + bedrooms  +
        " bedrooms. Rent $" + rent;
   }
}