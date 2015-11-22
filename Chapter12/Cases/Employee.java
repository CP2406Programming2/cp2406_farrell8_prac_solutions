public abstract class Employee
{
   private String employeeNumber;
   private String lastName;
   private String firstName;
   protected double payRate;
   protected String jobTitle;
   public void setEmployeeNumber(String num)
   {
     employeeNumber = num;
   }
   public void setLastName(String name)
   {
      lastName = name;
   }
   public void setFirstName(String name)
   {
      firstName = name;
   }
   public String getEmployeeNumber()
   {
      return employeeNumber;
   }
   public String getName()
   {
      return firstName + " " + lastName;
   }
   public double getPayRate()
   {
      return payRate;
   }
   public String getJobTitle()
   {
      return jobTitle;
   }
   public abstract void setPayRate(double rate);
   public abstract void setJobTitle();
}