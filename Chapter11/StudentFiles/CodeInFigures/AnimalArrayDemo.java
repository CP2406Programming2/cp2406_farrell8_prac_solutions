public class AnimalArrayDemo
{
   public static void main(String[] args)
   {
      Animal[] animalRef = new Animal[3];
      animalRef[0] = new Dog();
      animalRef[1] = new Cow();
      animalRef[2] = new Snake();
      for(int x = 0; x < animalRef.length; ++x)
         animalRef[x].speak();
   }
}
