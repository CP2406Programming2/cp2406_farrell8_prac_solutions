class Rental
{
   public final int MINUTES_IN_HOUR = 60;
   public final int HOUR_RATE = 40;
   private String contractNumber;
   private int hours;
   private int extraMinutes;
   private double price;
   public void setContractNumber(String num)
   {
      contractNumber = num;
   }
   public void setHoursAndMinutes(int minutes)
   {
      hours = minutes / MINUTES_IN_HOUR;
      extraMinutes = minutes % MINUTES_IN_HOUR;
      price = hours * HOUR_RATE + extraMinutes;
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
