public class TwoCharacters
{
   public static void main(String[] args)
   {
      int age;
      int legs;
      int eyes;
      int yourValue;
      MyCharacter char1 = new MyCharacter();
      MyCharacter char2 = new MyCharacter();
      age = ((int)(Math.random() * 100) + 1);
      legs = ((int)(Math.random() * 100) + 1);
      eyes = ((int)(Math.random() * 100) + 1);
      char1.setAge(age);
      char1.setLegs(legs);
      char1.setEyes(eyes);
      age = ((int)(Math.random() * 100) + 1);
      legs = ((int)(Math.random() * 100) + 1);
      eyes = ((int)(Math.random() * 100) + 1);
      char2.setAge(age);
      char2.setLegs(legs);
      char2.setEyes(eyes);
      display(char1);
      display(char2);
    }
    public static void display(MyCharacter ch)
    {
      System.out.println("The character is " + ch.getAge() +
         " years old, has " + ch.getLegs() + " legs and " +
         ch.getEyes() + " eyes");
    }
}
