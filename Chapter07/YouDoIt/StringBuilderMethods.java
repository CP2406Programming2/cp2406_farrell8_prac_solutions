public class StringBuilderMethods
{
   public static void main(String[] args)
   {
      StringBuilder str = new StringBuilder("singing");
      System.out.println(str);
      str.append(" in the dead of ");
      System.out.println(str);
      str.insert(0, "Black");
      System.out.println(str);
      str.insert(5, "bird ");
      System.out.println(str);
      str.append("night");
      System.out.println(str);
   }
}