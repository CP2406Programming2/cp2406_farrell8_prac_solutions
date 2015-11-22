public class BloodData
{
   private String bloodType;
   private String rhFactor;
   public BloodData()
   {
      this("O", "+");
   }
   public BloodData(String bType, String rh)
   {
      bloodType = bType;
      rhFactor = rh;
   }
   public void setBloodType(String bType)
   {
      bloodType = bType;
   }
   public String getBloodType()
   {
      return bloodType;
   }
   public void setRhFactor(String rh)
   {
      rhFactor = rh;
   }
   public String getRhFactor()
   {
      return rhFactor;
   }
}