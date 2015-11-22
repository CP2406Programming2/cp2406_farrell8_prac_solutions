// Sum and average an array of integers
public class FixDebugEight2
{
   public static void main(String args[])
   {
      int[] someNums = {4, 17, 22, 8, 35};
      int tot = 0;
      int x;
      for(x = 0; x < someNums.length; ++x)
         tot += someNums[x];
      System.out.println("Sum is " + tot);
      System.out.println("Average is " + tot * 1.0 / someNums.length);
   }
}
