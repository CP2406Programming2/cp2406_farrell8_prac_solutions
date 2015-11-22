// A byte can't hold a value higher than 127
// This program throws an ArithmeticException
// if adding two bytes yields a value that is too high
public class FixDebugTwelve2
{
   public static void main(String[] args)
   {
      byte num1 = 120, num2 = 120, result;
      final byte HIGHBYTE = 127;
      try
      {
         // must declare allowed as type byte
         byte allowed = (byte)(HIGHBYTE - num1);
         if(num2 > allowed)
            throw(new ArithmeticException());
         result = (byte)(num1 + num2);
         System.out.println("Result is " + result);
      }
      catch(ArithmeticException error)
      {
         System.out.println("Byte can't hold value higher than " + HIGHBYTE);
      }
   }
}