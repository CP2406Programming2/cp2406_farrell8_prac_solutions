public class ImprecisionDemo
{
   public static void main(String[] args)
   {
       double answer = 2.20 - 2.00;
       boolean isEqual = answer == 0.20;
       System.out.println("answer is " + answer);
       System.out.println("isEqual is " + isEqual);
   }
}