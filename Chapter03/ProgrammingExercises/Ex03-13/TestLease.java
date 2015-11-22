// TestLease.java
import java.util.Scanner;
class TestLease
{
   public static void main (String args[])
   {
     Lease lease1;
     Lease lease2;
     Lease lease3;
     Lease lease4 = new Lease();
     lease1 = getData();
     lease2 = getData(); 
     lease3 = getData();
     showValues(lease1);
     lease1.addPetFee();
     showValues(lease1);
     showValues(lease2);
     showValues(lease3);
     showValues(lease4);
   }
   public static void showValues(Lease ls)
   {
      System.out.println("\n\nYour lease results:" +
         "\nName      : " + ls.getName() +
         "\nApartment : " + ls.getAptNumber() +
         "\nRent      : " + ls.getRent() +
         "\nTerm      : " + ls.getTerm());
   }
   public static Lease getData()
   {
       String name;
       int apt;
       double rent;
       int term;
       Scanner input = new Scanner(System.in);
       System.out.print("\nEnter lessee name >> ");
       name = input.nextLine();
       System.out.print("Enter apartment number >> ");
       apt = input.nextInt();
       System.out.print("Enter rent >> ");
       rent = input.nextDouble();
       System.out.print("Enter lease term in months >> ");
       term = input.nextInt();
       input.nextLine();
       Lease temp = new Lease();
       temp.setName(name);
       temp.setAptNumber(apt);
       temp.setRent(rent);
       temp.setTerm(term);
       return temp;
   }
}


