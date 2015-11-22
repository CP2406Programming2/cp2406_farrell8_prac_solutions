public abstract class GeometricFigure2 implements SidedObject
{
   protected int height;
   protected int width;
   protected String figure;

   public  GeometricFigure2(int h, int w, String f)
   {
      height = h;
      width = w;
      figure = f;
   }

   public int getHeight()
   {
      return height;
   }

   public int getWidth()
   {
      return width;
   }

   public String getFigure()
   {
      return figure;
   }

   public abstract double figureArea(int h, int w);
}