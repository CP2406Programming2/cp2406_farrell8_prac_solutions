public class Automobile
{
   private int id;
   private String make;
   private String model;
   private String color;
   private int year;
   private double mpg;
   public Automobile(int id, String make, String model, String color,
      int year, double mpg)
   {
      setId(id);
      setMake(make);
      setModel(model);
      setColor(color);
      setYear(year);
      setMpg(mpg);
   }
   public void setId(int id)
   {
      final int MAX_ID = 9999;
      if(id < 0 || id > MAX_ID)
         this.id = 0;
      else
         this.id = id;
   }
   public void setMake(String make)
   {
      this.make = make;
   }
   public void setModel(String model)
   {
      this.model = model;
   }
   public void setColor(String color)
   {
      this.color = color;
   }
   public void setYear(int yr)
   {
      final int MAX_YEAR = 2017;
      final int MIN_YEAR = 2000;
      if(yr < MIN_YEAR || yr > MAX_YEAR)
         year = 0;
      else
         year = yr;
   }
   public void setMpg(double mpg)
   {
      final double MIN_MPG = 10;
      final double MAX_MPG = 60;
      if(mpg < MIN_MPG || mpg > MAX_MPG)
         this.mpg = 0;
      else
         this.mpg = mpg;
   }
   public int getId()
   {
      return id;
   }
   public String getMake()
   {
      return make;
   }
   public String getModel()
   {
      return model;
   }
   public String getColor()
   {
      return color;
   }
   public int getYear()
   {
      return year;
   }
   public double getMpg()
   {
      return mpg;
   }
}