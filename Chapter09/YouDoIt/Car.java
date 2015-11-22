public class Car
{
   private int year;
   private Model model;
   private Color color;
   public Car(int yr, Model m, Color c)
   {
      year = yr;
      model = m;
      color = c;
   }
   public void display()
   {
      System.out.println("Car is a " + year +
         " " + color + " " + model);
   }
}
