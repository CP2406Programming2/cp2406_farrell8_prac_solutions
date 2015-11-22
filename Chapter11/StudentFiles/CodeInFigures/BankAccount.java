public class BankAccount
{
   private int acctNum;
   private double balance;
   public BankAccount(int num, double bal)
   {
      acctNum = num;
      balance = bal;
   }
   @Override
   public String toString()
   {
      String info = "BankAccount acctNum = " + acctNum +
        "   Balance = $" + balance;
      return info;
   }
   public boolean equals(BankAccount secondAcct)
   {
      boolean result;
      if(acctNum == secondAcct.acctNum && balance == secondAcct.balance)
        result = true;
      else
        result = false;
      return result;
   }
}
