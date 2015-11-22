public class Square2 extends GeometricFigure2
{
  private double area;
  public Square2(int w, int h, String f)
  {
     super(w, h, f);
  }
  public double figureArea(int w, int h)
  {
     area = (double)(w * h);
    return area;
  }
  public void displaySides()
  {
     System.out.println("This figure has four sides");
  }
}
