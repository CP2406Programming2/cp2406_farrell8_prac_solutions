public class CountByThrees
{
   public static void main (String args[])
   {
      final int START = 3;
      final int STOP = 300;
      final int NUMBER_PER_LINE = 30;
      for(int i = START; i <= STOP; i += START)
      {
         System.out.print(i + "  ");
         if(i % NUMBER_PER_LINE == 0)
            System.out.println();
      }
   }
}


