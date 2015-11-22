import javax.swing.*;
public class SalespersonSort
{
   public static void main(String[] args)
   {
      Salesperson[] salespeople = new Salesperson[7];
      int x;
      int id;
      double sales;
      String order;
      String message = "";
      for(x = 0; x < salespeople.length; ++x)
      {
         id = Integer.parseInt(JOptionPane.showInputDialog(null,
            "Enter an ID number"));
         sales = Double.parseDouble(JOptionPane.showInputDialog(null,
            "Enter sales value"));
         salespeople[x] = new Salesperson(id, sales);
      }
      order = JOptionPane.showInputDialog(null,
         "By which field do you want to sort?\n" +
         "(I)d number or (S)ales");       
       if(order.charAt(0) == 'I')
          sortById(salespeople);
       else
          sortBySales(salespeople);
       for(x = 0; x < salespeople.length; ++x)
          message = message + "\nID " + salespeople[x].getId() +
             "  sales: " + salespeople[x].getSales();
       JOptionPane.showMessageDialog(null, message);
    }

    public static void sortById(Salesperson[] array)
    {
       int a,b;
       Salesperson temp;
       int highSubscript = array.length - 1;

       for(a = 0; a < highSubscript; ++a)

          for(b = 0; b < highSubscript; ++b)
          {
             if(array[b].getId() > array[b + 1].getId())
               {
                  temp = array[b];
                  array[b] = array[b + 1];
                  array[b + 1] = temp;
               }
          }
    }

    public static void sortBySales(Salesperson[] array)
    {
       int a,b;
       Salesperson temp;
       int highSubscript = array.length - 1;

       for(a = 0; a < highSubscript; ++a)

          for(b = 0; b < highSubscript; ++b)
          {
             if(array[b].getSales() > array[b + 1].getSales())
               {
                  temp = array[b];
                  array[b] = array[b + 1];
                  array[b + 1] = temp;
               }
          }
    }
}