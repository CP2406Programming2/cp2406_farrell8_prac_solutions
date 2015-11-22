public class DemoSalesperson
{
   public static void main (String args[])
   {
      Salesperson[] salesPeople = new Salesperson[10];
      int i;
      for (i = 0; i < salesPeople.length; i++)
         salesPeople[i] = new Salesperson(9999, 0);
      for (i = 0; i < salesPeople.length; i++)
         System.out.println("Salesperson " + i +
	    " has ID #" + salesPeople[i].getId() +
   	    " and annual sales of $" + salesPeople[i].getSales());
   }
}


