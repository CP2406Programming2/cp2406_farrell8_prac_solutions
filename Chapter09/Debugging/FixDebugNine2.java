import javax.swing.*;
public class FixDebugNine2
{
   public static void main(String[] args)
   {
      Movie[] movies = new Movie[8];
      int i;
      String message, entry;
      movies[0] = new Movie("The Godfather", 1972);
      movies[1] = new Movie("The Good, the Bad, and the Ugly", 1966);
      movies[2] = new Movie("Pulp Fiction", 1994);
      movies[3] = new Movie("Shindler's List", 1993);
      movies[4] = new Movie("Casablanca", 1942);
      movies[5] = new Movie("Wizard of Oz", 1939);
      movies[6] = new Movie("Citizen Kane", 1941);
      movies[7] = new Movie("Some Like It Hot", 1959);
      entry = JOptionPane.showInputDialog(null,
        "Sort Movies by\n(N)ame, or (Y)ear");
      if(entry.charAt(0) == 'N')
      {
         nameSort(movies);
         message = "Sorted by Name\n";
      }
      else
      {
          yearSort(movies);
          message = "Sorted by Year\n";
      }   
      display(movies, message);
   }
   public static void nameSort(Movie[] array)
   {
      int a, b;
      Movie temp;
      int highSub = array.length - 1;
      for(a = 0; a < highSub; ++a)
      {
         for(b = 0; b < highSub; ++b)
	 {
             String first = array[b].getName();
             String second = array[b + 1].getName();
             if(first.compareTo(second) > 0)
	     {
	        temp = array[b];
	        array[b] = array[b + 1];
	        array[b + 1] = temp;
	     }
	  }
       }
    }
    public static void yearSort(Movie[] array)
    {
        int a, b;
        Movie temp;
        int highSub = array.length - 1;
        for (a = 0; a < highSub; ++a)
        {
           for (b = 0; b < highSub; ++b)
           if (array[b].getYear() > array[b + 1].getYear())
           {
              temp = array[b];
              array[b] = array[b + 1];
              array[b + 1] = temp;
           }
        }
     }
     public static void display(Movie[] s,  String msg)
     {
        int len = s.length;
        for (int i = 0; i < len; i++)
           msg = msg + s[i].getName() + ", " + s[i].getYear() + "\n";
        JOptionPane.showMessageDialog(null, msg);
     }
}
