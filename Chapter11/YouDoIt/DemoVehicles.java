import javax.swing.*;
public class DemoVehicles
{
   public static void main(String[] args) 
   {
      Sailboat aBoat = new Sailboat();
      Bicycle aBike = new Bicycle();
      JOptionPane.showMessageDialog(null,
        "\nVehicle descriptions:\n" +
        aBoat.toString() + "\n" + aBike.toString());
   }
}
