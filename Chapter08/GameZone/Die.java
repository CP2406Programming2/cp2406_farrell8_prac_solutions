public class Die
{
   private int value;
   private static final int HIGHEST_DIE_VALUE = 6;
   private static final int LOWEST_DIE_VALUE = 1;
   public Die()
   {
     value = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE +
        LOWEST_DIE_VALUE);
   }
   public int getValue()
   {
      return value;
   }
}