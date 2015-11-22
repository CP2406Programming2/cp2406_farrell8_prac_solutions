class Event
{
   public final static double HIGH_GUEST_PRICE = 35.00;
   public final static double LOW_GUEST_PRICE = 32.00;  
   public final static int LARGE_EVENT = 50;
   private String eventNumber;
   private int guests;
   private double pricePerGuest;
   private double priceForEvent;
   public Event()
   {
      this("A000", 0);
   }
   public Event(String num, int guests)
   {
      setEventNumber(num);
      setGuests(guests);
   }
   public void setEventNumber(String num)
   {
      eventNumber = num;
   }
   public void setGuests(int gsts)
   {
      guests = gsts;
      if(isLargeEvent())
      {
         pricePerGuest = LOW_GUEST_PRICE;
         priceForEvent = guests * LOW_GUEST_PRICE;
      }
      else
      {
         pricePerGuest = HIGH_GUEST_PRICE;
         priceForEvent = guests * HIGH_GUEST_PRICE;
      }
   }
   public String getEventNumber()
   {
      return eventNumber;
   }
   public int getGuests()
   {
      return guests;
   }
   public double getPriceForEvent()
   {
      return priceForEvent;
   }
   public double getPricePerGuest()
   {
      return pricePerGuest;
   }
   public boolean isLargeEvent()
   {
      boolean isLarge = false;
      if(guests >= LARGE_EVENT)
         isLarge = true;
      return isLarge;
   }

}
