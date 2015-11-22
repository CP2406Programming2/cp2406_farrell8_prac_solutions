import java.util.*;
public class TwoEventParticipants
{
   public static void main(String[] args)
   {
      Participant marathoners[] = new Participant[7];
      Participant divers[] = new Participant[7];
      int i, j;
      String name;
      int age;
      String address;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter mini-marathon participants");
      for(i = 0; i < marathoners.length; ++i)
      {
          System.out.print("Enter name: ");
          name = input.nextLine();          
          System.out.print("Enter age: ");
          age = input.nextInt();
          input.nextLine();
          System.out.print("Enter address: ");
          address = input.nextLine();
          marathoners[i] = new Participant(name, age, address);
      }
      System.out.println("\nEnter diving participants");
      for(i = 0; i < divers.length; ++i)
      {
          System.out.print("Enter name: ");
          name = input.nextLine();          
          System.out.print("Enter age: ");
          age = input.nextInt();
          input.nextLine();
          System.out.print("Enter address: ");
          address = input.nextLine();
          divers[i] = new Participant(name, age, address);
      }   
      System.out.println("\nParticipants who are in both events:");
      for(i = 0; i < marathoners.length; ++i)
         for(j = 0; j < divers.length; ++j)
            if(marathoners[i].equals(divers[j]))
               System.out.println(marathoners[i].toString());  
   }
}