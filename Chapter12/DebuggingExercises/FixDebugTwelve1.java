// This class determines the logarithm of a number
public class FixDebugTwelve1
{
  public static void main(String[] args) throws ArithmeticException
  {
     double num = -8.8, result;
     try
     {
        if(num <= 0)
           throw(new ArithmeticException());
        result = Math.log(num);
        System.out.println("Result is " + result);
     }
     // need an argument to the catch() method
     catch(ArithmeticException error)
     {
        System.out.println("Can't take logarithm for value of zero or lower");
     }
  }
}