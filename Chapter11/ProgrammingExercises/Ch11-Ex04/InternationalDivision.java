public class InternationalDivision extends Division
{
   protected String country;
   protected String language;
   public InternationalDivision(String title, int acct, String cty, String lang)
   {
      super(title, acct);
      country = cty;
      language = lang;
   }
   public void display()
   {
      System.out.println("International Division: " + divisionTitle +
         "  Acct #" + acctNum + "\nLocated in " + country +
         " Language is " + language);
   }
}

