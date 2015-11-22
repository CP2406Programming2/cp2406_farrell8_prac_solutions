class EquipmentWithoutLesson extends Equipment
{
   public static final String MSG = 
     "\nThis type of rental does not require a lesson.";
   EquipmentWithoutLesson(int equipmentType)
   {
      super(equipmentType);
      if(equipmentType > HIGH)
         setEquipType(equipmentType);
      else
         setEquipType(EQUIP_TYPES.length - 1);
      setName();
      setFee();
   }
   public String getLessonMessage()
   {
      return MSG;
   }
} 