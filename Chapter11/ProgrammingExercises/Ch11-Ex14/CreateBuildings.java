import com.course.buildings.School;
import com.course.buildings.House;
import com.course.buildings.Building;
public class CreateBuildings
{
   public static void main(String[] args)
   {
      Building aBuilding = new Building();
      House aHouse = new House();
      School aSchool = new School();
      aBuilding.setSqFeet(10000);
      aBuilding.setStories(1);
      aHouse.setSqFeet(1800);
      aHouse.setStories(2);
      aHouse.setBedrooms(3);
      aHouse.setBaths(2);  
      aSchool.setSqFeet(3500);
      aSchool.setStories(3);
      aSchool.setClassrooms(48);
      aSchool.setGradeLevel("High");
      System.out.println("The Buliding:\n" + 
         aBuilding.getSqFeet() + " square feet\n" +
         aBuilding.getStories() + " stories\n");
      System.out.println("\nThe House:\n" +
         aHouse.getSqFeet() + " square feet\n" +
         aHouse.getStories() + " stories\n" +
         aHouse.getBedrooms() + " bedrooms and " +
         aHouse.getBaths() + " bathrooms\n");
      System.out.println("\nThe School:\n" +
         aSchool.getSqFeet() + " square feet\n" +
         aSchool.getStories() + " stories\n" +
         aSchool.getClassrooms() + " classrooms. It's a " +
         aSchool.getGradeLevel() + " school\n"); 
   }
}
   
