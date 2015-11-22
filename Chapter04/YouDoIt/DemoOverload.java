public class DemoOverload
{
   public static void main(String[] args)
   {
     int month = 6, day = 24, year = 2017;
     displayDate(month);
     displayDate(month, day);
     displayDate(month, day, year);
   }
   public static void displayDate(int mm)
   {
     System.out.println("Event date " + mm + "/1/2016");
   }
   public static void displayDate(int mm, int dd)
   {
      System.out.println("Event date " + mm + "/" +
         dd + "/2016");
   }
   public static void displayDate(int mm, int dd, int yy)
   {
     System.out.println("Event date " + mm + "/" + 
        dd + "/" + yy);
   }
}
