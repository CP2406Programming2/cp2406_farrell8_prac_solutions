import java.util.*;
public class BabyNameComparison
{
   public static void main(String[] args)
   {
      String name1, name2, name3;
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a name >> ");
      name1 = in.nextLine();
      System.out.print("Enter a second name >> ");
      name2 = in.nextLine();
      System.out.print("Enter a third name >> ");
      name3 = in.nextLine();
      System.out.println("The combinations are:");
      System.out.println(name1 + " " + name2);
      System.out.println(name1 + " " + name3);
      System.out.println(name2 + " " + name1);
      System.out.println(name2 + " " + name3);
      System.out.println(name3 + " " + name1);
      System.out.println(name3 + " " + name2);
  }
}