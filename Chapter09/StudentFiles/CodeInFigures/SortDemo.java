import javax.swing.*;
class SortDemo
{
   public static void main(String[] args)
   {
      int[] someNums = new int[8];
      String entry;
      String originalList = "Original list: ";
      String revisedList =  "Sorted list:   ";
      int a, b, temp;
      for(a = 0; a < someNums.length; ++a)
      {
         entry = JOptionPane.showInputDialog(null,
           "Enter number " + (a + 1));
         someNums[a] = Integer.parseInt(entry);
         originalList += someNums[a] + " ";
      }
      int comparisonsToMake = someNums.length - 1;
      for(a = 0; a < someNums.length - 1; ++a)
      {
         for(b = 0; b < comparisonsToMake; ++b)
         {
            if(someNums[b] > someNums[b + 1])
            {
               temp = someNums[b];
               someNums[b] = someNums[b + 1];
               someNums[b + 1] = temp;
            }
         }
         --comparisonsToMake;
      }
      for(a = 0; a < someNums.length; ++a)
         revisedList += someNums[a] + " ";
      JOptionPane.showMessageDialog(null,
         originalList + "\n" + revisedList);

   }
}
   