import javax.swing.*;
class MeanMedian
{
   public static void main(String[] args)
   {
      int[] nums = new int[5];
      String entry;
      String list = "You entered: ";
      int a, b;
      int temp;
      int midPos;
      int total = 0;
      double mean;
      for(a = 0; a < nums.length; ++a)
      {
         entry = JOptionPane.showInputDialog(null,
           "Enter number " + (a + 1));
         nums[a] = Integer.parseInt(entry);
         total += nums[a];
         if(a == 0)
            list += nums[a];
         else
            list += ",  " + nums[a];
      }
      System.out.println(list);
      int comparisonsToMake = nums.length - 1;
      for(a = 0; a < nums.length - 1; ++a)
      {
         for(b = 0; b < comparisonsToMake; ++b)
         {
            if(nums[b] > nums[b + 1])
            {
               temp = nums[b];
               nums[b] = nums[b + 1];
               nums[b + 1] = temp;
            }
         }
         --comparisonsToMake;
      }
      midPos = nums.length / 2;
      mean = total * 1.0 / nums.length;
      System.out.println("The mean is " + mean +
         " and the median is " + nums[midPos]);

   }
}
   