// Two boats should be equal
// if they hold the same number of passengers
// and also have the same power source
public class FixDebugEleven3
{
   public static void main(String args[])
   {
      FixDebugRowboat redBoat = new FixDebugRowboat();
      FixDebugRowboat blueBoat = new FixDebugRowboat();
      System.out.print("The two boats are");
      if(redBoat == blueBoat)
         System.out.println(" equal");
      else
	 System.out.println(" not equal");
   }
}
