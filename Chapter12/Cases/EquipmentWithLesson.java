class EquipmentWithLesson extends Equipment
{
   public static final double LESSON_FEE = 27;
   double tempFee;
   EquipmentWithLesson(int equipmentType)
   {
      super(equipmentType);
      if(equipmentType <= HIGH)
         setEquipType(equipmentType);
      else
         setEquipType(EQUIP_TYPES.length - 1);
      setName();
      setFee();
      tempFee = fee;
      fee += LESSON_FEE;
   }
   public String getLessonMessage()
   {
      return "This type of rental requires a lesson for $" +
        LESSON_FEE + ".";
   }
}
      
   