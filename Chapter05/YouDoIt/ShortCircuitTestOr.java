public class ShortCircuitTestOr
{
   public static void main(String[] args)
   {
      if(falseMethod() || trueMethod())
         System.out.println("Both are true");
       else
         System.out.println("Both are not true");  
   }
   public static boolean trueMethod()
   {
      System.out.println("True method");
      return true;
   }
   public static boolean falseMethod()
   {
      System.out.println("False method");
      return false;
   }
}
