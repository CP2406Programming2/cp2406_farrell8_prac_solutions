public class DemoSubscriptions
{
   public static void main(String args[])
   {
      PhysicalNewspaperSubscription pnsGood = new PhysicalNewspaperSubscription();
      OnlineNewspaperSubscription onsGood = new OnlineNewspaperSubscription();
      PhysicalNewspaperSubscription pnsBad = new PhysicalNewspaperSubscription();
      OnlineNewspaperSubscription onsBad = new OnlineNewspaperSubscription();
      pnsGood.setName("DePalma");
      pnsGood.setAddress("23 Oak Avenue");
      display(pnsGood);
      pnsBad.setName("Gomez");
      pnsBad.setAddress("Maple Street");
      display(pnsBad);      
      onsGood.setName("Carter");
      onsGood.setAddress("carter@myMail.com");
      display(onsGood);
      onsBad.setName("Lee");
      onsBad.setAddress("Elm Street");
      display(onsBad); 
   }
   public static void display(NewspaperSubscription n)
   {
      System.out.println("Name: " + n.getName() + "   Address: " +
         n.getAddress() + "   Rate: " + n.getRate() + "\n");
   }
}

