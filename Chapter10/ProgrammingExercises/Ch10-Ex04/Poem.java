public class Poem
{
   private String title;
   private int lines;
   public Poem(String name, int numLines)
   {
      title = name;
      lines = numLines;
   }
   public String getTitle()
   {
      return title;
   }
   public int getLines()
   {
      return lines;
   }
}
