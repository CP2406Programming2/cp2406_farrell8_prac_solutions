import java.time.*;
public class Person
{
   private String firstName;
   private String lastName;
   private LocalDate birthDate;
   public Person(String first, String last, LocalDate date)
   {
      firstName = first;
      lastName = last;
      birthDate = date;
   }

   public String getFirstName()
   {
      return firstName;
   }
   public String getLastName()
   {
     return lastName;
   }
   public LocalDate getBirthDate()
   {
      return birthDate;
   }
}
