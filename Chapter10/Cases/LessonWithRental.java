class LessonWithRental extends Rental
{
   public static final String[] INSTRUCTOR =
      {"Falon", "Brody", "Dustin", "Kai", "Paige", "Summer", "Laine", "Rachel"};
   private boolean lessonRequired;
   public LessonWithRental( String num, int minutes, int eType)
   {
      super(num, minutes);
      setEquipType(eType);
      if(eType == 0 || eType == 1)
        lessonRequired = true;
      else
        lessonRequired = false;
   }
   public String getInstructor()
   {
      String msg = "A lesson when renting a " + getEquipTypeString() + " is ";
      if(!lessonRequired)
         msg += "not ";
      msg += "required. The instructor is " + INSTRUCTOR[getEquipType()] + ".";
      return msg;
   }
} 
