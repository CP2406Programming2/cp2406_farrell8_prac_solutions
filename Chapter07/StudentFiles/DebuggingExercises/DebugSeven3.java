// Program displays some facts about a string
public class DebugSeven3
{
   public static void main(String[] args)
   { 
      String quote =
        "Honesty is the first chapter in the book of wisdom. - Thomas Jefferson";

      System.out.println("index.of('f') is: " + indexOf('f'));
      System.out.println("index.of('x') is: " + indexOf('x'));
      System.out.println("char.At(5) is: " + charAt(5));
      System.out.println("endsWith(\"daughter\") is: " + quote.endswith("daughter"));
      System.out.println("endsWith(\"son\") is: " + quote.endswith("son"));
      System.out.println("replace('e', '*') is: " + quote.replace('e', 'M'));
   }
}