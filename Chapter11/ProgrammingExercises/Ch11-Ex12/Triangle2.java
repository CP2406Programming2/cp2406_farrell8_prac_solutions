public class Triangle2 extends GeometricFigure2
{
   private double area;
   public Triangle2(int w, int h, String f)
   {
      super(w, h, f);
   }

   public double figureArea(int w, int h)
   {
      area = (double)(w * h * 0.5);
      return area;
   }

   public void displaySides()
   {
      System.out.println("This figure has three sides");
   }
}