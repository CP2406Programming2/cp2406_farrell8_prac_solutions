public class CompareAccounts
{
   public static void main(String[] args)
   {
      BankAccount acct1 = new BankAccount(1234, 500.00);
      BankAccount acct2 = new BankAccount(1234, 500.00);
      if(acct1.equals(acct2))
         System.out.println("Accounts are equal");
      else
         System.out.println("Accounts are not equal");
   }
}
