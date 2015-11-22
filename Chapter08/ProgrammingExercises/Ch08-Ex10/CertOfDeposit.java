import java.time.*;
public class CertOfDeposit
{
   private String certNum;
   private String lastName;
   private double balance;
   private LocalDate issueDate;
   private LocalDate maturityDate;
   public CertOfDeposit(String num, String name, double bal, LocalDate issue)
   {
      certNum = num;
      lastName = name;
      balance = bal;
      issueDate = issue;
      maturityDate = issue.plusYears(1);
   }
   public void setCertNum(String n)
   {
      certNum = n;
   }
   public void setName(String name)
   {
      lastName = name;
   }
   public void setBalance(double bal)
   {
       balance = bal;
   }
   public void issueDate(LocalDate date)
   {
      issueDate = date;
   }
   public String getCertNum()
   {
      return certNum;
   }
   public String getName()
   {
     return lastName;
   }
   public double getBalance()
   {
      return balance;
   }
   public LocalDate getIssueDate()
   {
      return issueDate;
   }
   public LocalDate getMaturityDate()
   {
      return maturityDate;
   }
}
