import java.util.Scanner;
public class EnteringIntegers
{
   public static void main(String[] args)
   {
      int[] numberList = {0, 0, 0, 0, 0, 0};
      int x;
      Scanner input = new Scanner(System.in);
      for(x = 0; x < numberList.length; ++x)
      {
         try
         {
            System.out.print("Enter an integer >> ");
            numberList[x] = input.nextInt();
         }
         catch(Exception e)
         {
            System.out.println("Exception occurred");
         }
         // input.nextLine();  
      }
      System.out.print("The numbers are: ");
      for(x = 0; x < numberList.length; ++x)
         System.out.print(numberList[x] + " ");
      System.out.println();
   }
}
      