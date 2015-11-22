public class Square extends GeometricFigure
{
   private double area;
   public Square(int w, int h, String f)
   {
     super(w, h, f);
   }

   public double figureArea(int w, int h)
   {
     area = (double)(w * h);
     return area;
   }
}