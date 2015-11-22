import java.util.*;
import javax.swing.*;
public class StringSort
{
   public static void main(String[] args)
   {
      String[] values =  {"mouse", "dog", "cat", "horse", "cow",
         "moose", "tiger", "lion", "elephant", "bird", "hamster",
         "guina pig", "leopard", "aardvark", "hummingbird",
         "rat", "pig", "sheep", "bumble bee", "dolphin"}; 
      int x;
      String message = "Values:";
      Arrays.sort(values);
      for(x = 0; x < values.length; ++x)
         message = message + "  " + values[x];
      JOptionPane.showMessageDialog(null, message);
   }
}
   