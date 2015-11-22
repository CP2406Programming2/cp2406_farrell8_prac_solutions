public class Participant
{
   private String name;
   private int age;
   private String address;
   public Participant(String n, int a, String add)
   {
      name = n;
      age = a;
      address = add;
   }
   public String getName()
   {
      return name;
   }
   public int getAge()
   {
      return age;
   }
   public String getAddress()
   {
      return address;
   }
   public String toString()
   {
      return name + " " + age + " years old    " + address;
   }
   public boolean equals(Participant p)
   {
      boolean areEqual = false;
      if(name.equals(p.getName()))
         if(age == p.getAge())
            if(address.equals(p.getAddress()))
               areEqual = true;
      return areEqual;
   }
}
