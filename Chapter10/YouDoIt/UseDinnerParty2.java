import java.util.*;
public class UseDinnerParty2
{
   public static void main(String[] args)
   {
      int guests;
      int choice;
      Party aParty = new Party();
      DinnerParty2 aDinnerParty = new DinnerParty2();
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter number of guests for the party >> ");
      guests = keyboard.nextInt();
      aParty.setGuests(guests);
      System.out.println("The party has " + aParty.getGuests() + " guests");
      aParty.displayInvitation();
      System.out.print("Enter number of guests for the dinner party >> ");
      guests = keyboard.nextInt();
      aDinnerParty.setGuests(guests);
      System.out.print("Enter the menu option -- 1 for chicken or 2 for beef >> ");
      choice = keyboard.nextInt();
      aDinnerParty.setDinnerChoice(choice);
      System.out.println("The dinner party has " + aDinnerParty.getGuests() + " guests");
      System.out.println("Menu option " + aDinnerParty.getDinnerChoice() + " will be served");
      aDinnerParty.displayInvitation();
   }
}
