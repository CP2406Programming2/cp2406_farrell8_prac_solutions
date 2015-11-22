public class DiagonalOs
{
   public static void main(String[] args)
   {
      final char O_CHAR = 'O';
      final char SPACE = ' ';
      final int ROWS = 10;
      int spaces = 0;
      int a, b;
      for(a = 0; a < ROWS; ++a)
      {
         for(b = 0; b < spaces; ++b)
            System.out.print(SPACE);
         System.out.println(O_CHAR);
         spaces++;
      }
   }
}