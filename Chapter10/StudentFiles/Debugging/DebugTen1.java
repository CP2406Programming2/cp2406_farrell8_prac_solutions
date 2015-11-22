// A Play has a title and author
// A Musical is a Play that also has a composer

public class DebugTen1
{
   public static void main(String args[])
   {
      DebugPlay performance1 = 
        DebugPlay("Death of a Salesman", "Arthur Miller");
      DebugMusical performance2 =  
        DebugMusical("Guys and Dolls", "Jo Swerling", "Frank Loesser");
      performance1.display();
      performance2.display();
   }
}
