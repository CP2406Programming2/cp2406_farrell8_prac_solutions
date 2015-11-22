public class CarInsurancePolicy2 
{
   private int policyNumber;
   private int numPayments;
   private String residentCity;
   public CarInsurancePolicy2(int num, int payments, String city)
   {
      policyNumber = num;
      numPayments = payments;
      residentCity = city;
   }
   public CarInsurancePolicy2(int num, int payments)
   {
      this(num, payments, "Mayfield");
   }
   public CarInsurancePolicy2(int num)
   {
      this(num, 2);
   }
   public void display()
   {
      System.out.println("Policy #" + policyNumber + ". " +
         numPayments + " payments annually. Driver resides in " +
         residentCity + ".");
   }
}
