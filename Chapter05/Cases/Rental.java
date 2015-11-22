class Rental
{
   public static final int MINUTES_IN_HOUR = 60;
   public static final int HOUR_RATE = 40;
   private String contractNumber;
   private int hours;
   private int extraMinutes;
   private double price;
   public Rental(String num, int minutes)
   {
      setContractNumber(num);
      setHoursAndMinutes(minutes);
   }
   public Rental()
   {
      this("A000", 0);
   }
   public void setContractNumber(String num)
   {
      contractNumber = num;
   }
   public void setHoursAndMinutes(int minutes)
   {
      hours = minutes / MINUTES_IN_HOUR;
      extraMinutes = minutes % MINUTES_IN_HOUR;
      if(extraMinutes <= HOUR_RATE)
         price = hours * HOUR_RATE + extraMinutes;
      else
         price = hours * HOUR_RATE + HOUR_RATE;
   }
   public String getContractNumber()
   {
      return contractNumber;
   }
   public int getHours()
   {
      return hours;
   }
   public int getExtraMinutes()
   {
      return extraMinutes;
   }
   public double getPrice()
   {
      return price;
   }
}
