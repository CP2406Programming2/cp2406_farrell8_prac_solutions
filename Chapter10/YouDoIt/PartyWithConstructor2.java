public class PartyWithConstructor2
{
   private int guests;
   public int getGuests()
   {
      return guests; 
   }
   public PartyWithConstructor2(int numGuests)
   {
      guests = numGuests;
   }
   public void setGuests(int numGuests)
   {
      guests = numGuests;
   }
   public void displayInvitation()
   {
      System.out.println("Please come to my party!");
   }
}
