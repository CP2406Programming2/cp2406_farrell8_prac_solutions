import java.util.*;
public class CountMovieSpaces2
{
  public static void main(String[] args)
  {
     String aString;
     int stringLength;
     Scanner in = new Scanner(System.in);
     int numSpaces = 0;
     System.out.print("Enter a movie quote >> ");
     aString = in.nextLine();
     stringLength = aString.length();

     for(int i = 0; i < stringLength; i++)
     {
        char ch = aString.charAt(i);
        if(ch == ' ')
           numSpaces++;
     }
     System.out.println("The number of spaces is " + numSpaces);
  }
}