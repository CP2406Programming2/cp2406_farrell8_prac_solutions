// A Vacation is 10 days
// but an ExtendedVacation is 30 days
public class FixDebugTen2
{
   public static void main(String args[]) 
   {
      FixDebugVacation myVacation = new FixDebugVacation();
      FixDebugExtendedVacation yourVacation =
         new FixDebugExtendedVacation();
      System.out.println("My vacation is for " +
         myVacation.getDays() + " days");
      System.out.println("Your vacation is for " +
         yourVacation.getDays() + " days");
   }
}
