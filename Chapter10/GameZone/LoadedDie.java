public class LoadedDie extends Die
{
   private static final int HIGHEST_DIE_VALUE = 6;
   private static final int LOWEST_DIE_VALUE = 2;
   public LoadedDie()
   {
      value = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE +
        LOWEST_DIE_VALUE);
   }
}