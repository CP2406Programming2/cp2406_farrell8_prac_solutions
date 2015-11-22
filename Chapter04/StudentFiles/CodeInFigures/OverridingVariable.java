public class OverridingVariable
{
   public static void main(String[] args)
   {
      int aNumber = 10;
      System.out.println("In main(), aNumber is " + aNumber);
      firstMethod();
      System.out.println("Back in main(), aNumber is " + aNumber);
      secondMethod(aNumber);
      System.out.println("Back in main() again, aNumber is " + aNumber);
   }
   public static void firstMethod()
   {
      int aNumber = 77;
      System.out.println("In firstMethod(), aNumber is "
         + aNumber);
   }
   public static void secondMethod(int aNumber)
   {
      System.out.println("In secondMethod(), at first " +
         "aNumber is " + aNumber);
      aNumber = 862;
      System.out.println("In secondMethod(), after an assignment " +
         "aNumber is " + aNumber);
   }
}
