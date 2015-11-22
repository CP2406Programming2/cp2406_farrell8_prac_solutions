import java.util.Scanner;
public class EnumDemo2
{
   enum Property {SINGLE_FAMILY, MULTIPLE_FAMILY,
      CONDOMINIUM, LAND, BUSINESS};

   public static void main(String[] args)
   {
      Property propForSale = Property.MULTIPLE_FAMILY;
      switch(propForSale)
      {
         case SINGLE_FAMILY: 
         case MULTIPLE_FAMILY:
            System.out.println("Listing fee is 5%");
            break;
         case CONDOMINIUM:
            System.out.println("Listing fee is 6%");
            break;
         case LAND:
         case BUSINESS:
            System.out.println
               ("We do not handle this type of property");
      }
   }
}
