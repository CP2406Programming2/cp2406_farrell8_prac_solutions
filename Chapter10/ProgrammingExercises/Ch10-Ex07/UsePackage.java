public class UsePackage
{
   public static void main(String args[])
   {
       Package p1 = new Package(4,'A'),
       p2 = new Package(10,'T'),
       p3 = new Package(20,'M');
       InsuredPackage p4 = new InsuredPackage(4,'A'),
       p5 = new InsuredPackage(10,'T'),
       p6 = new InsuredPackage(20,'M');
       System.out.println("Packages:");
       p1.display();
       p2.display();
       p3.display();
       System.out.println("Insured packages:");
       p4.display();
       p5.display();
       p6.display();
   }
}
