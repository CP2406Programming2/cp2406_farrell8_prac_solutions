import java.util.*;
public class Alphabetize
{
  public static void main(String[] args)
  {
     String str1, str2, str3;
     Scanner in = new Scanner(System.in);
     System.out.print("Enter first string >> ");
     str1 = in.nextLine();
     System.out.print("Enter second string >> ");
     str2 = in.nextLine();
     System.out.print("Enter third string >> ");
     str3 = in.nextLine();
     if(str1.toLowerCase().compareTo(str2.toLowerCase()) < 0 &&
       str2.toLowerCase().compareTo(str3.toLowerCase()) < 0)
        System.out.println("You entered the strings in alphabetical order");
     else
        System.out.println("You did not enter the words in alphabetical order");
  }
}