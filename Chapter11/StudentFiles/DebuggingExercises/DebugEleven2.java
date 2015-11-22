// An array for different boat types
public class DebugEleven2
{
   public static void main(String[] args)
   {
      DebugBoat[] ref = FixDebugBoat[3];
      DebugRowboat blueBoat = DebugRowboat();
      DebugRowboat redBoat = DebugRowboat();
      DebugOceanLiner bigBoat = DebugOceanLiner();
      ref[0] = redBoat;
      ref[1] = blueBoat;
      ref[1] = bigBoat;
      for(int x = 0; x < refLength; ++x)
      {
         ref[x].setPassengers();
         ref[x].setPower();
         ref[x].toString();
      }
   }
}
