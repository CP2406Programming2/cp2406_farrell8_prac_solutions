public class TestDogs
{
   public static void main(String[] args)
   {
      DogTriathlonParticipant dog1 =
        new DogTriathlonParticipant("Bowser", 2, 85, 89, 0);
      dog1.display();
      DogTriathlonParticipant dog2 =
        new DogTriathlonParticipant("Rush", 3, 78, 72, 80);
      dog2.display();
      DogTriathlonParticipant dog3 =
        new DogTriathlonParticipant("Ginger", 3, 90, 86, 72);
      dog3.display();
   }
}
