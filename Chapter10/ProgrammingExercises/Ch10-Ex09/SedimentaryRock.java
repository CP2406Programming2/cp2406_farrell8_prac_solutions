public class SedimentaryRock extends Rock
{
   public SedimentaryRock(int num, double grams)
   {
      super(num, grams);
      setDescription("Sedimentary rocks are called secondary, " +
        "\nbecause they are often the result of the accumulation " +
        "\nof small pieces broken off of pre-existing rocks.");
   }
}
