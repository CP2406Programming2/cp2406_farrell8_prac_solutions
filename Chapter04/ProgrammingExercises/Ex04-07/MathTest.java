public class MathTest
{
  public static void main(String[] args) 
  {
     System.out.println( "The square root of 37 is "  +
        Math.sqrt(37) +
        "\nthe sine of 300 is " + Math.sin(300) +
        "\nthe cosine of 300 is " + Math.cos(300) +
        "\nthe floor of 22.8 is " + Math.floor(22.8) +
        "\nthe ceiling of 22.8 is " + Math.ceil(22.8) +
        "\nthe round of 22.8 is " + Math.round(22.8) +
        "\nthe larger of D and 71 is " + Math.max('D', 71) +
        "\nthe smaller of D and 71 is " + Math.min('D', 71)+
        "\na random number between 0 and 20 is " +
           (Math.random() * 20));
  }
}