public class ElectricBlanket extends Blanket
{
   private int settings;
   private boolean hasAutoShutoff;
   private final int MAX_SETTINGS = 5;
   private double shutoffPremium;
   private final double S_PRICE = 5.75;
   public ElectricBlanket()
   {
      settings = 1;
      hasAutoShutoff = false;
      shutoffPremium = 0;
   }
   public int getSettings()
   {
      return settings;
   }
   public boolean getHasAutoShutoff()
   {
      return hasAutoShutoff;
   }
   public void setSettings(int s)
   {
      if(s < 1 || s > MAX_SETTINGS)
         s = 1;
      settings = s;
   }
   public void setHasAutoShutoff(boolean h)
   {
      hasAutoShutoff = h;
      if(h)
      {
         shutoffPremium = S_PRICE;
      }
      else
      {
          shutoffPremium = 0;
      } 
      price = BASE_PRICE + sizePremium + materialPremium + shutoffPremium; 
   }
   public String toString()
   {
      String s;
      s = super.toString();
      if(hasAutoShutoff)
         s += ". Blanket has automatic shutoff";
      else
         s += ". no automatic shutoff";
      s += " and " + settings;
      if(settings == 1)
         s += " setting.";
      else
         s += " settings.";
      return s;
   }
} 
         