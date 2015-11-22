public class NameAndAddress
{
   private String name;
   private String address;
   private int zipCode;
   public NameAndAddress(String nm, String add, int zip)
   {
      name = nm;
      address = add;
      zipCode = zip;
   }
   public void display()
   {
      System.out.println(name);
      System.out.println(address);
      System.out.println(zipCode);
   }
}
