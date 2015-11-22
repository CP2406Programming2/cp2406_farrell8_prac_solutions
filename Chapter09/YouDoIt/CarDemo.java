public class CarDemo
{
   public static void main(String[] args)
   {
      Car firstCar = new Car(2012, Model.MINIVAN, Color.BLUE);
      Car secondCar = new Car(2014, Model.CONVERTIBLE, Color.RED);
      firstCar.display();
      secondCar.display();  
   }
}
