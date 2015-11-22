public class DeclareTwoEmployees
{
   public static void main(String[] args)
   {
      Employee clerk = new Employee();
      Employee driver = new Employee();
      clerk.setEmpNum(345);
      driver.setEmpNum(567);
      System.out.println("The clerk's number is " +
        clerk.getEmpNum() + " and the driver's number is " +
        driver.getEmpNum());
   }
}
