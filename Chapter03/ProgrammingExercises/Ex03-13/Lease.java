// Lease.java
// Chapter 3,Exercise 13
// Creates a class to store data about a lease
class Lease
{
   private String name;
   private int aptNumber;
   private double rent;
   private int term;
   private static final int FEE = 10;

   public Lease()
   {
      name = "XXX";
      aptNumber = 0;
      rent = 1000;
      term = 12;
   }

   public void setName(String tenant)
   {
      name = tenant;
   }

   public void setAptNumber(int apt)
   {
      aptNumber = apt;
   }

   public void setRent(double monthRent)
   {
      rent = monthRent;
   }

   public void setTerm(int t)
   {
      term = t;
   }

   public String getName()
   {
      return name;
   }

   public int getAptNumber()
   {
      return aptNumber;
   }

   public double getRent()
   {
      return rent;
   }

   public int getTerm()
   {
      return term;
   }

   public void addPetFee()
   {
      rent = rent + FEE;
      explainPetPolicy();
   }

   public static void explainPetPolicy()
   {
      System.out.println("\nA pet fee of $" + FEE +
         " is addd to the monthly rent.");
   }

}
