public class WhenProfitable
{
   public static void main (String[] args)
   {
      int year;
      int yearInBlack = -1;
      double profit = 20_000;
      double expenses = 35_000;
      double netProfit;
      final double PROFIT_INCREASE = 0.10;
      final double EXPENSES_INCREASE = 0.04;
      final int YEARS = 20;
      for(year = 1; year <= YEARS; ++year)
      {
         profit = profit + profit * PROFIT_INCREASE;
         expenses = expenses + expenses * EXPENSES_INCREASE;
         netProfit = profit - expenses;
         if(netProfit > 0 && yearInBlack < 0)
            yearInBlack = year;
         System.out.println("Year " + year + "     Gross predicted profit is " +
            profit + "\n          Predicted expenses are " + expenses);
         System.out.println("          Net profit is " + netProfit);
      }
      System.out.println("\nThe year in which the business was first profitable in year " + yearInBlack);
   }
}

