public class DemoHorses
{
    public static void main(String args[])
    {
       Horse horse1 = new Horse();
       RaceHorse horse2 = new RaceHorse();
       horse1.setName("Old Paint");
       horse1.setColor("brown");
       horse1.setBirthYear(2009);
       horse2.setName("Champion");
       horse2.setColor("black");
       horse2.setBirthYear(2011);
       horse2.setRaces(4);
       System.out.println(horse1.getName() + " is " +
          horse1.getColor() + " and was born in " + horse1.getBirthYear() + ".");
       System.out.println(horse2.getName() + " is " +
          horse2.getColor() + " and was born in " + horse2.getBirthYear() + ".");
       System.out.println(horse2.getName() + " has been in " + horse2.getRaces() + " races.");
    }
}
