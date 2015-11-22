abstract class Equipment
{
   public static final String[] EQUIP_TYPES = 
      {"jet ski", "pontoon boat", "rowboat",
       "canoe", "kayak", "beach chair",
       "umbrella", "other"};
   public final static int HIGH = 4;
   public static final double[] FEES =
      {50, 40, 15, 12, 10, 2, 1, 0};
   private int equipType;
   private String equipName;
   protected double fee;
   public Equipment(int equipmentType)
   {
      if(equipType < EQUIP_TYPES.length)
         equipType = equipmentType;
      else
         equipType = EQUIP_TYPES.length - 1;
   }
   public int getEquipType()
   {
      return equipType;
   }
   public String getEquipName()
   {
      return equipName;
   }
   public double getFee()
   {
      return fee;
   }
   protected void setEquipType(int eType)
   {
      equipType = eType;
   }
   protected void setName()
   {
      equipName = EQUIP_TYPES[equipType];
   }
   protected void setFee()
   {
      fee = FEES[equipType];
   }
   public abstract String getLessonMessage();
}
      
   

       
      
