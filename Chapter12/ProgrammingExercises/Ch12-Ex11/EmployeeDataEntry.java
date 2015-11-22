import java.util.*;
public class EmployeeDataEntry
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      int empNumber;
      double payRate;
      int code = 0;
      try
      {
         code = 1;
         System.out.print("Enter employee number ");
         empNumber = kb.nextInt();
         code = 4;
         System.out.print("Enter hourly pay rate ");
         payRate = kb.nextDouble();
         code = 0;
         check(empNumber, payRate);
         System.out.println(EmployeeMessages.MESSAGES[code]);   
     }
     catch(InputMismatchException ex)
     {
        System.out.println(EmployeeMessages.MESSAGES[code]);
     }
     catch(EmployeeException ex)
     {
        System.out.println("Some data was out of range");
        System.out.println(ex.getMessage());
     }
   }
   public static void check(int num, double rate) throws EmployeeException
   {
      final int LOWNUM = 1000;
      final int HIGHNUM = 9999;
      final double LOWRATE = 9;
      final double HIGHRATE = 25;
      int code;
      code = 2;
      if(num < LOWNUM)  
          throw(new EmployeeException(EmployeeMessages.MESSAGES[code]));
      code = 3;
      if(num > HIGHNUM)
          throw(new EmployeeException(EmployeeMessages.MESSAGES[code]));
      code = 5;
      if(rate < LOWRATE)
	  throw (new EmployeeException(EmployeeMessages.MESSAGES[code]));
      code = 6;
      if(rate > HIGHRATE)
         throw (new EmployeeException(EmployeeMessages.MESSAGES[code]));
   }
}
