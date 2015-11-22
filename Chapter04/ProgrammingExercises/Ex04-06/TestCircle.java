class TestCircle
{
  public static void main (String args[])
  {
      Circle a = new Circle();
      Circle b = new Circle();
      Circle c = new Circle();

      a.setRadius(1.5);
      b.setRadius(1500.50);

      System.out.println("The area of a is " +
          a.getArea());
      System.out.println("The diameter of a is " +
          a.getDiameter());
      System.out.println("The area of b is "      +
          b.getArea());
      System.out.println("The diameter of b is " +
          b.getDiameter());
      System.out.println("The area of c is " +
          c.getArea());
      System.out.println("The diameter of c is " +
          c.getDiameter());
  }
}


