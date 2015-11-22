class Event
{
   public final static double GUEST_PRICE = 35.00;
   public final static int LARGE_EVENT = 50;
   private String eventNumber;
   private int guests;
   private double price;
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
      price = guests * GUEST_PRICE;
   }
   public String getEventNumber()
   {
      return eventNumber;
   }
   public int getGuests()
   {
      return guests;
   }
   public double getPrice()
   {
      return price;
   }
}
