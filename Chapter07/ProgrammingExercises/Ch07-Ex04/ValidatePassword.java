import java.util.*;
public class ValidatePassword
{
  public static void main(String[] args)
  {
     String aString;
     int stringLength;
     final int NUM = 2;
     int upperCount = 0;
     int lowerCount = 0;
     int digitCount = 0;
     int letterCount = 0;
     Scanner in = new Scanner(System.in);
     int numSpaces = 0;
     System.out.print("Enter a string >> ");
     aString = in.nextLine();
     stringLength = aString.length();

     for(int i = 0; i < stringLength; i++)
     {
        char ch = aString.charAt(i);
        if(Character.isUpperCase(ch))
           upperCount++;
        else
           if(Character.isLowerCase(ch))
             lowerCount++;
           else
              if(Character.isDigit(ch))
                 digitCount++;
     }
     if(upperCount >= NUM && lowerCount >= NUM && digitCount >= NUM)
        System.out.println("Valid password");
     else
     {
        System.out.println("The password did not have enough of the following:");
        if(upperCount < NUM)
           System.out.println("uppercase letters");
        if(lowerCount < NUM)
           System.out.println("lowercase letters");
        if(digitCount < NUM)
          System.out.println("digits");
     }
  }
}