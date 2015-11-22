public class TestBloodData
{
   public static void main(String[] args)
   {
       BloodData b1 = new BloodData();
       BloodData b2 = new BloodData("A", "-");
       display(b1);
       display(b2);
       b1.setBloodType("AB");
       b1.setRhFactor("-");
       display(b1);
   }
   public static void display(BloodData b)
   {
      System.out.println("The blood is type " + b.getBloodType() + b.getRhFactor());
   }

}