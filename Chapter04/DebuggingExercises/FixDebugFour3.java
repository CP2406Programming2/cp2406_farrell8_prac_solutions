// This class uses a FixDebugBox class to instantiate two Box objects
public class FixDebugFour3
{
   public static void main(String args[])
   {
      int width = 12,
      length = 10,
      height = 8;
      FixDebugBox box1 = new FixDebugBox();
      FixDebugBox box2 = new FixDebugBox(width, length, height);
      System.out.println("The dimensions of the first box are");
      box1.showData();
      System.out.print("  The volume of the first box is ");
      showVolume(box1);
      System.out.println("The dimensions of the second box are");
      box2.showData();
      System.out.print("  The volume of the second box is ");
      showVolume(box2);
   }
   public static void showVolume(FixDebugBox aBox)
   {
      double vol = aBox.getVolume();
      System.out.println(vol);
   }
}
