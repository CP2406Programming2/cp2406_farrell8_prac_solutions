public class DemoSalesperson2
{
   public static void main (String args[])
   {
      Salesperson[] salesPeople = new Salesperson[10];
      int i;
      int assignId = 111;
      int assignSales = 25000;
      final int SALES_INCREASE = 5000;
      for (i = 0; i < salesPeople.length; i++)
      {
         salesPeople[i] = new Salesperson(assignId, assignSales);
         ++assignId;
         assignSales += SALES_INCREASE;
      }
      for (i = 0; i < salesPeople.length; i++)
         System.out.println("Salesperson " + i +
	    " has ID #" + salesPeople[i].getId() +
   	    " and annual sales of $" + salesPeople[i].getSales());
   }
}


