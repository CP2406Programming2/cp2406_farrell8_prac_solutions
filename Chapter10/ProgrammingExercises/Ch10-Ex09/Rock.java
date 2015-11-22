public class Rock
{
   private int sampleNumber;
   private String description;
   private double weight;
   public Rock(int num, double grams)
   {
      sampleNumber = num;
      weight = grams;
      description = "Unclassified";
   }
   public int getSampleNumber()
   {
      return sampleNumber;
   }
   public String getDescription()
   {
      return description;
   }
   public double getWeight()
   {
      return weight;
   }
   protected void setDescription(String d)
   {
      description = d;
   }
}
