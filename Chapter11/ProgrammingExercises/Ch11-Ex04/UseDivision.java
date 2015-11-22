public abstract class UseDivision
{
   public static void main(String[] args)
   {
      DomesticDivision abcDomDiv = new 
        DomesticDivision("Sales", 123, "California");
      DomesticDivision xyzDomDiv = new
      DomesticDivision("Technology", 234, "Kansas");
      InternationalDivision abcIntDiv = new
        InternationalDivision("Technology", 345, "Germany", "German");
      InternationalDivision xyzIntDiv = new 
        InternationalDivision("Marketing", 456, "Japan",
         "Japanese");
      abcDomDiv.display();
      xyzDomDiv.display();
      abcIntDiv.display();
      xyzIntDiv.display();
   }
}

