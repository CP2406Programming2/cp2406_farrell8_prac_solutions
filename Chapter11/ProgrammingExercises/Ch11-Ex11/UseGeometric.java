public class UseGeometric
{
   public static void main(String[] args)
   {
      double area;
      int height;
      int width;
      String figureType;
      GeometricFigure[] figure = new GeometricFigure[4];
      Square f0 =  new Square(5, 5, "Square");
      Triangle f1 = new Triangle(5, 5, "Triangle");
      Square f2 = new Square(10, 10, "Square");
      Triangle f3= new Triangle(10, 10, "Triangle");

      figure[0] = f0;
      figure[1] = f1;
      figure[2] = f2;
      figure[3] = f3;

      for(int i = 0; i < figure.length; i++)
      {
         height = figure[i].getHeight();
         width = figure[i].getWidth();
         figureType = figure[i].getFigure();
         area = figure[i].figureArea(height, width);
         System.out.println("The "+ figureType + " with height = " +
            height + " and with width = " + width + " has an area of " + area);
      }
   }
}