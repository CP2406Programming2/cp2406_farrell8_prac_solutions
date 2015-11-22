public class UseGeometric2
{
   public static void main(String[] args)
   {
      double area;
      int height;
      int width;
      String figureType;
      GeometricFigure2[] figure = new GeometricFigure2[4];
      Square2 f0 =  new Square2(5, 5, "Square");
      Triangle2 f1 = new Triangle2(5, 5, "Triangle");
      Square2 f2 = new Square2(10, 10, "Square");
      Triangle2 f3 = new Triangle2(10, 10, "Triangle");
 
      figure[0] = f0;
      figure[1] = f1;
      figure[2] = f2;
      figure[3] = f3;
 
      for(int i = 0; i < figure.length; i++)
      {
         height=figure[i].getHeight();
         width=figure[i].getWidth();
         figureType=figure[i].getFigure();
         area=figure[i].figureArea(height, width);
         System.out.println("The " + figureType + " with height = " +
            height + " and with width = " + width + " has an area of " +
            area);
         figure[i].displaySides();
      }
   }
}


