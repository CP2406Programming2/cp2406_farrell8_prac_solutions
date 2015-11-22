public class NonMetalElement extends Element
{
   public NonMetalElement(String s, int an, double aw)
   {
      super(s, an, aw);
   }
   public void describeElement()
   {
      System.out.println("A nonmetal, like " + getSymbol() +
        " with atomic number " + getAtomicNumber() +
        " and an atomic weight of " + getAtomicWeight() +
        "\n    is a poor conductor of electricity");
   }
}
