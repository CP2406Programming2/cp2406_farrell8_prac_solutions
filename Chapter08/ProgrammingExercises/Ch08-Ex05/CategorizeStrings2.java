import java.util.*;
public class CategorizeStrings2
{
   public static void main (String[] args)
   {
      final int MAX = 10;
      final int CUTOFF = 10;
      final String QUIT = "ZZZ";
      String entry;
      int spaces;
      int oneWordSub = 0;
      int twoWordsSub = 0;
      int threeWordsSub = 0;
      Scanner input = new Scanner(System.in);
      String[] oneWord = new String[MAX];
      String[] twoWords = new String[MAX];
      String[] threeWords = new String[MAX];

      System.out.print("Enter a string or " +
         QUIT + " to quit >> ");
      entry = input.nextLine();
      while(!entry.equals(QUIT) && (oneWordSub + twoWordsSub + threeWordsSub < MAX))
      {
         spaces = 0;
         for(int x = 0; x < entry.length(); ++x)
         {
            if(entry.charAt(x) == ' ')
               ++spaces;
         }
         if(spaces == 0)
         {
            oneWord[oneWordSub] = entry;
            ++oneWordSub;
         }
         else
            if(spaces == 1)
            {
               twoWords[twoWordsSub] = entry;
               ++twoWordsSub;
            }
            else
            {
                threeWords[threeWordsSub] = entry;
                ++threeWordsSub;
            }
        if(oneWordSub + twoWordsSub + threeWordsSub < MAX)
        {
           System.out.print("Enter a string or " +
               QUIT + " to quit >> ");
           entry = input.nextLine();
        }
     }
     System.out.println("\nDo you want to see the list of" +
        "\n    one-word strings," +
        " two-word strings, or longer strings?");
     System.out.print("   Please enter O, T, or L, or " +
        QUIT + " to quit >> ");
     entry = input.nextLine();
     while(!entry.equals(QUIT))
     {
       String letter = entry.substring(0,1).toLowerCase();
       if(letter.equals("o"))
          display(oneWord, oneWordSub, "one-word");
       else
          if(letter.equals("t"))
             display(twoWords, twoWordsSub, "two-word");
          else
             if(letter.equals("l"))
                 display(threeWords, threeWordsSub, "longer");
             else
             {
                 display(oneWord, oneWordSub, "one-word");
                 display(twoWords, twoWordsSub, "two-word");
                 display(threeWords, threeWordsSub, "longer");
             }
       System.out.println("\nDo you want to see the list of" +
          "\n    one-word strings," +
          " two-word strings, or longer strings?");
        System.out.print("   Please enter O, T, or L, or " +
            QUIT + " to quit >> ");
        entry = input.nextLine();
     }
   }
   public static void display(String[] array, int max, String msg)
   {
      System.out.println("\nList of " + msg + " strings:");
      if(max == 0)
         System.out.println("The list is empty");
      else
         for(int x = 0; x < max; ++x)
            System.out.println(array[x]); 
   }
}

