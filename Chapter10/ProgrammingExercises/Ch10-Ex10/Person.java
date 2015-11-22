import javax.swing.*;
public class Person
{
   private String firstName;
   private String lastName;
   public String address;
   private String zip;
   private String phone;
   public void setData()
   {
      firstName = JOptionPane.showInputDialog(null,
         "Please enter first name");
      lastName = JOptionPane.showInputDialog(null,
         "Please enter last name");
      address = JOptionPane.showInputDialog(null,
         "Please enter address");
      zip = JOptionPane.showInputDialog(null,
         "Please enter zip code");
      phone = JOptionPane.showInputDialog(null,
         "Please enter phone number");
   }
   public void display()
   {
        System.out.println(firstName + " " + lastName +
            " " + address + " " + zip + " " + phone);
   }
}
