// Creates and displays an array of boats -
// some are rowboats; some are ocean liners
import javax.swing.*;
public class FixDebugEleven4
{
   static FixDebugBoat[] boatArray = new FixDebugBoat[5];
   public static void main(String[] args) 
   {
      buildArray();
      displayArray();
   }
   public static void buildArray()
   {
     //declare x as int in for loop
     char boatType;
     for(int x = 0; x < boatArray.length; ++x)
     {
        boatType = getBoat();
        if(boatType =='r')
    	  //need keyword 'new' for each instantiation
 	     boatArray[x] = new FixDebugRowboat();
        else
          boatArray[x] = new FixDebugOceanLiner();
     }
   }
   public static char getBoat()
   {
      String boatType;
      boatType = JOptionPane.showInputDialog(null, 
         "Enter r for rowboat; o for ocean liner ");
      return boatType.charAt(0);
   }
   public static void displayArray()
   {
      //increment x in for loop
      for(int x = 0; x < boatArray.length; ++x)
      JOptionPane.showMessageDialog(null, "Boat #" + (x  + 1) +
         boatArray[x].toString());
   }
}
