public class MetalElement extends Element
{
   public MetalElement(String s, int an, double aw)
   {
      super(s, an, aw);
   }
   public void describeElement()
   {
      System.out.println("A metal, like " + getSymbol() +
        " with atomic number " + getAtomicNumber() +
        " and an atomic weight of " + getAtomicWeight() +
        "\n    is a good conductor of electricity");
   }
}
