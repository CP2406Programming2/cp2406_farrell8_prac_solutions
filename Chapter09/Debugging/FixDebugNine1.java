// Looks up author of selected books
import javax.swing.*;
class FixDebugNine1
{
   public static void main(String[] args)
   {
      String[][] books = new String[6][2]; 
      books[0][0] = "Ulysses";
      books[0][1] = "James Joyce";
      books[1][0] = "Lolita";
      books[1][1] = "Vladimir Nabokov";
      books[2][0] = "Huckleberry Finn";
      books[2][1] = "Mark Twain";
      books[3][0] = "Great Gatsby";
      books[3][1] = "F. Scott Fitzgerald";
      books[4][0] = "1984";
      books[4][1] = "George Orwell";
      books[5][0] = "Sound and the Fury";
      books[5][1] = "William Faulkner";

      String entry,
         shortEntry,
         message ="Enter the first three characters of a book title omitting \"A\" or \"The\" ";
      int num, x;
      boolean isFound = false;
      while(!isFound)
      {
         entry = JOptionPane.showInputDialog(null, message);
         shortEntry = entry.substring(0,3);
         for(x = 0; x < books.length; ++x)
            if(books[x][0].startsWith(shortEntry))
            {
             isFound = true;
             JOptionPane.showMessageDialog(null,
                books[x][0] + " was written by " + books[x][1]);
             x = books.length;
            }
         if(!isFound)
            JOptionPane.showMessageDialog(null, "Sorry - no such book in our database");
      }
   }
}
   