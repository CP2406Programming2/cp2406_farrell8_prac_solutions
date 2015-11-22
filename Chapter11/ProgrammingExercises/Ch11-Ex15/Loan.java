public abstract class Loan implements LoanConstants
{
   protected int loanNum;
   protected String lastName;
   protected double amount;
   protected double rate;
   protected int term;
   public Loan(int num, String name, double amt, int yrs)
   {
       loanNum = num;
       lastName = name;
       if(amt > MAXLOAN)
          amount = MAXLOAN;
       else
          amount = amt; 
          if(yrs == SHORT_TERM || yrs == MEDIUM_TERM || yrs == LONG_TERM) 
             term = yrs;
          else
              term = SHORT_TERM;
   }
   public String toString()
   {
      int r = (int)(rate * 100);
      return "Loan #"  + loanNum + "   Name: " +
        lastName + "  $" + amount + "\n for " +
        term + " year(s) at " + r + "% interest";
    }
   
   public boolean equals(Loan loan)
   {
     boolean returnVal = false;
     if(loanNum ==  loan.loanNum)
       returnVal = true;
     return returnVal;
   }
}