public class PartyWithConstructor
{
   private int guests;
   public int getGuests()
   {
      return guests; 
   }
   public PartyWithConstructor()
   {
      System.out.println("Creating a Party");
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
