public class InsuredPackage extends Package
{
   InsuredPackage(int w, char m)
   {
      super(w, m);
      final double LOWCOST = 1.01;
      final double MEDCOST = 3.01;
      final double LOWINS = 2.45;
      final double MEDINS = 3.95;
      final double HIGHINS = 5.55;
      double i;
      if(getCost() < LOWCOST)
         i = LOWINS;
      else
         if(getCost() < MEDCOST)
            i = MEDINS;
         else
            i = HIGHINS;
      increaseCost(i);
   }
}
