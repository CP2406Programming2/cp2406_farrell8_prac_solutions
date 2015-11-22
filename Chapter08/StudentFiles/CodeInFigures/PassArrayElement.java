public class PassArrayElement
{
   public static void main(String[] args)
   {
      final int NUM_ELEMENTS = 4;
      int[] someNums = {5, 10, 15, 20};
      int x;
      System.out.print("At start of main: ");
      for(x = 0; x < NUM_ELEMENTS; ++x)
         System.out.print(" " + someNums[x] );
      System.out.println();
      for(x = 0; x < NUM_ELEMENTS; ++x)
         methodGetsOneInt(someNums[x]);
      System.out.print("At end of main: ");
      for(x = 0; x < NUM_ELEMENTS; ++x)
         System.out.print(" " + someNums[x]);
      System.out.println();
   }
   public static void methodGetsOneInt(int one)
   {
      System.out.print("At start of method one is: " + one);
      one = 999;
      System.out.println(" and at end of method one is: " + one);
   }
}
