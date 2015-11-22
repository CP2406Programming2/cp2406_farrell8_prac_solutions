public class ElementArray
{
   public static void main(String[] args)
   {
      Element elements[] = new Element[5];
      int i;
      elements[0] = new MetalElement("Au", 79, 197.0);
      elements[1] = new NonMetalElement("He", 2, 4.003);
      elements[2] = new MetalElement("Ag", 47, 107.9);
      elements[3] = new NonMetalElement("Ne", 1029, 20.18);
      elements[4] = new MetalElement("Cu", 29, 63.55);
      for(i = 0; i < elements.length; ++i)
         elements[i].describeElement();
   }
}